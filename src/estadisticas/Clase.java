package estadisticas;

public class Clase {

    private Double limInf;
    private Double limSup;

    public Clase() {
        limInf = new Double(0f);
        limSup = new Double(0f);
    }

    public Clase(Double limInf, Double limSup) {
        this.limInf = limInf;
        this.limSup = limSup;
    }

    public void setLimInf(Double limInf) {
        this.limInf = limInf;
    }

    public void setLimSup(Double limSup) {
        this.limSup = limSup;
    }

    public Double getLimInf() {
        return limInf;
    }

    public Double getLimSup() {
        return limSup;
    }

    /**
     * Retorna la marca de clase o media
     */
    public Double getMarca() {
        return ((getLimSup() + getLimInf()) / 2);
    }
}
