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


import java.util.GregorianCalendar;
import java.util.Calendar;
public class Mail {

    // Vari�veis de Inst�ncia
    
    private String endereco;
    private String assunto;
    private GregorianCalendar data_envio;
    private GregorianCalendar data_recepcao;
    private String texto;

    // Construtores
 
    
    public Mail(String end, String asst, GregorianCalendar envio, 
                      GregorianCalendar recep, String txt) {
        endereco = end; assunto = asst; data_envio = envio;
        data_recepcao = recep; texto = txt; 
    }

    public Mail(Mail m) {
        endereco = m.getEndereco(); assunto = m.getAssunto();
        data_envio = (GregorianCalendar) m.getEnvio().clone();
        data_recepcao = (GregorianCalendar) m.getRecepcao().clone();
        texto = m.getTexto();
    }
    
    // M�todos de Inst�ncia
    
    public String getEndereco() { return endereco; }
    public String getAssunto() { return assunto; }
    public GregorianCalendar getEnvio() { 
        return (GregorianCalendar) data_envio.clone();
    }
    public GregorianCalendar getRecepcao() { 
        return (GregorianCalendar) data_recepcao.clone();  
    }
    
    public String getTexto() { return texto; }
    
    public String toString() {
        StringBuilder s = new StringBuilder("------ MENSAGEM ---------\n");
        s.append("De: " + endereco + "\n");
        s.append("Assunto: " + assunto + "\n");
        s.append("Enviada em: " + data_envio.get(Calendar.DAY_OF_MONTH) + "/" +
                                  (data_envio.get(Calendar.MONTH) + 1) + "/" +
                                  data_envio.get(Calendar.YEAR) + "\n");
        s.append("Recebida em: " + data_recepcao.get(Calendar.DAY_OF_MONTH) + "/" +
                                  (data_recepcao.get(Calendar.MONTH) + 1) + "/" +
                                  data_recepcao.get(Calendar.YEAR) + "\n");
        s.append(texto + "\n");
        return s.toString();
    } 
    
    
   public boolean equals(Object o) {
     if (this == o) return true;
     if ((o == null) || (this.getClass() != o.getClass()))
       return false;
       
     Mail umMail = (Mail)o;
     
     return (this.endereco.equals(umMail.getEndereco()) && this.assunto.equals(umMail.getAssunto()) 
             && this.data_envio.equals(umMail.getEnvio()) 
             && this.data_recepcao.equals(umMail.getRecepcao())
             && this.texto.equals(umMail.getTexto()));
   }
    
   public Mail clone() { 
     return new Mail(this); 
   }
}

