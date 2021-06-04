
public class Apprenti extends Etudiant {
	double notePratique;
 
	Apprenti(String nom, double[] note, double notePratique ) {
		super(nom, note);
		this.notePratique = notePratique;
	}
	
	
double moyenneAnnée;
	 
  double MoyAnnuelle() {
	return moyenneAnnée = (moy + notePratique)/2;     
   }
   
   void résultatFinal() {
	   if (moyenneAnnée >= 10) {
		   System.out.println("résulat final : admis");
	   }else {
		   System.out.println("résultat final : non admis");
	   }
   }
   
   void afficher() {
	   System.out.println("note pratique : "+ notePratique);
	   System.out.println("moyenne Année: "+ moyenneAnnée);
	   
   }
   
   
}
