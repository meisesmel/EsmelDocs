Activitats de recerca:

Buscar quines són les principals versions de UML publicades fins la més actual i de quin any són.
En 1997 apareció la primera versión, la 1.0 y también la versión 1.1.
En 1999 apareció la versión 1.2.
En 2005 apareció la version 2.0.
En 2009 apareció la versión 2.2.
En 2017 apareció la versión 2.5.1.

Qui va crear UML?

Grady Booch, Ivar Jacobson y Jim Rumbaugh.

Què és Rational Rose?

Es una herramienta de diseño orientada a objetos, esta permite representar gráficamente el sistema.

Què té que veure Rational Rose amb UML?
Rational Rose usa UML para poder modelar el software.

Quan va ser publicada UML per la International Organization for Standardization (ISO)?
Fue publicada la versión 1.4.2 para la ISO en el año 2005.

Què vol dir OMG?
Object Management Group, estandariza al Object Modelling con todas sus formas.

Què té que veure OMG amb UML?
Es responsable de mantener UML desde que se convirtió en un estándar.






1.							 
	

2.

3.


4.





1.


2.

3.

4.

5.



1.

2.






3.

4.


5.

6. 


7.


8.




1.

2.

3.

4.

5.




1.

2.

3.

4.

5.


1.

2.

3.






1.

package activitatInterficies;


public interface Motor {
   public abstract String encenderse ();
   public abstract String apagarse ();
   public abstract String estropearse ();
}


package activitatInterficies;


public class Coche implements Motor{
   @Override
   public String encenderse() {
       return null;
   }


   @Override
   public String apagarse() {
       return null;
   }


   @Override
   public String estropearse() {


       return null;
   }
}



2.

package activitatInterficies;


public interface Ram {
   public abstract double velocidad(double hz, double segundos);


}


package activitatInterficies;


public class Pc implements Ram{
   @Override
   public double velocidad(double hz, double segundos) {
       return hz*segundos;
   }
}






package activitatInterficies;


public interface publicacion
{
   public abstract int likes(int numLikes);
   public abstract int comentario(int numComent);
   public abstract int seguidores (int numSeguidores);
}

package activitatInterficies;


public class Instagram implements publicacion{
   @Override
   public int likes(int numLikes) {
       return numLikes;
   }


   @Override
   public int comentario(int numComent) {
       return numComent;
   }


   @Override
   public int seguidores(int numSeguidores) {
       return numSeguidores;
   }
}


Utilitzar diagrames de classe per generar codi.
Formes:





Estudiant:




Escogí modificar contacto en vez de eliminar contacto:

5.

6.

Escogí modificar contacto:
package codisSaber.LlistaDeCOntactes;


public class Main {
   public static void main(String[] args) {


       llistaContactes l = new llistaContactes();
       contacte c = new contacte("Xavi","Sancho",555443322,"Carrer de París, 4-1",  84381,"Barcelona");
       l.afegirContacte(c);
       l.imprimirContacte("Xavi");


       contacte c2 = new contacte("María", "Esmel", 4982792, "Florain Rey", 897342, "Tortosa");
       c2.demanarDadesContacte("María");
       l.afegirContacte(c2);
       l.imprimirContacte(c2.getNom());


       c2.modificarDadesContacte("Ana", "Montserrat", 4982792, "Florian Rey", 897342, "Tortosa");
       l.imprimirContacte("Ana");
   }
}

package codisSaber.LlistaDeCOntactes;


class contacte {
   public String nom;
   public String cognoms;
   public int telefon;
   public String adreca;
   public int CP;
   public String ciutat;


   public contacte(String nom, String cognom, int telefon, String adreca, int CP, String ciutat) {
       this.nom = nom;
       this.cognoms = cognom;
       this.telefon = telefon;
       this.adreca = adreca;
       this.CP = CP;
       this.ciutat = ciutat;
   }
   public void demanarDadesContacte(String nom){
       System.out.println("Introdueix les dades del contacte");
       System.out.println("Nom: ");
       this.nom = System.console().readLine();
       System.out.println("Cognoms: ");
       this.cognoms=System.console().readLine();
       System.out.println("Telefon: ");
       this.telefon= Integer.parseInt(System.console().readLine());
       System.out.println("Adreça: ");
       this.adreca=System.console().readLine();
       System.out.println("CP: ");
       this.CP=Integer.parseInt(System.console().readLine());
       System.out.println("Ciutat: ");
       this.ciutat=System.console().readLine();


   }
   public void modificarDadesContacte(String nom, String cognoms, int telefon,String adreca, int CP, String ciutat){
       this.nom = nom;
       this.cognoms = cognoms;
       this.telefon = telefon;
       this.adreca = adreca;
       this.CP = CP;
       this.ciutat = ciutat;


       }


   public String getNom() {
       return nom;
   }


   public void setNom(String nom) {
       this.nom = nom;
   }


   public String getCognoms() {
       return cognoms;
   }


   public void setCognoms(String cognoms) {
       this.cognoms = cognoms;
   }


   public int getTelefon() {
       return telefon;
   }


   public void setTelefon(int telefon) {
       this.telefon = telefon;
   }


   public String getAdreca() {
       return adreca;
   }


   public void setAdreca(String adreca) {
       this.adreca = adreca;
   }


   public int getCP() {
       return CP;
   }


   public void setCP(int CP) {
       this.CP = CP;
   }


   public String getCiutat() {
       return ciutat;
   }


   public void setCiutat(String ciutat) {
       this.ciutat = ciutat;
   }
}


8.

package codisSaber.exercici8;


import java.util.ArrayList;
import java.util.Date;


public class autor {
   public String nom;}


class llibre {
   public String ISBN;
   public ArrayList<autor> Autors;
   public String nom;
   public int quantitat;}


class prestec {
   public llibre llibrePestec;
   public Date dataPrestec;}


interface persona {
   public String ciutat = "Tortosa";
   String cognoms = "Esmel";
   int telefon = 384789645;
   int CP = 43580;
   String dni = "María";
   String adreca = "Comuneros de Castilla";
   String nom = "María";}


class usuariBiblioteca implements persona {
   public ArrayList<prestec> prestecs;
   public int numSoci;
   public void tornarLlibre() {}
   public void comprovarVencimentPrestecs() {}
   public void agafarLlibre() {    }
}

