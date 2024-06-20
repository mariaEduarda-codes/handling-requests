import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GerenciadorRequisicoes {
    private HttpResponse<String> httpResponse;

    public GerenciadorRequisicoes(Cep cep) {
        String url = "https://viacep.com.br/ws/" + cep.toString() + "/json";
        try {
            HttpClient httpClient = HttpClient.newHttpClient();
            HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(url)).build();
            this.httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public HttpResponse<String> getResponse() {
        return httpResponse;
    }
}