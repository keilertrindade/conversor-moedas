import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Request {

    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";
    private static final String API_KEY = "859ecc89b91c358e082ad6d6";

    public Request() {
    }

    public static double getExchangeRate(String from, String to, double valor) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL + API_KEY
                        + "/latest/" + from))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();

        JsonParser parser = new JsonParser();
        JsonElement jsonTree = parser.parse(json);
        JsonObject jsonObject = jsonTree.getAsJsonObject();
        JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");

        //double fromValue = conversionRates.get(from).getAsDouble();
        double toValue = conversionRates.get(to).getAsDouble();
        return (valor*toValue);
        /*
        ARS - Peso argentino
        BOB - Boliviano boliviano
        BRL - Real brasileiro
        CLP - Peso chileno
        COP - Peso colombiano
        USD - Dólar americano
        */
    }
    }
