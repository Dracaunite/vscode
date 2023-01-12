namespace AppMultiplications
{
    class Program
    {
        static void Main(string[] args)
        {
            // Définitions des variables
            int intColonnes, intLignes;

            // Saisies des variables
            Console.Write("Nombres de colonnes");
            intColonnes = int.Parse(Console.ReadLine());
            Console.Write("Nombres de lignes");
            intLignes = int.Parse(Console.ReadLine());

            // Boucle
            for (int i = 1; i <= intColonnes; i++)
            {
                for(int j = 1; j <= intLignes; j++)
                {
                    Console.WriteLine("");
                }
            }
        }
    }
}