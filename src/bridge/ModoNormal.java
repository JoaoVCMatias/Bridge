/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridge;

/**
 *
 * @author joaov
 */
public class ModoNormal implements Modo {
    public Carro carro;

		
    public ModoNormal() {}

    public ModoNormal(Carro carro) {
        this.carro = carro;
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
        return "ModoNormal{" + "carro= " + carro + '}';
    }
    
 
    
}
