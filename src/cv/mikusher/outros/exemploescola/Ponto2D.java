/*
 * Copyright (C) 2016 Miky Mikusher
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 */

package cv.mikusher.outros.exemploescola;

/**
 *
 * @author Luis Amilcar D. N. Tavares
 * @nickname Miky Mikusher
 */

import static java.lang.Math.abs;

public class Ponto2D {

   
   // Vari�veis de Inst�ncia
   private double x, y;

   // Construtores usuais
   public Ponto2D(double cx, double cy) { x = cx; y = cy; }
   public Ponto2D(){ this(0, 0); }
   public Ponto2D(Ponto2D p) { x = p.getX(); y = p.getY(); }


   // M�todos de Inst�ncia
   public double getX() { return x; }
   public double getY() { return y; }
   // incremento das coordenadas 
   public void incCoord(double dx, double dy) {
      x += dx; y += dy;
   }
   // decremento das coordenadas
   public void decCoord(double dx, double dy) {
      x -= dx; y -= dy;
   }
   // soma coordenadas do ponto par�metro ao ponto receptor
   public void somaPonto(Ponto2D p) {
      x += p.getX(); y += p.getY();
   }
   // soma os valores par�metro e devolve um novo ponto
   public Ponto2D somaPonto(double dx, double dy) {
     return new Ponto2D(x += dx, y+= dy);
   }
   // determina se um ponto � sim�trico (dista do eixo dos XX o
   //  mesmo que do eixo dos YY
   public boolean simetrico() {
     return abs(x) == abs(y);
   }
   // verifica se ambas as coordenadas s�o positivas
   public boolean coordPos() {
     return x > 0 && y > 0;
   } 

   // M�todos complementares usuais

   // Verifica se os pontos s�o iguais
   public boolean igual(Ponto2D p) {
      if (p != null) return (x == p.getX() && y == p.getY());
      else return false;
   }
   
   public boolean equals(Object obj) {
       if (this == obj) return true;
       if ((obj == null) || (this.getClass() != obj.getClass()))
          return false;
       Ponto2D ponto = (Ponto2D) obj;
       return x == ponto.getX() && y == ponto.getY();
   }

   // outra vers�o de igual(Ponto2D p)
   public boolean igual1(Ponto2D p) {
     return (p == null) ? false : x == p.getX() && y == p.getY();
   }

   // Converte para uma representa��o textual     
   public String paraString() {
     return new String("Pt2D = " + x + ", " + y);
   }
   
   // Converte para uma representa��o textual - toString()     
   public String toString() {
     return new String("Pt2D = " + x + ", " + y);
   }

   // Cria uma c�pia do ponto receptor
   public Ponto2D clone() {
      return new Ponto2D(this);
   }
}
