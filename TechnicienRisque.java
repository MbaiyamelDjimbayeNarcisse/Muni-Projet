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
public class TechnicienRisque extends Technicien implements ZoneRisques {
    
    public TechnicienRisque(String nomE,String prenomE,int ageE,String dateEntreeE,String matriculeE,int NbreUnitePro){
      super(nomE,prenomE,ageE,dateEntreeE,matriculeE,NbreUnitePro);
      }
    public double calculSalaire(){
    return(ValeurUnité*NbreUnitePro)+Prime;
    }
}
