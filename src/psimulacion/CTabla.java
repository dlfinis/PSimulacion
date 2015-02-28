/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package psimulacion;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ZTC
 */
public class CTabla {
    
    /*
    public String[] getArray(List <String> list)
    {
        String[] dat=new String[list.size()];
    for(int i=0;i<list.size();i++)
     { 
    dat[i]=list.get(i);
     }
    return dat;
    }
    */
     /**
     *
     * @param list
     * @return
     */
    
    public void printList(List<Double> list)
    {
    
    for(int i=0;i<list.size();i++)
     { 
    System.out.println(list.get(i));
     }
    
    }
    public Double[] getArray(List <Double> list)
    {
        Double[] dat=new Double[list.size()];
    for(int i=1;i<list.size();i++)
     { 
          dat[i]=list.get(i);
     }
    return dat;
    }
    
    public void addDatos(JTable tabla,List <Double> list,int num)
    {
        System.out.println("--------");
        
        // System.out.println("=="+list.get(0));
        // System.out.println("--"+list.get(1));
     // obtengo el modelo de la tabla (El TableModel)
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
        // defino el vector que contendra los datos a cargar en la tabla
        Object datos[] = new Object[tabla.getModel().getColumnCount()];
      // ahora cargo el vector con los datos que cargo el usuario.
        /*List <Double> list= new ArrayList<Double>();
       
        list.add(1.0);
        list.add(12.0);
        list.add(123.0);
        list.add(0.0);
        list.add(1234.0);
        list.add(12345.0);
        list.add(123456.0);
        */
        datos[0]=num;
        for(int i=1,j=0;j<list.size();i++,j++)
        { 
            System.out.println("------'"+i);
           // System.out.println("-----*'"+list.get(i));
            
           
               if(i==4)
               datos[4]="";
               else
              datos[i]=list.get(j);
            
        
        }
        
        //ahora agrego los datos al TableModel
        modelo.addRow(datos);
       
        // y listo, los datos aparecen en la tabla
    }

    
    public Double[] getInfColumn(JTable tabla,int column)
    {
        
    int col=tabla.getModel().getColumnCount();
    int row=tabla.getModel().getRowCount();
    
    Double[] datos=new Double[row];
    for(int i=0;i<row;i++)
    {
    datos[i]=(Double) tabla.getModel().getValueAt(i, column);
    }
    return datos;
    }
    
    public Double getProb(Double[] datos,String t)
    {
        Double temp=0.0;
       
    for(int i=0;i<datos.length;i++)
    {
       
    if(t.equals("+"))
    {if(datos[i]<0.0) {
            temp++;
     System.out.println(":+"+datos[i]);   
    }
    }else
    {
    if(t.equals("-"))
    { if(datos[i]>0.0) {
            temp++;
        }}
    }}
    
    return temp/datos.length;
    }
}
