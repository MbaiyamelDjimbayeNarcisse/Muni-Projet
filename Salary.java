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
public class Salary {
    
public static void main(String[] args) {
  Commercial cmr= new Commercial("Narcisse","Mbaiyamel",16,"1996","15A088FS",100,100);
    System.out.println(cmr.getNom() + " Le commerçant A une salaire de zero:");
  Vendeur vdr= new Vendeur("Essi","Tugeze",16,"1996","15A088FS",100,100);
  System.out.println(vdr.getNom() + " Le Vendeur A une salaire de:");
    System.out.println(vdr.calculSalaire());
  Representant rpr= new Representant("Narc","Mbaye",16,"1996","15A088FS",100,200);
    System.out.println(rpr.getNom() + " Le Representant A une salaire de:");
    System.out.println(rpr.calculSalaire());
  Technicien tnc= new Technicien("Mimi","Belle",16,"2000","14E65FS",10);
    System.out.println(tnc.getNom() + " Le Technicien A une salaire de:");
    System.out.println(tnc.calculSalaire());
  Manutentionnaire mnt= new Manutentionnaire("Jac","Ballen",25,"2012","12Ygd'",23);
    System.out.println(mnt.getNom() + "Le Manutentionnaire A une salaire de:");
    System.out.println(mnt.calculSalaire());
  TechnicienRisque trq= new TechnicienRisque("Narcis","Mbaiyamel",16,"1996","15A088FS",6);
    System.out.println(trq.getNom() + " Le TechnicienRisque A une salaire de:");
    System.out.println(trq.calculSalaire());
  ManutentionnaireRisque mrq= new ManutentionnaireRisque("Barby","Mamou",16,"1999","12Ajdg",16);
    System.out.println(mrq.getNom() + " Le ManutentionnaireRisque A une salaire de:");
    System.out.println(mrq.calculSalaire());
    
    

//test Personnel 

   Personnel p = new Personnel();

p.ajouterEmploye(new Vendeur("Ngot","Cj",16,"1996","15A088FS",100,100));
p.ajouterEmploye(new Representant("Ng","Chris",16,"2017","15A088FS",7895,200));
p.ajouterEmploye(new Technicien("Mimi","Belle",16,"2000","14E65FS",10));
p.ajouterEmploye(new Manutentionnaire("Jac","Ballen",25,"2012","12Ygd'",23));
p.ajouterEmploye(new TechnicienRisque("Narcis","Mbaiyamel",16,"1996","15A088FS",6));
p.ajouterEmploye(new ManutentionnaireRisque("Barby","Mamou",16,"1999","12Ajdg",16));
   p.afficherSalaires();
  
      System.out.println("le salaire moyen de la société est "+p.salaireMoyen()+" Franc"); 

}
    
}
