package miniprojetjava;

public class client
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    public String nom;
    public String prenom;
    public String adressemail;
    public int maxL;
    
    public client(String nom, String prenom, String adressemail)
    {
        this.nom = nom;
        this.prenom = prenom;
        this.adressemail = adressemail;
        this.maxL = 5;
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
    
    public void SetMaxL(int maxL)
    {
        this.maxL=maxL;
    }
    
    public void ClientHello()
    {
        System.out.println("Bonjour " + prenom);
    }
    
    public void ClientInfo()
    {
        System.out.println("Nom du client : " + nom + "\n" + "Prenom du client : " + prenom + "\n" + "Adresse Mail : " + adressemail + "\n");
    }
}
