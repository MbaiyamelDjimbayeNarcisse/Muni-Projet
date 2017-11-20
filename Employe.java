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
public abstract class Employe {
    public String nomE;
    private String prenomE;
    private int ageE;
    private String dateEntreeE;
    private String matriculeE;
  public Employe(String nomE,String prenomE,int ageE,String dateEntreeE,String matriculeE){
  this.nomE=nomE;
  this.prenomE=prenomE;
  this.ageE=ageE;
  this.dateEntreeE=dateEntreeE;
  this.matriculeE=matriculeE;
  }
  public abstract double calculSalaire();
  
  public String getNom(){
      String Str;
      return Str= "l'employe "+prenomE+" "+nomE;
  }
}
