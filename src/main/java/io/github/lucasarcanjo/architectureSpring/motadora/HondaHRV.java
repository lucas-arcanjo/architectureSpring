package io.github.lucasarcanjo.architectureSpring.motadora;

import java.awt.*;

public class HondaHRV extends Carro {

    public HondaHRV(Motor motor) {
        super(motor);
        setCor(Color.black);
        setModelo("HRV");
        setMontadora(Montadora.HONDA);
    }
}
