package cv.mikusher.freechart;

import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
 
public class PieChart extends ApplicationFrame 
{
   public PieChart(String title) 
   {
      super( title ); 
      setDefaultCloseOperation(ApplicationFrame.EXIT_ON_CLOSE);
      setContentPane(createDemoPanel( ));
   }
   private static PieDataset createDataset( ) 
   {
      DefaultPieDataset dataset = new DefaultPieDataset( );
      dataset.setValue( "IPhone 5s" , new Double( 50 ) );  
      dataset.setValue( "SamSung Grand" , new Double( 10 ) );   
      dataset.setValue( "MotoG" , new Double( 10 ) );    
      dataset.setValue( "Nokia Lumia" , new Double( 30 ) );  
      return dataset;         
   }
   private static JFreeChart createChart(PieDataset dataset, String title)
   {
      JFreeChart chart = ChartFactory.createPieChart(      
         title,          // chart title 
         dataset,        // data    
         true,           // include legend   
         true, 
         false);

      return chart;
   }
   public static JPanel createDemoPanel( )
   {
      JFreeChart chart = createChart(createDataset( ), "Vendas Marcas");  
      return new ChartPanel( chart ); 
   }
}