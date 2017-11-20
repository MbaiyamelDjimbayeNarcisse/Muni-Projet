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
public class Manutentionnaire extends Employe {
    public final static int PrixHeure=65;
    public int NbreHeureTrav;
    
   public Manutentionnaire(String nomE,String prenomE,int ageE,String dateEntreeE,String matriculeE,int NbreHeureTrav){
      super(nomE,prenomE,ageE,dateEntreeE,matriculeE);
      this.NbreHeureTrav=NbreHeureTrav;
  }
   public double calculSalaire(){
     return (PrixHeure*NbreHeureTrav);
   }
}
