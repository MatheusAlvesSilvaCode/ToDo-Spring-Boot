package io.github.MatheusAlvesCode.arquiteturaspring.montadora;

import java.awt.*;

public class HondaHRV extends Carro {

    public HondaHRV(Motor motor) {
        super(motor);
        setColor(Color.BLACK);
        setModelo("HRV");
        setMontadora(Montadora.HONDA);
    }
}
