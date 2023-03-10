
package modelo;

public class Heroe {
        private String nom_heroe;
        private int salud;
          public Heroe (String nom_heroe, int salud){ 
          this.nom_heroe=nom_heroe;
          this.salud=salud;
          
          }
public Heroe(){}
public int getsalud(){
        return salud;
}
public String getnom_heroe(){
        return nom_heroe;
}
public void setsalud(int salud){
    this.salud=salud;
}
public void setnom_heroe(String nom_heroe){
        this.nom_heroe=nom_heroe;
    }
          

        }
