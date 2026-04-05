package io.github.lucasarcanjo.architectureSpring.motadora.configuration;

import io.github.lucasarcanjo.architectureSpring.motadora.Motor;
import io.github.lucasarcanjo.architectureSpring.motadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MontadoraConfiguration {

    @Bean(name = "motorAspirado")
    public Motor motorAspirado() {
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setLitragem(2.0);
        motor.setModelo("XPTO-0");
        motor.setTipo(TipoMotor.ASPIRADO);
        return motor;
    }

    @Primary
    @Bean(name = "motorEletrico")
    public Motor motorEletrico() {
        var motor = new Motor();
        motor.setCavalos(110);
        motor.setCilindros(3);
        motor.setLitragem(1.4);
        motor.setModelo("TO-40");
        motor.setTipo(TipoMotor.ELETRICO);
        return motor;
    }

    @Bean(name = "motorTurbo")
    public Motor motorTurbo() {
        var motor = new Motor();
        motor.setCavalos(180);
        motor.setCilindros(3);
        motor.setLitragem(1.5);
        motor.setModelo("XP-01");
        motor.setTipo(TipoMotor.TURBO);
        return motor;
    }
}
