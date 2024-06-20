import java.io.File;
import java.io.FileWriter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class SalvarComoJson {

    public SalvarComoJson() {
    }

    public void escolhaSalvarComoJson(String resposta, Endereco endereco) {
        if (resposta.equals("1")) {
            try {
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                String json = gson.toJson(endereco);

                String targetFolder = ".";
                String targetFile = "consultaCEP.json";
                String uniqueFileName = generateUniqueFileName(targetFolder, targetFile);

                File file = new File(targetFolder, uniqueFileName);
                try (FileWriter fileWriter = new FileWriter(file)) {
                    fileWriter.write(json);
                    System.out.println("Arquivo salvo com sucesso: " + uniqueFileName);
                }
            } catch (Exception e) {
                System.out.println("Erro de escrita do arquivo: " + e.getMessage());
            }
        } else {
            System.out.println("Nenhum arquivo salvo");
        }
    }

    public static String generateUniqueFileName(String targetFolder, String targetFile) {
        int countExisting = 0;
        String uniqueFile = targetFile;

        File file = new File(targetFolder, uniqueFile);
        while (file.exists()) {
            countExisting++;
            int dotIndex = targetFile.lastIndexOf(".json");
            if (dotIndex == -1) {
                uniqueFile = targetFile + " (" + countExisting + ")";
            } else {
                uniqueFile = targetFile.substring(0, dotIndex) + " (" + countExisting + ")" + targetFile.substring(dotIndex);
            }
            file = new File(targetFolder, uniqueFile);
        }
        return uniqueFile;
    }
}
