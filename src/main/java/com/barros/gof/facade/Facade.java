package com.barros.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

public class Facade {
    public void migrateClient(String name, String postalCode) {
        String city = CepApi.getInstance().getCityThroughPostalCode(postalCode);
        String state = CepApi.getInstance().getStateThroughPostalCode(postalCode);

        CrmService.saveClient(name, postalCode, city, state);
    }
}
