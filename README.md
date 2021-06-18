
# Calculer la moyenne des étudiants 

Dans ce projet on a deux types d'étudiants, ceux en formation initiale et les apprentis.
La question qui se pose c'est comment Calculer leur moyenne universitaire anisi qur leur résultats d'admissions?
les étudiants en générale sont caractirisés par: le nom et la note universitaire.
En plus de ça:

  - Les étudiants en formation initiale sont caractérisés par un taux d’absence. Ils sont déclarés admis si leur moyenne universitaire est >=10 et si leur taux d’absence est <10%.  
  - Les apprentis sont dans une entreprise donnée par son nom et ont une note supplémentaire « note pratique ». Leur moyenne de l’année est la moyenne de la moyenne universitaire et de cette note pratique. Un apprenti est déclaré admis si sa moyenne de l’année est >=10.

  #
  Donc pour résoudre ce problème on va créer 4 classes en java:
   - Classe Etudiant, en la dotant des propriètés précédentes (non, note universitaire), et methode pour calculer la moyenne et afficher les résultats.
   - Deux classes EtudiantInitial et Apprenti héritant de la classe Etudiant.
   - La classe Relever c'est la classe main pour éxécuter le programme.

  


## L'affichage du programme

A la fin on obtient les éditions suivantes:

![App Screenshot](https://raw.githubusercontent.com/imenebaraitame/Exercice1-java/master/affichage.png)

  