namespace AppTabVilles
{
    class Program
    {
        static void Main(string[] args)
        {
            // Initialisation du tableau
            string[] tabVilles = new string[] { "Paris", "Marseille", "Lyon", "Deauville", "Lorient", "Brest", "Lille", "Bordeaux" };

            // Demande à l'utilisateur de saisir un nombre
            Console.Write("Entrez un nombre de 0 à 7 : ");
            int choixNombre = int.Parse(Console.ReadLine());

            // Gestion d'erreur : index en dehors du tableau
            if (choixNombre >= 8){
                Console.WriteLine("Veuillez rentrer un nombre inférieur à 8 !");
            }

            // Après la vérification
            else{
                Console.WriteLine("Dans le tableau, le nombre " + choixNombre + " vaut : " + tabVilles[choixNombre]);
            }
        }
    }
}