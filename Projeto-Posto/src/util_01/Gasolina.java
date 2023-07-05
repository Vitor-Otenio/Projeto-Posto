/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util_01;

/**
 *
 * @author Vitor Otenio
 */
public class Gasolina {
    
    public double gasolina_valor = 2.50;
    public double gasolina_desc00 = 3.0 / 100.0;
    public double gasolina_desc01 = 5.0 / 100.0;
    public double gasolina_litro;
    public double porcentagem_00;
    public double porcentagem_01;

    //Valor do litro X a quantidade de litros
    public double valor_litro(){
        return gasolina_litro * gasolina_valor;
    }
    
    //Calculo do desconto de 4%
    public double valor_desconto00(){
        return porcentagem_00 = valor_litro() - (gasolina_desc00 * valor_litro());
    }
    
    //Calculo do desconto de 6%
    public double valor_desconto01(){
        return porcentagem_01 = valor_litro() - (gasolina_desc01 * valor_litro());
    }
}
