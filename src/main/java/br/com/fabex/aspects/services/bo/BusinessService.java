package br.com.fabex.aspects.services.bo;

import br.com.fabex.aspects.annotations.ControllAccessBusiness;
import org.springframework.stereotype.Service;

@Service
public class BusinessService {

    @ControllAccessBusiness
    public void executorBusiness() {
        System.out.println("BusinessService::executorBusiness");
    }
}
