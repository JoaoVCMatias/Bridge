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
        /*
        testarCarroModoNormal(new Model3());
        testarCarroModoNormal(new ModelS());
        testarCarroModoNormal(new ModelX());
        testarCarroModoNormal(new ModelY());
        */
        testarCarroModoPlaid(new Model3());
        testarCarroModoPlaid(new ModelS());
        testarCarroModoPlaid(new ModelX());
        testarCarroModoPlaid(new ModelY());

        
    }
    public static void testarCarroModoNormal(Carro carro) {
        ModoNormal M1 = new ModoNormal(carro);
        M1.ligarCarro();
        M1.acelerar();
        M1.frear();
        M1.ligarFarol();
        M1.desligarFarol();
        System.out.println(M1.toString());              
    }
    public static void testarCarroModoPlaid(Carro carro){
        ModoPlaid M2 = new ModoPlaid(carro);
        M2.ligarCarro();
        M2.acelerar();
        M2.frear();
        M2.ligarFarol();
        M2.desligarFarol();
        M2.ligarPiloto();
        System.out.println(M2.toString());  
    }
    
}
