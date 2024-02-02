package br.com.fabex.aspects.services.bo;

import br.com.fabex.aspects.annotations.ControllAccessBusiness;
import br.com.fabex.aspects.annotations.TraceBusiness;
import org.springframework.stereotype.Service;

@Service
public class BusinessService {

    @ControllAccessBusiness
    @TraceBusiness
    public void executorBusiness(String name, Integer codigo) {
        System.out.println("BusinessService::executorBusiness");
    }
}
