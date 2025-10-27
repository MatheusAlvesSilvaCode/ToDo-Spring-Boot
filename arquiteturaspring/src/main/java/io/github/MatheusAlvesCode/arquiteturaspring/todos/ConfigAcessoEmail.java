package io.github.MatheusAlvesCode.arquiteturaspring.todos;

import io.github.MatheusAlvesCode.arquiteturaspring.AppProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class ConfigAcessoEmail {

    @Autowired
    private AppProperties properties;

    @Bean
    public MailSender mailSender(){
        return null;
    }
}
