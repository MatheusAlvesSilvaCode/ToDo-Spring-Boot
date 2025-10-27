package io.github.MatheusAlvesCode.arquiteturaspring;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExemploValue {

    @Value("${app.config.variavel}")
    private String variaverl;

    public void ImprimirVariavel(){
        System.out.println(variaverl);
    }
}
