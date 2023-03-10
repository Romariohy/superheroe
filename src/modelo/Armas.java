
package modelo;

public class Armas {
private String nom_arma;
    private int dano_arma;
    public Armas (String nom_arma, int dano_arma){
      this.nom_arma=nom_arma;
      this.dano_arma=dano_arma;
    }
    public String getnom_arma(){
        return nom_arma;
    }
    public int getdano_arma(){
        return dano_arma;
    }
    public void setnom_arma(String nom_arma){
        this.nom_arma=nom_arma;
    }
    public void setdano_arma(int dano_arma){
        this.dano_arma=dano_arma;
    }   
}
