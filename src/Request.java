import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Request {

    private static final String BASE_URL = "https://api.exchangerate.host";

    public static double getExchangeRate(String from, String to) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL
                        + "/latest?base=" + from))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Aqui você precisará parsear o JSON da resposta para extrair a taxa desejada
        // Utilize uma biblioteca como Jackson ou Gson para isso.
        // Por exemplo, usando Jackson:
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(response.body());
        JsonNode rates = root.get("rates");
        return rates.get(to).asDouble();
    }

    public static void main(String[] args) throws Exception {
        double exchangeRate = getExchangeRate("USD", "BRL");
        System.out.println("1 USD = " + exchangeRate + " BRL");
    }
    }
