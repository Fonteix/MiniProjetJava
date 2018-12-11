package miniprojetjava;

public class film {
    
    public String nom;
    public boolean dispo;
    public String acteur;
    public String annee;
    public String realisateur;
    public String support;
    public String descriptif;
    
    public String disponible;

    public film (String nom, boolean dispo, String acteur, String annee, String realisateur, String support, String descriptif) {
        this.nom = nom;
        this.dispo = dispo;
        this.acteur = acteur;
        this.annee = annee;
        this.realisateur = realisateur;
        this.support = support;
        this.descriptif = descriptif;
    }

    public String GetNom(){return nom;}
    
    public boolean GetDispo(){return dispo;}
    
    public String GetActeur(){return acteur;}

    public String GetAnnee(){return annee;}

    public String GetReal(){return realisateur;}

    public String GetSupp(){return support;}

    public String GetDesc(){return descriptif;}


    public void SetNom(String nom){this.nom = nom;}

    public void SetDispoTrue(){this.dispo = true;}

    public void SetDispoFalse(){this.dispo = false;}

    public void SetActeur(String acteur){this.acteur = acteur;}

    public void SetAnnee(String annee){this.annee = annee;}

    public void SetReal(String realisateur){this.realisateur = realisateur;}

    public void SetSupp(String support){this.support = support;}

    public void SetDesc(String descriptif){this.descriptif = descriptif;}

    public String FilmToString() {
        if(dispo == true) {
            disponible = "Oui";
        }
        else {
            disponible = "Non";
        }
    	return "\nNom du film : " + nom + "\nActeur : " + acteur + "\nAnnée : " + annee + "\nRéalisateur : " + realisateur + "\nSupport : " + support + "\nDescription : " + descriptif + "\nDisponible : " + disponible;
    }
    public void getDispoString() {
        if(dispo == true) {
            disponible = "Disponible";
        }
        else {
            disponible = "Pas disponible";
        }
    }
}