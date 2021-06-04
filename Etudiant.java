import java.util.Arrays;

public class Etudiant {
 String nom;
 double [] note = new double[4];
 
 //Constructeur d'objet étudiant
     Etudiant(String nom, double[]note) {
	 this.nom = nom;
	 this.note= note;
   }
	//methode pour calculer la moyenne
     double moy;
     double moyenne(double[]marks) {
    	  double somme = 0; 
    	 for (int i = 0; i<=3 ;i++) {
    		 somme = somme + note[i];
    	 }
    	   moy = somme/4;
    	 return moy;	 
     }
     
     
    
   //methode pour afficher les résultats.
     void affichage() {
    	 System.out.println("nom étudiant : "+nom);
    	 System.out.println("notes universitaire : "+Arrays.toString(note));
    	 System.out.println("moyenne universitaire : " +moy);
    	 
    	 
    	 
     }
     
}
