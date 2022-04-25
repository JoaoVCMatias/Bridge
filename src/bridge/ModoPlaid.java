/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridge;

/**
 *
 * @author joaov
 */
public class ModoPlaid extends ModoNormal {
    private boolean pilotoAutomatico;
    
    public ModoPlaid(Carro carro) {
        super(carro);
    }
    public void ligarPiloto(){
        this.pilotoAutomatico = true;
        System.out.println("Piloto automatico ligado");
    }
    public void desligarPiloto(){
        this.pilotoAutomatico = false;
        System.out.println("Piloto automatico desligado");
    }

    @Override
    public String toString() {
        return "ModoPlaid{" + "carro= " + carro + '}';
    }
    
    
}
