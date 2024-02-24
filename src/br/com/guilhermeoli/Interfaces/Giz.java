package br.com.guilhermeoli.Interfaces;

/**
 * @author guiol
 */
public class Giz implements ICaneta{
    @Override
    public void escrever(String texto) {
        System.out.println("Escrevendo o valor " + texto + "na classe " + getClass().getSimpleName());
    }

    @Override
    public String getColor() {
        return "Branco";
    }
}
