import java.io.FileWriter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class SalvarComoJson {

    public SalvarComoJson(){}

    public void escolhaSalvarComoJson(String resposta, Endereco endereco) {
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(endereco);

            if (resposta.equals("1")) {
                FileWriter fileWriter = new FileWriter( "consultaCEP.json", true);
                fileWriter.write(json);
                fileWriter.close();
                System.out.println("Arquivo salvo com sucesso!");
            } else {
                System.out.println("Nenhum arquivo salvo");
            }

        } catch (Exception e) {
            System.out.println("Erro de escrita do arquivo: " + e.getMessage());
        }
    }
}