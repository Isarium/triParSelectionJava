public class Main {
    public static void main(String[] args) {

        //Déclaration d'un tableau contenant des décimaux positifs et négatifs
        double[] tab = {6.4, 10, -19.7, 4.9, -32.1, 5, 18.6};
        int longueur;
        longueur = tab.length;
        String message= "Le tableau contient "+ longueur + " éléments.";
        System.out.println(message);
        System.out.println();

        //Rechercher de la valeur minimale
      /*  double  valMin = tab[0];
        for (int i = 1; i < longueur; i++) {
                if (tab[i] < valMin) {
                valMin = tab[i];
                }
        }
        System.out.println("La valeur est minimale est " + valMin);

        //Rechercher le rang de la valeur minimale
        int iMin = 0;
        for (int i = 1; i < longueur; i++){
            if (tab[i] < tab[iMin]) {
                iMin = i;
            }
        }
        System.out.println("Le rang de la valeur minimale est "+ iMin);

        //Afficher toutes les valeurs du tableau avec sa position dans le tableau
        for (int i = 0; i < longueur; i++){
            System.out.print(i + " est la position : " + tab[i] + " dans le tableau. ");
        }
        System.out.println();

        //Permuter le plus petit élément qui est à l'index 4 du tableau avec l'index 0
        double tmps = tab[0];//création d'une variable temporaire
        tab[0] = tab[iMin];// Donne la valeur index 4 grâce à iMin ci-dessus
        tab[iMin] = tmps;// Donne à iMin la valeur index 0 de la variable tmps

        //Pour afficher la permutation ci-dessus
        for (int i = 0; i < longueur; i++){
            System.out.print(i + " est la position : " + tab[i] + " dans le tableau. ");
        }
        System.out.println();
        System.out.println();*/


        //Effectuer un tri par sélection la méthode par ordre croissant
        for (int j = 0; j < longueur; j++) {
            int iMin = j;
            //Minimum local
            for (int i = j+1; i < longueur; i++) {
                if (tab[i] < tab[iMin]) {
                    iMin = i;
                }
            }
            //Permutation
            double tmps = tab[j];
            tab[j] = tab[iMin];
            tab[iMin] = tmps;
            //Afficher le tableau
            for (int i = 0; i < longueur; i++) {
                System.out.print(i + " : " + tab[i] + " ");
            }
            System.out.println();

        }

        System.out.println();
        System.out.println();


        //Trier par ordre décroissant
        for (int j = 0; j < longueur; j++) {
            int iMax = j;
            //Minimum local
            for (int i = j+1; i < longueur; i++) {
                if (tab[i] > tab[iMax]) {
                    iMax = i;
                }
            }
            //Permutation
            double tmps = tab[j];
            tab[j] = tab[iMax];
            tab[iMax] = tmps;
            //Afficher le tableau
            for (int i = 0; i < longueur; i++) {
                System.out.print(i + " : " + tab[i] + " ");
            }
            System.out.println();
        }



    }
}