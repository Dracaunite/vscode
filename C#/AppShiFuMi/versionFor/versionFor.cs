namespace AppShiFuMi
{
    public class versionFor
    {
        static void Main(string[] args){
            // Variables
            int choixJoueur, choixOrdi, scoreJoueur = 0, scoreOrdi = 0, manche = 0;
            Random aleatoire = new Random();

            Console.WriteLine("##################################");
            Console.WriteLine("# \t Shi \t Fu \t Mi \t #");
            Console.WriteLine("##################################");

            // Nombre de manches
            Console.Write("Nombre de manches : ");
            int nb_manches = int.Parse(Console.ReadLine());

            // Début du jeu
            for (int i = 0; i < nb_manches; i++){
                manche++;

                Console.WriteLine("0 - Quitter");
                Console.WriteLine("1 - Pierre");
                Console.WriteLine("2 - Feuille");
                Console.WriteLine("3 - Ciseaux");

                Console.Write("Votre choix : ");
                choixJoueur = int.Parse(Console.ReadLine());
                choixOrdi = aleatoire.Next(1, 4);

                if (choixJoueur == 0)
                {
                    // Si on rentre valeur 0 (quitter le jeu) la console se ferme.
                    Environment.Exit(0);
                }

                // Gestion d'erreur (nombre invalide) 
                do
                {
                    if (choixJoueur > 3)
                    {
                        Console.WriteLine("Erreur, vous devez saisir une valeur entre 1 et 3.");
                        Console.Write("Votre choix : ");
                        choixJoueur = int.Parse(Console.ReadLine());
                    }
                }
                while (choixJoueur > 3);

                Console.WriteLine("Choix de l'ordinateur : " + choixOrdi);

                // Pierre vs Ciseaux
                if (choixJoueur == 1 && choixOrdi == 3)
                {
                    Console.WriteLine("Vous avez gagné !");
                    scoreJoueur++;
                }

                // Feuille vs Pierre
                else if (choixJoueur == 2 && choixOrdi == 1)
                {
                    Console.WriteLine("Vous avez gagné");
                    scoreJoueur++;
                }

                // Ciseaux vs Feuille
                else if (choixJoueur == 3 && choixOrdi == 2)
                {
                    Console.WriteLine("Vous avez gagné");
                    scoreJoueur++;
                }

                // Cas d'égalité
                else if (choixJoueur == choixOrdi)
                {
                    Console.WriteLine("C'est une manche nulle.");
                }
                
                // Cas de défaites
                else
                {
                    Console.WriteLine("Vous avez perdu !");
                    scoreOrdi++;
                }

                Console.WriteLine("Manche " + manche + " \t \t Scores : \n \t Vous :  " + scoreJoueur + " \t Ordinateur : " + scoreOrdi);
            }

            // Annonce du gagnant
            if (scoreJoueur > scoreOrdi){
                Console.WriteLine("Vous avez gagné le ShiFuMi!");
            }

            else if (scoreJoueur == scoreOrdi){
                Console.WriteLine("Vous êtes à égalité !");
            }

            else{
                Console.WriteLine("L'ordinateur a gagné le ShiFuMi!");
            }
        }
    }
}