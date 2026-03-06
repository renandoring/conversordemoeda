import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //CHAMANDO GSON PARA TTO DE UPPERCASE E CRIAR LISTA
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        ArrayList<ConversorDeMoeda> conversor =  new ArrayList<>();

        ConversorDeMoeda conversorUm = new ConversorDeMoeda(15.00, 20.00);
        ConversorDeMoeda conversorDois = new ConversorDeMoeda(20.00, 20.00);
        ConversorDeMoeda conversorTres = new ConversorDeMoeda(60.00, 40.00);

        conversor.add(conversorUm);
        conversor.add(conversorDois);
        conversor.add(conversorTres);

        for (ConversorDeMoeda conversorDeMoeda : conversor) {
            conversorDeMoeda.conversorDeDolarParaReal();//PREENCHE A LISTA RESULTADOS

            Double resultado = conversorDeMoeda.getResultados();
            System.out.println("VALORES RECEBIDOS " +
                    "\nValor do câmbio R$: " + conversorDeMoeda.getRateCambio() +
                    "\nValor do dolar R$: " + conversorDeMoeda.getDolar());
            System.out.println("Valor convertido: " + resultado + "\n");
        }

        try (FileWriter escrita = new FileWriter("conversos.json")) {
            escrita.write(gson.toJson(conversor));
            escrita.close();
            System.out.println("Escrita realizada com sucesso");
        } catch (IOException e) {
            System.out.println("Erro ao gerar arquivo" + e.getMessage());
        }
    }
}