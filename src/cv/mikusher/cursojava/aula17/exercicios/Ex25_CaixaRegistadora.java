/*
 * Copyright (C) 2016 Mikusher
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 */
package cv.mikusher.cursojava.aula17.exercicios;

import java.util.Scanner;

/**
 *
 * @author Mikusher
 */
public class Ex25_CaixaRegistadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        //System.out.println("Lojas Tabajara");
        
        boolean sair = false;
        String continuarCompra;
        int qtdProdutos;
        double preco;
        double total;
        String output;
        double valorPago, troco;
        
        do {
            System.out.println("Deseja informar uma nova comprar? S/N");
            continuarCompra = scan.next();
            
            if (continuarCompra.equalsIgnoreCase("s")){
                output = "Lojas Tabajara\n";
                System.out.print("Digita a quantidade de produtos da compra:\n");
                qtdProdutos = scan.nextInt();
                total =0;
                
                for (int i=1; i<= qtdProdutos; i++){
                    System.out.println("Indica o preço do produto: " +i);
                    preco = scan.nextDouble();
                    total += preco;
                    output += "Produto " +i+ ": R$ " +preco+ "\n";
                }
                output += "Total: R$ " +total;
                
                System.out.println("Total: R$ " +total);
                System.out.println("Indica o valor pago: ");
                valorPago = scan.nextDouble();
                
                output += "Dinheiro: R$ " + valorPago + "\n";
                troco = total - valorPago;
                
                output += "Troco: R$ " +troco;
                System.out.println(output);
                
            } else {
                sair = true;            
            }
        }while(!sair);
    }
    
}
