
public class EtudaintInitial extends Etudiant {
	int tauxDePr�sence;

	EtudaintInitial(String nom, double[] note,int tauxDePr�sence) {
		super(nom, note);
		this.tauxDePr�sence = tauxDePr�sence;
		
	}

	void r�sultatAnn�e() {
		if (moy >= 10 && tauxDePr�sence>10) {
          System.out.println("R�sultat final: admis");			
		}else {
	      System.out.println("R�sultat final: non admis");
		}
	}

	void tauxDePr�sence() {
    	System.out.println("taux de pr�sence: "+ tauxDePr�sence);
    	
    }

}
