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
public class ManutentionnaireRisque extends Manutentionnaire implements ZoneRisques{
    public ManutentionnaireRisque(String nomE,String prenomE,int ageE,String dateEntreeE,String matriculeE,int NbreUnite){
    super(nomE,prenomE,ageE,dateEntreeE,matriculeE,NbreUnite);
    }
    public double calculSalaire(){
     return (PrixHeure*NbreHeureTrav);
   }
    
}
