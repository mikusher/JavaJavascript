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
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Calcular extends JFrame
{
    private JPanel painel1;
    private JPanel painel2;
    private JTextField display;
    private JButton bot[];
    private String nomeBot[] =
        { "C", "CE", "M", "MR",
          "7", "8", "9", "+",
          "4", "5", "6", "-",
          "1", "2", "3", "*",
          "0", ".", "=", "/"
        };
    
    public Calcular()
    {
        super("Calculadora");
        setLayout(new BorderLayout());
        
        painel2 = new JPanel();
        painel2.setLayout(new GridLayout(5, 4));
        add(painel2, BorderLayout.CENTER);
        
        display = new JTextField("0");
        display.setEditable(false);
        display.setBackground(Color.YELLOW);
        display.setFont(new Font("Serif", Font.BOLD, 24));
        display.setHorizontalAlignment(JTextField.TRAILING);
        add(display, BorderLayout.NORTH);
        
        Acao ouvinte = new Acao();
        
        bot = new JButton[nomeBot.length];
        
        for (int i = 0; i < nomeBot.length; i++)
        {
            bot[i] = new JButton(nomeBot[i]);
            bot[i].addActionListener(ouvinte);
            painel2.add(bot[i]);
        }
    }
    
    private class Acao implements ActionListener
    {
        private String op;
        private double resultadoAnterior;
        private boolean comPonto = false;
        private boolean limpar = true;
        
        public void actionPerformed(ActionEvent e)
        {
            JButton b = (JButton) e.getSource();
            String t = b.getText();
            if (t == "0" || t == "1" || t == "2" ||
                t == "3" || t == "4" || t == "5" ||
                t == "6" || t == "7" || t == "8" ||
                t == "9")
            {
                String novoTexto = limpar ? t : display.getText() + t;
                display.setText(novoTexto);
                if (limpar)
                {
                    comPonto = false;
                    limpar = false;
                }                
            }
            else if (t == "." && ! comPonto)
            {
                String novoTexto = limpar ? "0." : display.getText() + ".";
                display.setText(novoTexto);
                if (limpar)
                    limpar = false;
                comPonto = true;
            }
            else if (t == "CE")
            {
                display.setText("0");
                limpar = true;
                comPonto = false;
            }
            else if (t == "+" || t == "-" || t == "*" || t == "/")
            {
                if (op == null)
                    resultadoAnterior = Double.parseDouble(display.getText());
                else
                {
                    resultadoAnterior = calcular();
                    display.setText(String.format("%f", resultadoAnterior));
                }
                op = t;
                limpar = true;
                comPonto = false;
            }
            else if (t == "=")
            {
                resultadoAnterior = calcular();
                display.setText(String.format("%f", resultadoAnterior));
                op = null;
                limpar = true;
                comPonto = false;
            }
        }
        
        private double calcular()
        {
            double x = resultadoAnterior;
            double y = Double.parseDouble(display.getText());
            double z = 0.0;
            if (op == "+") z = x + y;
            else if (op == "-") z = x - y;
            else if (op == "*") z = x * y;
            else if (op == "/") z = x / y;
            return z;
        }
    }
    
    public static void main(String args[])
    {
        Calcular janela = new Calcular();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(220, 300);
        janela.setVisible(true);
    }
}
