

package psimulacion;

/**
 *
 * @author ZTC
 */

class RegresionP {
    private Double[] x;
    private Double[] y;
    private int n;          //n�mero de datos
    public Double a, b;    //pendiente y ordenada en el origen
    public RegresionP(Double[] x, Double[] y) {
        this.x=x;
        this.y=y;
        n=x.length; //n�mero de datos
    }
    public void lineal(){
        Double pxy, sx, sy, sx2, sy2;
        pxy=sx=sy=sx2=sy2=0.0;
        for(int i=0; i<n; i++){
          sx+=x[i];
                    sy+=y[i];
            sx2+=x[i]*x[i];
            sy2+=y[i]*y[i];
            pxy+=x[i]*y[i];
        }
        System.out.println(":"+sx);
        System.out.println(":"+pxy);
        System.out.println(":"+sy);
        b=(n*pxy-sx*sy)/(n*sx2-sx*sx);
        a=(sy-b*sx)/n;
    }
    
    public Double correlacion(){
//valores medios
        Double suma=0.0;
        for(int i=0; i<n; i++){
            suma+=x[i];
        }
        Double mediaX=suma/n;

        suma=0.0;
        for(int i=0; i<n; i++){
            suma+=x[i];
        }
        Double mediaY=suma/n;
//coeficiente de correlaci�n
        Double pxy, sx2, sy2;
        pxy=sx2=sy2=0.0;
        for(int i=0; i<n; i++){
            pxy+=(x[i]-mediaX)*(y[i]-mediaY);
            sx2+=(x[i]-mediaX)*(x[i]-mediaX);
            sy2+=(y[i]-mediaY)*(y[i]-mediaY);
        }
        return pxy/Math.sqrt(sx2*sy2);
    }

public static void main(String[] args) {
//Una f�brica de bebidas refrescantes observa sus ventas y la temperatura de la calle
        Double[] ventas={9.0, 11.0, 15.0, 16.0, 20.0, 24.0, 27.0, 29.0, 22.0, 20.0, 14.0, 9.0};
        Double[] temperatura={5.0, 7.0, 10.0, 12.0, 16.0, 20.0, 23.0, 27.0, 19.0, 14.0, 9.0, 6.0};
        RegresionP regresion=new RegresionP(temperatura, ventas);
        regresion.lineal();
        System.out.println("Recta de regresi�n ");
        System.out.println("Pendiente             "+regresion.a);
        System.out.println("Ordenada en el origen "+regresion.b);
        System.out.println("********************** ");
        System.out.println("Indice de correlaci�n "+regresion.correlacion());
System.out.println("Temp-venta 5 "+(regresion.a+regresion.b*5));

        try  {
//espera la pulsaci�n de una tecla y luego RETORNO
            System.in.read();
        }catch (Exception e) {  }
    }
}

