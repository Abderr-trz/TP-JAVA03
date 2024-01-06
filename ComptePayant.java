public class ComptePayant extends Compte {
    private final double TAUX_OPERATION = 5 ;
    public final String typeCompteP="ComptePayant" ; 
    

    public ComptePayant(double solde){
        super(solde);
       }
    
       public ComptePayant(Client Proprietaire , Agence lAgence){
        super(Proprietaire , lAgence) ; 
       }
    
      public ComptePayant(double solde , Client client , Agence agence){
        super(solde, client, agence);
      }

    public void deposer (double montant){
        super.deposer(montant+TAUX_OPERATION);
    }
     public void retirer (double montant){
        super.retirer(montant-TAUX_OPERATION);
    }
    public String getTypeCompteP() {
        return typeCompteP;
    }
    @Override
    public String toString(){
        return "ComptePayant{" +
        "solde=" + super.getSolde() +
        ", code=" + super.getCode() +
        '}';
    } 
}
