
public class Apprenti extends Etudiant {
	double notePratique;
 
	Apprenti(String nom, double[] note, double notePratique ) {
		super(nom, note);
		this.notePratique = notePratique;
	}
	
	
double moyenneAnn�e;
	 
  double MoyAnnuelle() {
	return moyenneAnn�e = (moy + notePratique)/2;     
   }
   
   void r�sultatFinal() {
	   if (moyenneAnn�e >= 10) {
		   System.out.println("r�sulat final : admis");
	   }else {
		   System.out.println("r�sultat final : non admis");
	   }
   }
   
   void afficher() {
	   System.out.println("note pratique : "+ notePratique);
	   System.out.println("moyenne Ann�e: "+ moyenneAnn�e);
	   
   }
   
   
}
