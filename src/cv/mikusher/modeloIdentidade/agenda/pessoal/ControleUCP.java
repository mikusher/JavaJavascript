/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */





package cv.mikusher.modeloIdentidade.agenda.pessoal;





import java.lang.reflect.InvocationTargetException;

import cv.mikusher.modeloIdentidade.agenda.tela.Login;





/**
 *
 * @author Miky Mikusher Wayne
 */
public class ControleUCP {

    /**
     * @param args
     *            the command line arguments
     */
    public static void main(String args[]) throws InterruptedException, InvocationTargetException {
        // TODO code application logic here

        java.awt.EventQueue.invokeAndWait(new Runnable() {

            public void run() {

                Login lg = new Login();
                lg.setLocationRelativeTo(null);
                lg.setVisible(true);
            }

        });
    }

}
