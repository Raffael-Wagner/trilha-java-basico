package edu.raffael.javaExercicios;
/**
 *
 * @author Pichau
 */
public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
    public void aumentaCanal(){
        canal++;
    }
    public void diminuiCanal(){
        canal--;
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}
