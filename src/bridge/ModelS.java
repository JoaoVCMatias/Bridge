/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridge;

/**
 *
 * @author joaov
 */
public class ModelS implements Carro {
    private boolean carroLigado = false;
    private boolean farolLigado = false;
    private String marcha = "N";
    private int velocidade = 0;
    private boolean radio = false;
   
    
    @Override
    public boolean carroligado() {
	return carroLigado;
    }

    @Override
    public void partida() {
        carroLigado = true;
    }

    @Override
    public void desligamento() {
        carroLigado = false;
    }

    @Override
    public String getMarcha() {
        return marcha;
    }

    @Override
    public void setMarcha(String marcha) {
        this.marcha = marcha;
    }

    @Override
    public boolean farolLigado() {
        return farolLigado;
    }

    @Override
    public void ligarFarol() {
        farolLigado = true;
    }

    @Override
    public void desligarFarol() {
        farolLigado = false;
    }

    @Override
    public void acelerar(int velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public void frear(int velocidade) {
        this.velocidade = velocidade;	
    }

    @Override
    public String toString() {
        return "ModelS{" + "carroLigado=" + carroLigado + ", farolLigado=" + farolLigado + ", marcha=" + marcha + ", velocidade=" + velocidade + ", radio=" + radio + '}';
    }

    
    
    public void ligarRadio(){
        this.radio = true;
        System.out.println("ModelS-Radio sendo ligado"); 
    }
    
}
