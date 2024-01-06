public class CompteEpargne extends Compte {

    public final String typeCompteP = "CompteEpargne";
    private double tauxInteret = 6;
 

   public CompteEpargne(double solde){
    super(solde);
   }

   public CompteEpargne(Client Proprietaire , Agence lAgence){
    super(Proprietaire , lAgence) ; 
   }

  public CompteEpargne(double solde , Client client , Agence agence){
    super(solde, client, agence);
  }
  
  public void CalculInteret(){
    super.deposer(getSolde() * tauxInteret / 100);
  }

  public double getTauxInteret(){
    return tauxInteret;
  }
    
  public void setTauxInteret(double tauxInteret){
    this.tauxInteret = tauxInteret ; 
  }
  public String getTypeCompteP() {
    return typeCompteP;
  }
  @Override
    public String toString() {
        return "CompteEpargne{" +
                "solde=" + super.getSolde() +
                ", code=" + super.getCode() +
                '}';
    }
}
