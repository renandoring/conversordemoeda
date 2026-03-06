import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConversorDeMoeda implements ConversorFinal {
    private double rateCambio = 0;
    private double dolar = 0;
    private Double resultados;//NOVA LISTA QUE VAI RECEBER MINHA CONVWERSAO

    public ConversorDeMoeda(double rateCambio, double dolar) {
        this.rateCambio = rateCambio;
        this.dolar = dolar;
        this.resultados = null;
    }

    public Double getResultados() {
        return resultados;
    }

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

    @Override
    public double conversorDeDolarParaReal() {
        double dolarConverted = rateCambio * dolar;
        System.out.println("Dolar: " + dolarConverted);
        this.resultados = dolarConverted;
        return dolarConverted;
    }

    @Override
    public String toString() {
        return "Rate Cambio: " + rateCambio +
                "\nDolar: " + dolar +
                "\nResultados: " + resultados;
    }
}
