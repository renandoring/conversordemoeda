public class ConversorDeMoeda implements ConversorFinal {
    double rateCambio = 0;
    double dolar = 0;

    public double getRateCambio() {
        return rateCambio;
    }

    public void setRateCambio(double rateCambio) {
        this.rateCambio = rateCambio;
    }

    public double getDolar() {
        return dolar;
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

    public ConversorDeMoeda(double rateCambio, double dolar) {
        this.rateCambio = rateCambio;
        this.dolar = dolar;
    }

    @Override
    public double conversorDeDolarParaReal() {
        double dolarConverted = rateCambio * dolar;
        System.out.println("Dolar: " + dolarConverted);
        return 0;
    }

    @Override
    public String toString() {
        return getRateCambio() + " " + getDolar();
    }
}
