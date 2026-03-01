import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ConversorDeMoeda conversorUm = new ConversorDeMoeda(15.00, 20.00);
        ConversorDeMoeda conversorDois = new ConversorDeMoeda(20.00, 20.00);
        ConversorDeMoeda conversorTres = new ConversorDeMoeda(60.00, 40.00);

        ArrayList<ConversorDeMoeda> conversor =  new ArrayList<>();

        conversor.add(conversorUm);
        conversor.add(conversorDois);
        conversor.add(conversorTres);

        for (ConversorDeMoeda conversorDeMoeda : conversor) {
            double dolarConvertido = conversorDeMoeda.getDolar() * conversorDeMoeda.getRateCambio();
            System.out.println("VALORES RECEBIDOS " +
                    "\nValor do câmbio R$: " + conversorDeMoeda.getRateCambio() +
                    "\nValor do dolar R$: " + conversorDeMoeda.getDolar());
            System.out.println("Valor convertido: " + dolarConvertido + "\n");
        }
    }
}