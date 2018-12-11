package miniprojetjava;

import java.lang.*;
import java.util.*;
import java.io.*;

public class client
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    public String nom;
    public String prenom;
    public String adressemail;
    String films[] = {"", "", "" , "", ""};
    public int i;
    String listeFilmClient = "";

    public client(String nom, String prenom, String adressemail)
    {
        this.nom = nom;
        this.prenom = prenom;
        this.adressemail = adressemail;

    }

    public String GetNom()
    {
        return nom;
    }

    public String GetPrenom()
    {
        return prenom;
    }

    public String GetAdrM()
    {
        return adressemail;
    }

    public void SetNom(String nom)
    {
        this.nom = nom;
    }

    public void SetPrenom(String prenom)
    {
        this.prenom = prenom;
    }

    public void SetAdrM(String adressemail)
    {
        this.adressemail = adressemail;
    }

    public String ClientHello()
    {
        return ("Bonjour " + prenom);
    }

    public String ClientInfo()
    {
        return ("Nom du client : " + nom + "\n" + "Prenom du client : " + prenom + "\n" + "Adresse Mail : " + adressemail + "\n");
    }

    public void AddFilm(String nomFilm)
    {
        for(i = 0; i<5; i++)
        {
            if(films[i].equals(""))
            {
                films[i]=nomFilm;
                break;
            }
        }
    }

    public void DeleteFilm(String nomFilm)
    {
        for(i = 0; i<5; i++)
        {
            if(films[i].equals(nomFilm))
            {
                films[i]="";
                break;
            }
        }
    }
    
    public String AfficherFilm() {
        for(i = 0; i<4; i++)
        {
            if(!films[i].equals(""))
            {
                listeFilmClient = listeFilmClient + films[i];
                break;
            }
        }
        return listeFilmClient;
    }
}