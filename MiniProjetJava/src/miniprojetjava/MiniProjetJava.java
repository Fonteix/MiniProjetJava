package miniprojetjava;

import java.util.ArrayList;
import java.util.Scanner;
import miniprojetjava.film;

public class MiniProjetJava {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner( System.in );
        int choix;
        ArrayList liste = new ArrayList();
        
        System.out.println("Saisir une option : ");
        System.out.println("Choix 0 : Fin du programme");
        System.out.println("Choix 1 : Ajouter un film");
        System.out.println("Choix 2 : Rechercher un film");
        System.out.println("Choix 3 : Afficher les films disponibles");
        System.out.println("Choix 4 : Afficher les films par support");
        System.out.println("Choix 5 : Supprimer un film par le nom");
        System.out.println("Choix 6 : Afficher tous les films");
        choix = scanner.nextInt();
        
        do {
            switch (choix) {
                    case 0 : //fin du prog

                        break;
                    case 1 : //Ajouter un film
                        System.out.println("Saisir nom film : ");
                        String nomFilm = scanner.nextLine();
                        
                        System.out.println("Saisir acteur principal film : ");
                        String actPrinc = scanner.nextLine();
                        
                        System.out.println("Saisir realisateur film : ");
                        String realisateur = scanner.nextLine();
                        
                        System.out.println("Saisir support film (K7, USB, blue-ray, DVD) : ");
                        String support = scanner.nextLine();
                        
                        liste.add(new film(nomFilm, true, actPrinc, 1926, realisateur, support));
                        
                        break;
                    case 2:
                        //recherche un film
                        break;
                    case 3 : 
                        //afficher film dispo
                        break;
                    case 4 : 
                        //Afficher film par supp
                        break;
                    case 5 :
                        //supp film
                        break;
                    case 6 : //afficher tous les films
                        for(int i = 0; i < liste.size(); i++)
                        {
                          System.out.println(liste.get(i));
                        }
                    default:
                        System.out.println("Erreur de saisie");                        
            }
        } while(choix != 0);
        
        /*
        liste.add(12);
        liste.add("Une chaîne de caractères !");
        liste.add(12.20f);
        liste.add('d');
        
        for(int i = 0; i < al.size(); i++)
        {
          System.out.println("donnée à l'indice " + i + " = " + al.get(i));
        }
*/
        
        
    }
    
}
