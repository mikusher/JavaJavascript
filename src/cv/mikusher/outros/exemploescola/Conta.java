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

import java.util.GregorianCalendar;
import java.io.*;

/**
 *
 * @author Luis Amilcar D. N. Tavares
 * @nickname Miky Mikusher
 */

public class Conta implements Serializable {

    // Variaveis de Instancia
    private String numConta, titular;
    private GregorianCalendar dataInicio, dataUltMov;
    private double saldo;
    // Construtores
    public Conta(String num, String tit, double saldo, GregorianCalendar dataInic, GregorianCalendar dataUMov) {
       numConta = num; 
       titular = tit; 
       this.saldo = saldo;
       dataInicio = (GregorianCalendar) dataInic.clone();
       dataUltMov = (GregorianCalendar) dataUMov.clone(); 
    }
    
    public Conta(Conta cb) {
        numConta = cb.getNumConta(); 
        titular = cb.getTitular();
        saldo = cb.getSaldo(); 
        dataInicio = (GregorianCalendar) cb.getInicio().clone();
        dataUltMov = (GregorianCalendar) cb.getUltMov().clone();
    }
    
    // Metodos de Instancia
    public String getNumConta() { return numConta; }
    public double getSaldo() { return saldo; } 
    public String getTitular() { return titular; }
    public GregorianCalendar getInicio() { return dataInicio; }
    public GregorianCalendar getUltMov() { return dataUltMov; }
    public void levantamento(double valor) { saldo -= valor; }
    public void deposito(double valor) { saldo += valor; }
    public void mudaUltMov(GregorianCalendar dataMov) { 
                        dataUltMov = dataMov; }
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("------------------------------------------------------\n");
        s.append("Conta N: " + numConta + "\t\t\t");
        s.append("Titular: " + titular + "\n");
        s.append("Saldo: " + saldo + "\n");
        int ano = dataInicio.get(GregorianCalendar.YEAR);
        int mes = dataInicio.get(GregorianCalendar.MONTH);
        int dia = dataInicio.get(GregorianCalendar.DAY_OF_MONTH);
        s.append("Inicio: " + dia  + "/" + mes +  "/" + ano + "\t\t");
        ano = dataUltMov.get(GregorianCalendar.YEAR);
        mes = dataUltMov.get(GregorianCalendar.MONTH);
        dia = dataUltMov.get(GregorianCalendar.DAY_OF_MONTH);
        s.append("Ult. Mov: " + dia + "/" + mes + "/" + ano + "\n");
        return s.toString();
    }
    
    
    public boolean equals(Object o) {
      if (this == o) return true;
      if ((o == null) || (this.getClass() != o.getClass()))
       return false;
  
      Conta umaConta = (Conta)o;
      
      return (this.numConta.equals(umaConta.getNumConta()) && 
              this.titular.equals(umaConta.getTitular()) &&
              this.saldo == umaConta.getSaldo() &&
              this.dataInicio.equals(umaConta.getInicio()) &&
              this.dataUltMov.equals(umaConta.getUltMov()));
    }  
       
  public Object clone() { 
      return new Conta(this); 
  }
       
}