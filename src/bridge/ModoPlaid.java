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
    public ModoPlaid(Carro carro) {
        super.carro = carro;
    }
	
    public void aceleracaoPlaid() {
        carro.acelerar(25);
    }
}
