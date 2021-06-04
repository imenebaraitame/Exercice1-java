
public class EtudaintInitial extends Etudiant {
	int tauxDePrésence;

	EtudaintInitial(String nom, double[] note,int tauxDePrésence) {
		super(nom, note);
		this.tauxDePrésence = tauxDePrésence;
		
	}

	void résultatAnnée() {
		if (moy >= 10 && tauxDePrésence>10) {
          System.out.println("Résultat final: admis");			
		}else {
	      System.out.println("Résultat final: non admis");
		}
	}

	void tauxDePrésence() {
    	System.out.println("taux de présence: "+ tauxDePrésence);
    	
    }

}
