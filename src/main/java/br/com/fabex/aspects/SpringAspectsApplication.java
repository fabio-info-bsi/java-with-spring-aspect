package br.com.fabex.aspects;

import br.com.fabex.aspects.configs.ProjectConfig;
import br.com.fabex.aspects.services.BaseService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAspectsApplication {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        BaseService bean = context.getBean(BaseService.class);
        bean.executor();
        /* not applied to static methods */
        BaseService.executorr();

    }
}
