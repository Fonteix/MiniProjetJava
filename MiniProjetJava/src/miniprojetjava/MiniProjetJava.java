package miniprojetjava;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import miniprojetjava.film;

public class MiniProjetJava {

    public static void main(String[] args) throws IOException {
        
        Scanner scanner = new Scanner( System.in );
        int choix, cpt;
        String nomFilm, support = "", actPrinc, annee, realisateur, description;
        String filmselect;
        List<film> liste = new ArrayList<film>();
        
        do {
        System.out.println("Saisir une option : ");
        System.out.println("Choix 0 : Fin du programme");
        System.out.println("Choix 1 : Ajouter un film");
        System.out.println("Choix 2 : Rechercher un film");
        System.out.println("Choix 3 : Afficher les films disponibles");
        System.out.println("Choix 4 : Afficher les films par support");
        System.out.println("Choix 5 : Supprimer un film par le nom");
        System.out.println("Choix 6 : Afficher tous les films");
        choix = scanner.nextInt();
        scanner.nextLine();
        
            switch (choix) {
                    case 0 : //fin du prog
                        break;
                        
                    case 1 : //Ajouter un film
                        do {
                            System.out.println("Saisir nom film : ");
                            nomFilm = scanner.nextLine();
                        } while (nomFilm.equals(""));
                        
                        System.out.println("Saisir acteur principal film : ");
                        actPrinc = scanner.nextLine();
                        
                        System.out.println("Saisir année : ");
                        annee = scanner.nextLine();
                        
                        System.out.println("Saisir realisateur film : ");
                        realisateur = scanner.nextLine();
                        
                        System.out.println("Saisir description film : ");
                        description = scanner.nextLine();
                        
                        do {
                            System.out.println("Saisir support film (K7, USB, blue-ray, DVD) : ");
                            support = scanner.nextLine();
                        } while (!support.equals("K7") && !support.equals("USB") && !support.equals("blue-ray") && !support.equals("DVD"));
                        
                        liste.add(new film(nomFilm, true, actPrinc, annee, realisateur, support, description));
                        break;
                        
                        
                    case 2: //recherche un film
                        System.out.println("Saisir nom film : ");
                        nomFilm = scanner.nextLine();
                        
                        for (film filmListe : liste) {                            
                            if (filmListe.GetNom().equals(nomFilm)) {
                                filmselect=filmListe.FilmToString();
                                System.out.println(filmselect);
                            }
                        }
                        System.out.println("\nAppuyez sur une touche pour continuer");
                        System.in.read();
                        break;
                        
                        
                    case 3 : //afficher tous les film dispo
                        for (film filmListe : liste) {
                            if (filmListe.GetDispo() == true) {
                                System.out.println(filmListe.GetNom());
                            }
                        }
                        System.out.println("\nAppuyez sur une touche pour continuer");
                        System.in.read();
                        break;
                        
                        
                    case 4 : //Afficher film par supp
                        do {
                            System.out.println("Saisir support film (K7, USB, blue-ray, DVD) : ");
                            support = scanner.nextLine();
                        } while (!support.equals("K7") && !support.equals("USB") && !support.equals("blue-ray") && !support.equals("DVD"));
                        
                        for (film filmListe : liste) {
                            if (filmListe.GetSupp().equals(support)) {
                                System.out.println(filmListe.GetNom());
                            }
                        }
                        System.out.println("\nAppuyez sur une touche pour continuer");
                        System.in.read();
                        break;
                        
                        
                    case 5 : //supprimer film
                        System.out.println("Saisir nom film : ");
                        nomFilm = scanner.nextLine();
                        
                        cpt = 0;
                        for (film filmListe : liste) {
                            //cpt++;
                            if (filmListe.GetNom().equals(nomFilm)) {
                                //liste.remove(cpt);
                                liste.remove(filmListe);
                            }
                        }
                        System.out.println("\nAppuyez sur une touche pour continuer");
                        System.in.read();
                        break;
                        
                        
                    case 6 : //afficher tous les films
                        for (film filmListe : liste) {
                            filmselect = filmListe.FilmToString();
                            System.out.println(filmselect);
                        }
                        System.out.println("\nAppuyez sur une touche pour continuer");
                        System.in.read();
                        break;
                    default:
                        System.out.println("Erreur de saisie");                        
                        break;
            }
        } while(choix != 0);   
    }    
}
