/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;
    import java.util.Scanner;
    import util_00.Alcool;
    import util_01.Gasolina;
/**
 *
 * @author Vitor Otenio
 */
public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("\tEscolha o tipo de combustível:");
        System.out.println("\nA-álcool");
        System.out.println("\nG-gasolina");
        System.out.print("\nDigíte aqui: ");
        char x = input.next().charAt(0);
        
        switch(x){
            
            case 'A':
                Alcool alcool = new Alcool();
                
                System.out.println("\n\tÁlcool");
                System.out.print("\nDigíte a quantidade de lt: ");
                alcool.alcool_litro = input.nextDouble();
                
                if(alcool.alcool_litro <= 20){
                    System.out.println("Valor total: (Com desconto de 3%): " + alcool.valor_desconto00());
                }else{
                    System.out.println("Valor total: (Com desconto de 5%): " + alcool.valor_desconto01());
                }
                break;
                
            case 'G':
                Gasolina gasolina = new Gasolina();
                
                System.out.println("\n\tGasolina");
                System.out.print("\nDigíte a quantidade de lt: ");
                gasolina.gasolina_litro = input.nextDouble();
                
                if(gasolina.gasolina_litro <= 20){
                    System.out.println("Valor total: (Com desconto de 3%): " + gasolina.valor_desconto00());
                }else{
                    System.out.println("Valor total: (Com desconto de 5%): " + gasolina.valor_desconto01());
                }
                break;
                
            default:
                System.out.println("Opção invalida");
                break;
        }
    }
}