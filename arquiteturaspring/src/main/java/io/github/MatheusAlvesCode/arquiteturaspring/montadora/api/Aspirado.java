package io.github.MatheusAlvesCode.arquiteturaspring.montadora.api;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// O Runtime significa quanto tempo essa anotação será mantida. no caso, o tempo de execução da aplicação
// Sem ele, o spring, que é um framework rodando no JVM nao vai ver a anotação.
@Retention(RetentionPolicy.RUNTIME)

// alvo, onde eu posso usar essa anotação
// ElementType.FIELD: Permite que você use a anotação em um atributo ou campo de uma classe (como o seu private Motor motor;).
// ElementType.METHOD: Permite que você use a anotação em um método (como o seu método @Bean na configuração).
@Target({ElementType.FIELD, ElementType.METHOD})

// Dizendo que essa anotation é o motorAspirado.
@Qualifier("motorAspirado")
public @interface Aspirado {
}
