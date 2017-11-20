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
public class Commercial extends Employe {
   public double ChiffreDaffair,Bonus,salaire;


   public Commercial(String nomE,String prenomE,int ageE,String dateEntreeE,String matriculeE,double ChiffreDaffair,double Bonus){
       super(nomE,prenomE,ageE,dateEntreeE,matriculeE);
       this.ChiffreDaffair=ChiffreDaffair;
       this.Bonus=Bonus;
   }
   
    public double calculSalaire(){
        return salaire;
  }
}