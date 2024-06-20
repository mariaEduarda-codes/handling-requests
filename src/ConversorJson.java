import com.google.gson.Gson;

import java.net.http.HttpResponse;

public class ConversorJson {
    private final Gson gson = new Gson();

    public Endereco converterJson(HttpResponse<String> httpResponse) {
        return gson.fromJson(httpResponse.body(), Endereco.class);
    }
}
