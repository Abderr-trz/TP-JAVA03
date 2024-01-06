
public class Compte {
    private int code ;
    protected double solde;
    protected Agence lAgence ;
    protected Client Proprietaire ; 

    private static int nbCompte = 0 ; 
    public Compte() {} 
    
    public Compte(double solde ){
        this.solde = solde ; 
        code = ++nbCompte ;
    }
    public Compte(Client Proprietaire, Agence lAgence) {
        this(100.00, Proprietaire, lAgence);
    }
    public Compte(double solde , Client client , Agence agence){
        code = ++nbCompte;
        this.solde = solde;
        this.Proprietaire = client;
        this.lAgence = agence;
    }

    public void deposer(double montant) {
        solde += montant ;
    }

    public void retirer(double montant) {
        if (montant < solde) 
            solde -= montant ;
        else System.out.println("votre solde est insufisant");
    }
    public int getCode(){
        return code ;
    }
     public double getSolde(){
        return solde ;
    }
    public static void setnbCompte (int nbCompte){
        Compte.nbCompte = nbCompte ; 
    }
    public Agence getlAgence (){
        return lAgence  ;
    }
    public Client getProprietaire (){
        return Proprietaire  ;
    }
    @Override 
    public String toString () {
        return "Le compte "+code+" a un solde de :"+solde +" et il est déposé dans l'agence " + lAgence + '}' ; 
    }

}
