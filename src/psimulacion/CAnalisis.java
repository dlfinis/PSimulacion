/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package psimulacion;

/**
 *
 * @author ZTC
 */
public class CAnalisis {
    
    
    public Double genA()
    {
   return Math.random(); 
    
    }
    
    public Double genRcuad(Double a)
    {
   return Math.sqrt(a); 
    
    }
    public Double genUniforme(Double a,Double b)
    {
    
   return (a+(b-a)*genA()); 
    
    }
    
    public Double genNormal(Double media,Double dev)
    {
    //=E9+F9*(RAIZ((-2*LN(ALEATORIO())))*SENO(2*PI()*ALEATORIO()))
   return (media+dev*(genRcuad((-2*Math.log(genA())))*Math.sin(2*Math.PI*genA()))); 
    
    }
    
    public Double genTriangular(Double a,Double b,Double c)
    {
    //=E9+F9*(RAIZ((-2*LN(ALEATORIO())))*SENO(2*PI()*ALEATORIO()))
   
        Double x1=0.0,x2=0.0,t1=0.0,t2=0.0,alet=0.0;
        
        alet=genA();
        t1=(c-a)/(b-a);
        t2=1-t1;
        x1=a+genRcuad(alet*(c-a));
        x2=b-genRcuad((alet*(b-a)*(b-c))-1);
        
        if(alet<t1)
            return x1;
        else
            return x2;
        
    }
    
}

