package br.com.fabex.aspects.services;

import br.com.fabex.aspects.annotations.LogExecutionTime;
import org.springframework.stereotype.Service;

@Service
public class BaseService {

    @LogExecutionTime
    public void executor() {
        System.out.println("BaseService::executor");
    }

    @LogExecutionTime
    public static void executorr() {
        System.out.println("BaseService::executorStatic");
    }
}
