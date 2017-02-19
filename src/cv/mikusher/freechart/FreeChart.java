/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv.mikusher.freechart;

import org.jfree.ui.RefineryUtilities;

/**
 *
 * @author Miky Mikusher
 */
public class FreeChart {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //circulo
      PieChart demo = new PieChart("Venda de Telefone");
      demo.setSize(560, 367);  
      RefineryUtilities.centerFrameOnScreen(demo);    
      demo.setVisible(true);
      
      //escala - linha
      LineChart chart = new LineChart("School Vs Years" , "Numer of Schools vs years");
      chart.pack( );
      RefineryUtilities.centerFrameOnScreen(chart);
      chart.setVisible(true);
      
      //bubble
      BubbleChart bubblechart = new BubbleChart("Bubble Chart_frame");              
      bubblechart.pack( );                 
      RefineryUtilities.centerFrameOnScreen(bubblechart);                 
      bubblechart.setVisible(true); 
      
      //timeSeries
      final String title = "Time Series Management";         
      final TimeSeries_AWT time = new TimeSeries_AWT( title );         
      time.pack( );         
      RefineryUtilities.positionFrameRandomly(time);         
      demo.setVisible(true);
      
      //xyLine
      XYLineChart xychart = new XYLineChart("Browser Usage Statistics", "Which Browser are you using?");
      xychart.pack( );          
      RefineryUtilities.centerFrameOnScreen(xychart);          
      xychart.setVisible(true); 
    }
}
