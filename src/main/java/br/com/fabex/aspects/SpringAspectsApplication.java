package br.com.fabex.aspects;

import br.com.fabex.aspects.configs.ProjectConfig;
import br.com.fabex.aspects.services.BaseService;
import br.com.fabex.aspects.services.bo.BusinessService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAspectsApplication {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        BaseService bean = context.getBean(BaseService.class);
        bean.executor();
        /* Not applied to static methods */
        BaseService.executorr();

        /* Two aspects applied in same annotation: @ControllAccessBusiness */
        BusinessService bean1 = context.getBean(BusinessService.class);
        bean1.executorBusiness("Fabex", 171);

    }
}
