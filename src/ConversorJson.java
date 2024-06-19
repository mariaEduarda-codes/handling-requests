import com.google.gson.Gson;

import java.net.http.HttpResponse;

public class ConversorJson {
    private Gson gson = new Gson();
    private HttpResponse<String> httpResponse;

    public Endereco converterJson(HttpResponse<String> httpResponse) {
        return gson.fromJson(httpResponse.body(), Endereco.class);
    }
}
