package br.com.guilhermeoli.Interfaces;

public interface ICaneta {

    public void escrever(String texto);
    public String getColor();

    default void escreverComumATodas() {
        System.out.println("Escrita igual a todas");
    }
}
