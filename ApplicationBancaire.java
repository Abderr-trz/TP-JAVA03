public class ApplicationBancaire {
     
    public final static int NB_CLIENTS = 4;
    private static double soldeTotalClient ;
    public static void main(String[] args) {

        //Creation d'une seule agence bancaire
        Agence lAgence = new Agence("Inezegane , Eljihadiya , Immeuble Assalam N15");

        //Creation d'un tableau composé de 4 clients
        Client LesClients[] = new Client[NB_CLIENTS] ;
        LesClients[0]=new Client("Tarzoukt", "Abderrahim", "Inezgane", lAgence);
        LesClients[1]=new Client("ELGRHIYATI", "Ayman", "Ait Melloul", lAgence);
        LesClients[2]=new Client("Elassali", "Kawtar", "Dcheira", lAgence);
        LesClients[3]=new Client("Mjahed", "Ouael", "Dakhla", lAgence);

        // Client 1
        LesClients[0].addCompte(new CompteEpargne(1000));
        // Client 2
        LesClients[1].addCompte(new ComptePayant(2500));
        // Client 3
        LesClients[2].addCompte(new ComptePayant(0));
        LesClients[2].addCompte(new ComptePayant(3000));
        // Client 4
        LesClients[3].addCompte(new CompteEpargne(2300));
        LesClients[3].addCompte(new ComptePayant(0));
        
        // Deposer de l'argent
        if(LesClients[0].getCompte(0) != null) {
            LesClients[0].getCompte(0).deposer(1000);
        } else {
            System.out.println("Ce compte n'existe pas");
        }

        if (LesClients[3].getCompte(1) != null) {
            LesClients[3].getCompte(1).retirer(1000);
        } else {
            System.out.println("Ce compte n'existe pas");
        }

        // Ajout des clients et ses comptes a l'agence
        for(int i = 0; i < LesClients.length; i++) {
            lAgence.addClient(LesClients[i]);
        }
        
        // Application de la méthode calculInteret() sur tous les comptes d'épargne
        for(int i = 0; i < Agence.getnbClients(); i++) {
            for(int j = 0; j < lAgence.getClient(i).getnbCompte(); j++) {
                if (lAgence.getClient(i).getCompte(j) instanceof CompteEpargne) {
                    ((CompteEpargne)lAgence.getClient(i).getCompte(j)).CalculInteret();
                }
            }
        }
         /*** Affichage ***/

        // Liste des différents clients avec leurs différents comptes

        System.out.println("Liste des differents clients avec leurs differents comptes ");

        for(int i = 0; i < Agence.getnbClients(); i++) {
            System.out.println(lAgence.getClient(i).toString());
        }

        // Liste des comptes d'épargne de l'agence

        System.out.println("\n Liste des comptes d'epargne de l'agence");

        for(int i = 0; i < Agence.getnbClients(); i++) {
            for(int j = 0; j < lAgence.getClient(i).getnbCompte(); j++) {
                if (lAgence.getClient(i).getCompte(j) instanceof CompteEpargne) {
                    System.out.println(lAgence.getClient(i).getCompte(j).toString());
                }
            }
        }

        // Liste des comptes payants de l'agence

        System.out.println("\n Liste des comptes payants de l'agence ");

        for(int i = 0; i < Agence.getnbClients(); i++) {
            for(int j = 0; j < lAgence.getClient(i).getnbClients(); j++) {
                if (lAgence.getClient(i).getCompte(j) instanceof ComptePayant) {
                    System.out.println(lAgence.getClient(i).getCompte(j).toString());
                }
            }
        }
        // Le solde total des comptes d’un client
        System.out.println("\n Solde total des comptes d'un client :");

            for (int i = 0; i < Agence.getnbClients(); i++) {
                 soldeTotalClient = LesClients[i].getSoldeTotal();
                System.out.println("Client " + LesClients[i].getNom() + " : " + soldeTotalClient + " DH");
            }
       
        
    }
}   