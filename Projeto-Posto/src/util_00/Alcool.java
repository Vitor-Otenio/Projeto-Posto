/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util_00;

/**
 *
 * @author Vitor Otenio
 */
public class Alcool {
    
    public double alcool_valor = 1.90;
    public double alcool_desc00 = 3.0 / 100.0;
    public double alcool_desc01 = 5.0 / 100.0;
    public double alcool_litro;
    public double porcentagem_00;
    public double porcentagem_01;

    //Valor do litro X a quantidade de litros
    public double valor_litro(){
        return alcool_litro * alcool_valor;
    }
    
    //Calculo do desconto de 3%
    public double valor_desconto00(){
        return porcentagem_00 = valor_litro() - (alcool_desc00 * valor_litro());
    }
    
    //Calculo do desconto de 5%
    public double valor_desconto01(){
        return porcentagem_01 = valor_litro() - (alcool_desc01 * valor_litro());
    }
}
