import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GerenciadorRequisicoes {
    private HttpClient httpClient;
    private HttpRequest httpRequest;
    private HttpResponse<String> httpResponse;
    private Cep cep;
    private String url;

    public GerenciadorRequisicoes(Cep cep) {
        this.cep = cep;
        this.url = "https://viacep.com.br/ws/" + cep.toString() + "/json";
        try {
            this.httpClient = HttpClient.newHttpClient();
            this.httpRequest = HttpRequest.newBuilder().uri(URI.create(url)).build();
            this.httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public HttpResponse<String> getResponse() {
        return httpResponse;
    }
}