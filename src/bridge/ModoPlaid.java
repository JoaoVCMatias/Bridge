/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridge;

/**
 *
 * @author joaov
 */
public class ModoPlaid implements Modo {
    public Carro carro;
    private boolean pilotoAutomatico;

		
    public ModoPlaid() {}

    public ModoPlaid(Carro carro) {
        this.carro = carro;
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
    public void ligarCarro() {
        System.out.println("Bot�o de ligar pressionado");
        carro.partida();
        System.out.println("Vruuuum!!! O possante foi ligado");
    }

    @Override
    public void alterarMarcha(String marcha) {
        carro.setMarcha(marcha);
    }

    @Override
    public void ligarFarol() {
        carro.ligarFarol();
    }

    @Override
    public void desligarFarol() {
        carro.desligarFarol();
    }

    @Override
    public void acelerar() {
        this.carro.acelerar(10);
    }

    @Override
    public void frear() {
        carro.frear(10);
    }

    @Override
    public String toString() {
        return "ModoPlaid{" + "carro=" + carro + ", pilotoAutomatico=" + pilotoAutomatico + '}';
    }

    
    
    
    
    
}
