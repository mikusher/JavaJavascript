/*
 * Copyright (C) 2016 Mikusher
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 */
package cv.mikusher.softblue;

/**
 *
 * @author Mikusher
 */
public class Livro {
    
    int numPaginas;
    String titulo;
    double preco;
    
    void irParaPagina(int numPagina){
    
    }
    
    void definirPreco (double preco){
        this.preco = preco;
    }
    
    void mostrar (){
        System.out.println("Paginas "+numPaginas);
        System.out.println("Preço "+preco);
    }
    
}
