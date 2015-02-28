package estadisticas;

import estadisticas.Clase;
import estadisticas.Frecuencia;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.xy.XYBarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.IntervalXYDataset;
import org.jfree.data.xy.XYBarDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class dlgGraf extends JDialog {

    private Frecuencia frecuencia;
    public JFrame parent;
    public dlgGraf(Frecuencia frec, Frame owner, boolean modal) {
        super(owner, modal);
        frecuencia = frec;
        parent=(JFrame) owner;

        JTabbedPane tbnPane = new JTabbedPane();

        this.addWindowListener(
                new WindowListener(){
                 public void windowClosing(java.awt.event.WindowEvent evt) {                                   
                 parent.setEnabled(true);
                 dispose();                      
                    }

            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosed(WindowEvent e) {
            }

            @Override
            public void windowIconified(WindowEvent e) {
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
            }

            @Override
            public void windowActivated(WindowEvent e) {
            parent.setEnabled(false);
                }

            @Override
            public void windowDeactivated(WindowEvent e) {
            
            }
 }
                
                
                );
        
        
        JPanel contenedor = new JPanel(new FlowLayout());
        JPanel botonera = new JPanel(new FlowLayout());
        JButton btnCerrar = new JButton("Cerrar");
        btnCerrar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                   parent.setEnabled(true);
                    dispose();    
    
            }
        });
        
        botonera.add(btnCerrar);

        tbnPane.add("Histograma", panelHistograma());
        tbnPane.add("Poligono", panelPoligono());

        setLayout(new BorderLayout(5, 5));
        add(tbnPane, BorderLayout.CENTER);
        add(botonera, BorderLayout.SOUTH);
        pack();
    }

    private JPanel panelHistograma() {
        JFreeChart jfreechart = crearHistograma(crearDatosHistograma());
        ChartPanel panel = new ChartPanel(jfreechart);
        return panel;
    }

    private JFreeChart crearHistograma(IntervalXYDataset datos) {
        JFreeChart jfreechart = ChartFactory.
                createHistogram("Histograma", "X","Y", datos, PlotOrientation.VERTICAL, false, false, false);
                //createHistogram("Histograma", "X","Y", datos, PlotOrientation.VERTICAL, false, false, false);
               //createXYBarChart("Histograma", "X", false, "Y", datos, PlotOrientation.VERTICAL, false, false, false);
               
        //jfreechart.getCategoryPlot();
        jfreechart.getPlot().setOutlinePaint(Color.black);
        XYPlot cp=(XYPlot)jfreechart.getPlot();
        XYBarRenderer renderer=(XYBarRenderer)cp.getRenderer();
        
        cp.setWeight(80);
        
                
        renderer.setSeriesPaint(0,Color.GRAY);
        jfreechart.setAntiAlias(true);
        jfreechart.setBackgroundPaint(Color.white);
       
        return jfreechart;
    }

    private IntervalXYDataset crearDatosHistograma() {
        SimpleIntervalXYDataset dataset = new SimpleIntervalXYDataset(frecuencia);
        return dataset;
    }

    private XYDataset crearDatosPoligono() {
        XYSeries poligono = new XYSeries("Poligono");

        Clase[] clase = frecuencia.getClases();
        Double[] rel = frecuencia.getFrecRel();
        int k = frecuencia.getK();
        for (int i = 0; i < clase.length; i++) {
            poligono.add(clase[i].getMarca(), rel[i]);
        }
        XYSeriesCollection series = new XYSeriesCollection();
        series.addSeries(poligono);
        return series;
    }

    private JPanel panelPoligono() {
        JFreeChart jfreechart = crearPoligono(crearDatosPoligono());
        ChartPanel chart = new ChartPanel(jfreechart);
        return chart;
    }

    private JFreeChart crearPoligono(XYDataset datosPoligono) {
        JFreeChart jfreechart = ChartFactory.createXYLineChart("Poligono de frecuecias", "X", "Y", datosPoligono, PlotOrientation.VERTICAL, false, false, false);
        return jfreechart;
    }
}
