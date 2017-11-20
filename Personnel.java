/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniprojet;

/**
 *
 * @author ACER
 */
public class Personnel {
    private Employe[] Travailleurs;
    private int NumEmploye;
 private final static int TAILLEMPLOYE = 10;
  public Personnel(){
      Travailleurs= new Employe[TAILLEMPLOYE];
      NumEmploye=0;
  }
  public void ajouterEmploye(Employe E) {
 ++NumEmploye;
 if (NumEmploye <= TAILLEMPLOYE) {
  
  Travailleurs[NumEmploye - 1] = E;
    
 } else {
 System.out.println( "Pas plus de " + TAILLEMPLOYE + " employés");
  }
 }
  public double salaireMoyen() {
 double somme = 0.0;
 for (int i = 0; i < NumEmploye; i++) {
  somme=somme+Travailleurs[i].calculSalaire(); 
  }
 return somme / NumEmploye;
 }
  public void afficherSalaires() {
 for (int i = 0; i < NumEmploye; i++) {
 System.out.println(Travailleurs[i].getNom() + " gagne "
  + Travailleurs[i].calculSalaire() + " francs.");
  }
 }
}

  

