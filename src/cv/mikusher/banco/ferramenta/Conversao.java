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

public class Conversao
{
   public static void main(String[] args)
   {
      Temperaturas w = new Temperaturas();
      w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      w.setSize(250, 120);
      w.setVisible(true);
   }

}
