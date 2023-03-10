
package modelo;

public class Partida {
    private int val_resultado;
    private Heroe atacante;
    private Heroe victima;
    private Escudo escudo;
    private Armas armas;
    public Partida (int val_resultado,Heroe atacante, Heroe victima, Escudo escudo, Armas armas ){ 
        this.armas=armas;
        this.atacante=atacante;
        this.escudo=escudo;
        this.val_resultado=val_resultado;
        this.victima=victima;
    }
    public int getval_resultado(){
        return val_resultado;
    }
    public Heroe getatacante(){
        return atacante;
    }
    public Heroe getvictima(){
        return victima;
    }
    public Escudo getescudo(){
        return escudo;
    }
    public Armas getarmas(){
        return armas;
    }
    public void setval_resultado(int val_resultado){
    this.val_resultado=val_resultado;
    }
    public void setatacante(Heroe atacante){
    this.atacante=atacante;
    }
    public void setvictima(Heroe victima){
    this.victima=victima;
    }
    public void setescudo(Escudo escudo){
    this.escudo=escudo;
    }
    public void setarmas(Armas armas){
    this.armas=armas;
    }
}
