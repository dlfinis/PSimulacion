package estadisticas;

public class Frecuencia {
    // Atributos

    private Double[] valor;

    public Frecuencia() {
        valor = new Double[10];
    }

    public Frecuencia(Double[] valores) {
        valor = valores;
    }

    public void setValor(Double[] valor) {
        this.valor = valor;
    }

    public Double[] getValor() {
        return valor;
    }

    /**
     * Retorna el maximo valor de la serie
     * @return
     */
    public Double getMax() {
        Double max = valor[0];
        for (int i = 0; i < valor.length; i++) {
            if (max < valor[i]) {
                max = valor[i];
            }
        }
        return max;
    }

    /**
     * Retorna el minimo valor de la serie
     * @return
     */
    public Double getMin() {
        Double min = valor[0];
        for (int i = 0; i < valor.length; i++) {
            if (min > valor[i]) {
                min = valor[i];
            }
        }
        return min;
    }

    /**
     * Retorna el rango
     */
    public Double getRango() {
        return getMax() - getMin();
    }

    /**
     * Retorna el numero de intervalos
     */
    public int getK() {
        return Math.round(Math.round((1 + 3.3 * Math.log10(valor.length))+0.5));
    }

    /**
     * Retorna la Amplitud de Clase
     */
    public int getA() {
        return (int)Math.round(getRango()/getK());
    }

    /**
     * Devuelve el limite Real inferior
     */
    public Double getLimiteInferior() {
        return (getMin() - 0.5f);
    }

    /**
     * Devuelve el limite Real superior
     */
    public Double getLimiteSuperior() {
        return getMax() + 0.5f;
    }

    public Clase[] getClases() {
        Clase[] limites = new Clase[getK()];
        limites[0] = new Clase(getMin(), getMin() + getA());
        for (int i = 1; i < limites.length; i++) {
            Clase anterior = limites[i - 1];
            limites[i] = new Clase(anterior.getLimSup(), anterior.getLimSup() + getA());
        }
        return limites;
    }

    /**
     * Retorna la frecuencia relativa de la serie de datos
     */
    public int[] getFrecAbs() {
        int[] frec = new int[getK()];
        Clase clase[] = getClases();
        for (int i = 0; i < frec.length-1; i++) {
            frec[i] = contar(clase[i].getLimInf(), clase[i].getLimSup());
        }
        int ultimo=frec.length-1;
        frec[frec.length-1]=contar(clase[ultimo].getLimInf(), clase[ultimo].getLimSup()+0.5f);
        return frec;
    }
    
    /**
     * Retorna la media de los 
     */
    public double getMedia() {
     
        Double f=0.0;
        int []frec=getFrecAbs();
        Clase clase[] = getClases();
         
        for (int i = 0; i < frec.length-1; i++) {
            
            f+=(clase[i].getMarca()* frec[i]);
        }
        
        return f/(valor.length-1);
    }

       /**
     * Retorna la media de los 
     */
    public double getDev() {
     
        Double f=0.0;
        int []frec=getFrecAbs();
        Double media=getMedia();
        Clase clase[] = getClases();
         
        for (int i = 0; i < frec.length-1; i++) {
            
            f+=(frec[i]* Math.pow(clase[i].getMarca(),2));
        }
        
        return Math.sqrt((f/(valor.length-1))-Math.pow(media,2));
    }
    
    /**
     * Retorna las frecuencias absolutas acumuladas
     */
    public int[] getFrecAbsAc() {
        int[] ac = new int[getK()];
        int[] abs = getFrecAbs();
        ac[0] = abs[0];
        for (int i = 1; i < ac.length; i++) {
            ac[i] = ac[i - 1] + abs[i];
        }
        return ac;
    }

    /**
     * Retorna las frecuencias relativas de la serie
     */
    public Double [] getFrecRel() {
        Double[] rel = new Double[getK()];
        int[] abs = getFrecAbs();
        for (int i = 0; i < rel.length; i++) {
            rel[i] = Double.parseDouble(abs[i]+"")  / Double.parseDouble(valor.length+"");
        }
        return rel;
    }

    /**
     * Retorna las frecuencias relativas acumuladas
     * @return
     */
    public Double [] getFrecRelAc() {
        Double[] ac = new Double[getK()];
        Double[] rel = getFrecRel();
        ac[0] = rel[0];
        for (int i = 1; i < ac.length; i++) {
            ac[i] = ac[i - 1] + rel[i];
        }
        return ac;
    }

    /**
     * Cuenta los numeros que estan dentro de un rango de datos
     * @param limInf
     * @param limSup
     * @return
     */
        private int contar(Double limInf, Double limSup) {
        int count = 0;
        for (int i = 0; i < valor.length; i++) {
            if (valor[i] >= limInf && valor[i] < limSup) {
                count++;
            }
        }
        return count;
    }
}
