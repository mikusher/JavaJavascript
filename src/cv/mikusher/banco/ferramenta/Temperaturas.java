/*
 * Copyright (C) 2016 Miky Mikusher Wayne
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 */
package cv.mikusher.banco.ferramenta;

/**
 *
 * @author Miky Mikusher Wayne
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Temperaturas extends JFrame
{
   private JLabel labelTempF;
   private JLabel labelTempC;
   private JTextField editTempF;
   private JTextField editTempC;
   
   public Temperaturas()
   {
      super("Conversão de Temperaturas");
      setLayout(new FlowLayout());
      
      labelTempF = new JLabel("Temperatura em Fahrenheit");
      add(labelTempF);
      
      editTempF = new JTextField(10);
      add(editTempF);
      
      labelTempC = new JLabel("Temperatura em Celsius");
      add(labelTempC);
      
      editTempC = new JTextField(10);
      editTempC.setEditable(false);
      add(editTempC);
      
      TextFieldHandler ouvinte = new TextFieldHandler();
      editTempF.addActionListener(ouvinte);
   }
   
   private class TextFieldHandler implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         double tempF = Double.parseDouble(e.getActionCommand());
         double tempC = 5.0*(tempF - 32.0)/9.0;
         editTempC.setText(String.format("%.2f", tempC));
      }
   }

}
