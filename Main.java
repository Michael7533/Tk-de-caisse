package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // On déclare un scanner pour lire les entrées de la console
        Scanner sc = new Scanner(System.in);

        // definir le nombre de lignes - nblignes -

        System.out.println(" ");
        System.out.println("*************************************");
        System.out.println(" ");
        System.out.println("Nouveau ticket");
        System.out.println(" ");
        System.out.println("indiquez le nombre de lignes de l'addition");

        int nblignes = sc.nextInt();
        sc.nextLine();


        // définir le montant total de l'addition -total-

        float total = 0;

       // definir le tableau des plats -tplat-

        String tplat[] = new String[nblignes];

        // definir le tableau des prix -tprix-

        float tprix[] = new float[nblignes];

        // definir le tableau des quantités -tqt-

        int tqt[] = new int[nblignes];

        // definir le compteur d'index des tableaux -i-

        int i = 0;


        // consever le nombre de lignes pour le ticket -nbfinlignes

        int nbfinlignes = nblignes;

        // début de la boucle

        nblignes = (nblignes - 1);

        while (nblignes>= 0)
        {
            // On demande le nom du plat -plat-

            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" **********");
            System.out.println(" ");
            System.out.println("Entrez le nom de l'article : ");
            String plat = sc.nextLine();

            // On demande la quantité de plats -qt-

            System.out.println("indiquez le nombre de " + plat);
            int qt = sc.nextInt();
            sc.nextLine();

            // on demande le prix unitaire du plat -prix-

            System.out.println("indiquez le prix unitaire de " + plat);
            float prix = sc.nextFloat();
            sc.nextLine();

            // On donne le total de la ligne -ttligne-

            float ttligne = prix * qt;
            System.out.println("            le total pour cet article est de " + ttligne + "Eur");
            System.out.println(" ");

            // decompter la ligne;

            nblignes = nblignes - 1;

            // incrementer le total

            total = total + ttligne;

            // enregistrer dans le tableau

            tplat[i] = plat;
            tqt[i]=qt;
            tprix[i]=prix;

            // incrementer l'index'

            i = (i+1);

        }
            // numero de ligne sur l'addition - nl-
        int nl =0 ;

            // preparation du ticket

        System.out.println(" __________________________________________");
        System.out.println(" ____________Restau SIMPLON _______________");
        System.out.println(" __________________________________________");
        System.out.println(" __________________________________________");
        System.out.println(" ");

        // affiche la date et heure

        DateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println(format.format(date));

        System.out.println(" ");

            // restitue les lignes

            for(int j=0 ; j < tplat.length; j++)
        {
            nl = (nl + 1);


            System.out.printf( " %d. %-15s Quantité: %d  \n                    PU: %.2f Eur  \n                    sous-total : %.2f Eur \n", nl , tplat[j] ,tqt[j] , tprix[j] , (tqt[j]*tprix[j]));
            System.out.println(" ");
        }

        // restitue le total de l'addition:
        System.out.println(" ");
        System.out.println(" ________________________________________");
        System.out.println(" ");
        System.out.println("                    Total TTC: " + total + " Eur");
        System.out.println(" ");
        System.out.println(" Merci et à bientôt");
        System.out.println(" ________________________________________");



        // On ferme le scanner
        sc.close();
    }
}
