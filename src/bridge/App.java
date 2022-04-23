/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bridge;

/**
 *
 * @author joaov
 */
public class App {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        testarCarro(new Model3());
    }
    public static void testarCarro(Carro carro) {
		ModoNormal M1 = new ModoNormal(carro);
		M1.ligarCarro();
		M1.toString();	
	}
    
}
