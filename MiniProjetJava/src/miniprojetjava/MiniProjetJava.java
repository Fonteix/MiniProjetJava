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
        String nomFilm, support = "", actPrinc, annee, realisateur, description, filmselect, nomClient, prenomClient, mailClient, clientSelect;
        boolean clientExist;
        
        List<film> listeFilm = new ArrayList<film>();
        List<client> listeClient = new ArrayList<client>();
        
        
        //Liste de film exemple pour ne pas avoir à re-remplir à chaque test
        listeFilm.add(new film("Avatar", true, "Brad", "2000", "Cameron", "USB", ""));
        listeFilm.add(new film("Titanic", true, "Depp", "2010", "Speilbarg", "USB", ""));
        listeFilm.add(new film("Taxi", true, "Danny", "2012", "Eastwood", "K7", ""));
        
        listeClient.add(new client("Dupond", "Jean", "jean.deupond@mail.com"));
        listeClient.add(new client("Jaquet", "Pierre", "Maurice.Jaquet@mail.com"));
        
        
        do {
            System.out.println("Saisir une option : ");
            System.out.println("Choix 0 : Fin du programme");
            System.out.println("Choix 1 : Ajouter un film");
            System.out.println("Choix 2 : Rechercher un film");
            System.out.println("Choix 3 : Afficher les films disponibles");
            System.out.println("Choix 4 : Afficher les films par support");
            System.out.println("Choix 5 : Supprimer un film par le nom");
            System.out.println("Choix 6 : Afficher tous les films");
            System.out.println("Choix 7 : Ajouter client");
            System.out.println("Choix 8 : Afficher liste de client");
            System.out.println("Choix 9 : Ajouter film à un client");
            System.out.println("Choix 10 : Afficher tous les films d'un client");
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
                        
                        listeFilm.add(new film(nomFilm, true, actPrinc, annee, realisateur, support, description));
                        break;
                        
                        
                    case 2: //recherche un film
                        System.out.println("Saisir nom film : ");
                        nomFilm = scanner.nextLine();
                        
                        for (film filmListe : listeFilm) {                            
                            if (filmListe.GetNom().equals(nomFilm)) {
                                filmselect=filmListe.FilmToString();
                                System.out.println(filmselect);
                            }
                        }
                        System.out.println("\nAppuyez sur une touche pour continuer");
                        System.in.read();
                        break;
                        
                        
                    case 3 : //afficher tous les film dispo
                        for (film filmListe : listeFilm) {
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
                        
                        for (film filmListe : listeFilm) {
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
                        for (film filmListe : listeFilm) {
                            if (filmListe.GetNom().equals(nomFilm)) {
                                listeFilm.remove(filmListe);
                            }
                        }
                        System.out.println("\nAppuyez sur une touche pour continuer");
                        System.in.read();
                        break;
                        
                        
                    case 6 : //afficher tous les films
                        for (film filmListe : listeFilm) {
                            filmselect = filmListe.FilmToString();
                            System.out.println(filmselect);
                        }
                        System.out.println("\nAppuyez sur une touche pour continuer");
                        System.in.read();
                        break;
                    
                        
                    case 7 : //ajouter client
                        System.out.println("Saisir nom client : ");
                        nomClient = scanner.nextLine();
                        
                        System.out.println("Saisir prenom client : ");
                        prenomClient = scanner.nextLine();
                        
                        System.out.println("Saisir mail client : ");
                        mailClient = scanner.nextLine();
                        
                        listeClient.add(new client(nomClient, prenomClient, mailClient));
                        break;
                        
                     case 8 : //afficher tous les clients
                        for (client clientListe : listeClient) {
                            clientSelect = clientListe.ClientInfo();
                            System.out.println(clientSelect);
                        }
                        System.out.println("\nAppuyez sur une touche pour continuer");
                        System.in.read();
                        break;
                        
                        
                    case 9 : //ajouter film à un client
                        clientExist = false;
                        do {
                            System.out.println("Saisir nom client : ");
                            nomClient = scanner.nextLine();
                            //vérification si le client existe
                            for (client clientListe : listeClient) {
                                if (clientListe.GetNom().equals(nomClient)) {
                                    clientExist = true;
                                }
                            }
                        } while (clientExist == false);
                        
                        System.out.println("Saisir nom film : ");
                        nomFilm = scanner.nextLine();
                        
                        for (client clientListe : listeClient) {
                            if (clientListe.GetNom().equals(nomClient)) {
                                clientListe.AddFilm(nomFilm);
                            }
                        }
                        break;
                        
                    case 10 : //Afficher film client
                        System.out.println("Saisir nom client : ");
                        nomClient = scanner.nextLine();
                        
                        System.out.println("Liste des films de " + nomClient);
                        for (client clientListe : listeClient) {
                            if (clientListe.GetNom().equals(nomClient)) {
                                System.out.println(clientListe.AfficherFilm());
                            }
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
