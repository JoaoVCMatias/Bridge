/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bridge;

/**
 *
 * @author joaov
 */
public interface Carro {
    boolean carroligado();
    void partida();
    void desligamento();
    String getMarcha();
    void setMarcha(String marcha);
    boolean farolLigado();
    void ligarFarol();
    void desligarFarol();
    void acelerar(int velocidade);
    void frear(int velocidade);
}
