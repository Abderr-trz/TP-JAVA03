import java.util.Arrays;


public class Agence {
   private int numero ; 
   private String adresse ;
   private Client[] lesClients;
   private Compte[] lesComptes;
   
   private static int nbClients = 0;
   private static int nbAgences = 0;
   private static int nbComptes = 0;


   public final static int NB_MAX_COMPTES = 100;
   public final static int NB_MAX_CLIENTS = 100;

   public Agence (String adresse) {
    numero = ++nbAgences;
    this.adresse = adresse;
    lesClients = new Client[NB_MAX_CLIENTS];
    lesComptes = new Compte[NB_MAX_COMPTES];
}
public void addCompte(Compte c) {
    if(numero < 100)
        lesComptes[nbComptes++] = c;
    else System.out.println("Vous avez atteindre le nombre max du comptes que vous pouvez avoir");
}
public void addClient(Client c) {
    if(nbClients < NB_MAX_CLIENTS)
        lesClients[nbClients++] = c;
    else System.out.println("Vous avez atteindre le nombre max du clients que vous pouvez avoir");
}
public int getNumero() {
   return numero ; 
}
public void setNumero(int numero) {
    this.numero = numero;
}
public String getAdresse() {
   return adresse ; 
}
public void setAdresse(String adresse){
    this.adresse=adresse ; 
}
public Compte getCompte(int n) {
    return lesComptes[n];
}
public Client getClient(int n) {
    return lesClients[n] ; 
}
public static int getnbClients(){
      return nbClients ;
}
public static int getnbCompte(){
    return nbComptes ;
}
public static int getnbAgence(){
    return nbAgences ;
}
@Override
public String toString() {
    return "Agence{" +"numAgence=" + numero 
    +", adresse='" + adresse + '\'' + 
     ", lesClients=" + Arrays.toString(lesClients) + 
     ", lesComptes=" + Arrays.toString(lesComptes) + '}';
}
}