package zoo.tests;

import java.util.ArrayList;

import zoo.modele.Animal;
import zoo.modele.Pays;

public class ZooTest {

	public static void main(String[] args) {
		System.out.println("Instanciation d'une collection de Animal");
		ArrayList<Animal> zoo = new ArrayList<Animal>();
		
		System.out.println("Instanciation de 4 objets Animal ainsi que leur Pays d'origine");
		Pays tanz = new Pays("P001", "Tanzanie");
		Pays ind = new Pays("P002", "Inde");
		Animal animal1 = new Animal("A001", "Girafe", "herbivore",tanz);
		Animal animal2 = new Animal("A002", "Elephant", "herbivore",ind);
		Animal animal3 = new Animal("A003", "Lion", "carnivore",tanz);
		Animal animal4 = new Animal("A004", "Tigre", "herbivore",ind);;
		
		System.out.println("Ajout de 4 objets Animal dans zoo");
		zoo.add(animal1);
		zoo.add(animal2);
		zoo.add(animal3);
		zoo.add(animal4);
		
		System.out.println("Affichage du nombre d'objet dans zoo : " + zoo.size());
		
		System.out.println("Affichage de tous les noms des objets Animal de zoo");
		for(Animal unAnimal : zoo) {
			System.out.println(unAnimal.getNom());
		}
		
		System.out.println("Suppression de l'objet contenu à l'indice 1 --> A002");
		zoo.remove(1);
		
		System.out.println("Affichage du nombre d'objet dans zoo : " + zoo.size());
		
		int condition = 0;
		int index = 0;
		
		while((condition == 0) && (index < zoo.size())) { // On parcourt la collection
			if(zoo.get(index).getCode() == "A001") {
				condition = 1; // On sort de la boucle
				zoo.remove(index);
			}
			index++;
		}
		
		System.out.println("Nombre d'animals dans la liste après l'opération de suppression de l'animal A001 : " + zoo.size()); // Vérification
		
		zoo.add(animal1);
		zoo.add(animal2);
		
		for(Animal unAnimal : zoo) {
			System.out.println("Code de l'animal : " + unAnimal.getCode());
			System.out.println("Nom de l'animal : " + unAnimal.getNom());
			System.out.println("-----------------------------------------");
		}
		
		System.out.println("Animal située à l'indice 0 : " + zoo.get(0).getNom());
		
		zoo.get(0).setNom("Guépard");
		System.out.println("Modification du code de l'Animal situé à l'indice 0 : " + zoo.get(0).getNom());
		
		System.out.println("Animal situé à l'indice 0 --> attendu CodeNew\n");
		System.out.println("Code l'animal : " + zoo.get(0).getCode());
		System.out.println("Nom de l'animal : " + zoo.get(0).getNom());

		System.out.println("\nAnimaux venant de la Tanzanie\n");
		for(Animal unAnimal : zoo) {
			if (unAnimal.getOrigine().getNomPays() == "Tanzanie") {
				System.out.println("Code de l'animal : " + unAnimal.getCode());
				System.out.println("Nom de l'animal : " + unAnimal.getNom());
				System.out.println("-----------------------------------------");
			}
		}
		
		System.out.println("\nAnimaux qui sont carnivores\n");
		for(Animal unAnimal : zoo) {
			if (unAnimal.getAlimentation() == "carnivore") {
				System.out.println("Code de l'animal : " + unAnimal.getCode());
				System.out.println("Nom de l'animal : " + unAnimal.getNom());
				System.out.println("-----------------------------------------");
			}
		}
	}

}
