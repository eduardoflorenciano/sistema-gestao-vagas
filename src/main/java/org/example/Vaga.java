package org.example;

public class Vaga {
    private int numero;
    private String placa;
    private boolean ocupada;

    public Vaga(int numero) {
        this.numero = numero;
        this.ocupada = false;
        this.placa = null;
    }

    public int getNumero() {
        return numero;
    }

    public String getPlaca() {
        return placa;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    @Override
    public String toString() {
        if (ocupada) {
            return "Vaga " + numero + " | Status: OCUPADA | Placa: " + placa;

        } else {
            return "Vaga " + numero + " | Status: LIVRE   | Placa: ---";
        }
    }
}
