package subsistema1.crm;

public class CrmService {
    private CrmService() {
        super();
    }

    public static void saveClient(String name, String postalCode, String city, String state) {
        System.out.println("Saved client into CRM system.");
    }
}
