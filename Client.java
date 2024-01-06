import java.util.Arrays;

public class Client {
   public final int NB_MAX_COMPTE = 4;
   private int code ; 
   private String nom ; 
   private String prenom ; 
   private String adresse ; 
   private Agence monAgence ; 
   private Compte mesComptes[] ;

   private int nbComptes = 0 ; 
   private static int nbClients = 0;
   private static double soldeTotal = 0.0;
     

   public Client(String nom, String prenom , String adresse , Agence agence) {
      code = ++ nbClients ;
      this.nom = nom ; 
      this.prenom = prenom ; 
      this.adresse = adresse ;
      this.monAgence = agence ;
      mesComptes = new Compte[NB_MAX_COMPTE] ; 
   }


    public void addCompte(Compte c){
        if(nbComptes < NB_MAX_COMPTE)
            mesComptes[nbComptes++]=c;
        else System.out.println("Vous avez atteindre le nombre max du comptes que vous pouvez avoir");
    }

    public void deposer(int nCompte , double montant){
        mesComptes[nCompte].deposer(montant) ;
    }
    public void retirer(int nCompte  , double montant){
        mesComptes[nCompte].retirer(montant);
    }

    public Compte getCompte(int n ){
        return mesComptes[n];
    }
    public int getCode(){
        return code ; 
    }
    public String getNom(){
        return nom ;
    }
    public String getPrenom(){
        return prenom ;
    }
    public String getAdresse(){
        return adresse ;
    }
    public Agence getMonAgence(){
        return monAgence ;
    }
    public int getnbClients(){
        return nbClients;
    }
    public double getSoldeTotal() {    
        for (int i = 0; i < getnbCompte(); i++) {
            soldeTotal += getCompte(i).getSolde();
        }
        return soldeTotal;
    }
    public void setAdresse(String adresse) {
        this.adresse=adresse;
    }
    public void setMonAgence(Agence monAgence){
        this.monAgence=monAgence;
    }
    public int getCompte(){
        return nbComptes;
    }
    public int getnbCompte(){
        return nbComptes;
    }
    @Override 
    public String toString (){
       return "Client{" +
       "code=" + code +
       ", nom='" + nom + '\'' +
       ", prenom='" + prenom + '\'' +
       ", adresse='" + adresse + '\'' +
       ", mesComptes=" + Arrays.toString(mesComptes) +
       '}';  
    }
   





}
