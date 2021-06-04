public class Relever {
		public static void main(String[] args) {
			 
			
			//Create different objects with different attributes
			EtudaintInitial student1 = new EtudaintInitial("Martina", new double[] {11.0,13.0,18.0,7.0}, 95);
			EtudaintInitial student2 = new EtudaintInitial("Dupont" , new double[] {10.0,9.0,8.0,14.0}, 85);
			Apprenti student3 = new Apprenti("Dupuis", new double [] {9.0,9.0,10.0,9.0}, 11.0);
			
			//Perform  moyenne method
			student1.moyenne(new double[]{1.0,1.1,1.2,1.5});
			student2.moyenne(new double[] {12.0,14.2,15.3,14.9});
			student3.moyenne(new double [] {11.2,12.6,14.5,11.0});
			
			//display the results on the screen
			System.out.println("Etudiant en formation initiale");
			student1.affichage();
			student1.résultatAnnée();
			student1.tauxDePrésence();
			
			System.out.println("\n");
			
			System.out.println("Etudiant en formation initiale");
			student2.affichage();
			student2.résultatAnnée();
			student2.tauxDePrésence();
			
			System.out.println("\n");
			
			System.out.println("Etudiant de l'entreprise : EDF");
			student3.affichage();
			student3.MoyAnnuelle();
			student3.afficher();
			student3.résultatFinal();
		    
			
		}
	}

