package io.github.MatheusAlvesCode.arquiteturaspring.montadora.configuration;

import io.github.MatheusAlvesCode.arquiteturaspring.montadora.Motor;
import io.github.MatheusAlvesCode.arquiteturaspring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MontadoraConfiguration {


    // O nome do Bean não precisa ser o nome do método, pode ser outro.
    @Bean(name = "motorAspirado" ) // Bean é quando você retorna o objeto construído.
    public Motor motorAspirado(){
        var motor = new Motor();
        motor.setCavalos(110);
        motor.setTipoMotor(TipoMotor.ASPIRADO);
        motor.setCilindros(4);
        motor.setModelo("HONDA");
        motor.setLitragem(1.8);
        return motor;
    }
    @Bean(name = "motorEletrico" ) // Bean é quando você retorna o objeto construído.
    public Motor motorEletrico(){
        var motor = new Motor();
        motor.setCavalos(150);
        motor.setTipoMotor(TipoMotor.ELETRICO);
        motor.setCilindros(2);
        motor.setModelo("TH-10");
        motor.setLitragem(1.8);
        return motor;
    }

    @Primary // Tranformo em Padrão esse bean, caso tenha mais de 1
    @Bean(name = "motorTurbo" ) // Bean é quando você retorna o objeto construído.
    public Motor motorTurbo(){
        var motor = new Motor();
        motor.setCavalos(230);
        motor.setTipoMotor(TipoMotor.TURBO);
        motor.setCilindros(8);
        motor.setModelo("XPTO");
        motor.setLitragem(2.0);
        return motor;
    }

}
