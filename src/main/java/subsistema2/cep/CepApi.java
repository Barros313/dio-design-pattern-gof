package subsistema2.cep;

public class CepApi {
    private static CepApi instance = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstance() {
        return instance;
    }

    public String getCityThroughPostalCode(String postalCode) {
        return "Recife";
    }

    public String getStateThroughPostalCode(String postalCode) {
        return "PE";
    }
}
