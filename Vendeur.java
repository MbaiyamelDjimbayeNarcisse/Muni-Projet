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
public class Vendeur extends Commercial {
    
    private final static int BonusVendeur=100;
    public Vendeur(String nomE,String prenomE,int ageE,String dateEntreeE,String matriculeE,double ChiffreDaffair,double Bonus){
       
        super(nomE,prenomE,ageE,dateEntreeE,matriculeE,ChiffreDaffair,Bonus);
     }
    public double calculSalaire(){
        
        return(0.2*ChiffreDaffair)+BonusVendeur;
    }
}
