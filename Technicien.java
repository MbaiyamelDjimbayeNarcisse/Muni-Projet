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
public class Technicien extends Employe {
    public final static int ValeurUnité=5;
    public int NbreUnitePro;
    
  public Technicien(String nomE,String prenomE,int ageE,String dateEntreeE,String matriculeE,int NbreUnitePro){
      super(nomE,prenomE,ageE,dateEntreeE,matriculeE);
      this.NbreUnitePro=NbreUnitePro;
  }
  public double calculSalaire(){
    return (ValeurUnité*NbreUnitePro);  
  }
    
    
}
