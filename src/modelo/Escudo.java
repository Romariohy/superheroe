
package modelo;
//{}
public class Escudo {
    private String nom_esc;
    private int protec_esc;
    public Escudo (String nom_esc, int protec_esc){
      this.nom_esc=nom_esc;
      this.protec_esc=protec_esc;
    }
    public String getnom_esc(){
        return nom_esc;
    }
    public int getprotec_esc(){
        return protec_esc;
    }
    public void setnom_esc(String nom_esc){
        this.nom_esc=nom_esc;
    }
    public void setprotec_esc(int protec_esc){
        this.protec_esc=protec_esc;
    }
}
