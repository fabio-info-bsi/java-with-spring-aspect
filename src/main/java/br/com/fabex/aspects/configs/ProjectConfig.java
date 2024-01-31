package br.com.fabex.aspects.configs;

import org.springframework.context.annotation.*;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"br.com.fabex.aspects.components", "br.com.fabex.aspects.services"})
public class ProjectConfig {

}
