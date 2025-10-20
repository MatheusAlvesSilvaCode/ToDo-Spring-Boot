package io.github.MatheusAlvesCode.arquiteturaspring;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);

        SpringApplicationBuilder builder =
                new SpringApplicationBuilder(Application.class);
        builder.bannerMode(Banner.Mode.OFF);
        builder.profiles("produção");

        builder.run(args);

        // Contexto da aplicação já iniciada.
        ConfigurableApplicationContext applicationContext = builder.context();


        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        String applicationName = environment.getProperty("spring.application.name");

        System.out.println("Application Name: " + applicationName);



	}
}
