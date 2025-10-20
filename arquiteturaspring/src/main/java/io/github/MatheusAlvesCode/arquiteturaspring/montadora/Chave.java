package io.github.MatheusAlvesCode.arquiteturaspring.montadora;

public class Chave {
    private Montadora montadora;
    private String tipo;

    public Montadora getMontadora() {
        return montadora;
    }

    public void setMontadora(Montadora montadora) {
        this.montadora = montadora;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Chave{" +
                "montadora=" + montadora +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
