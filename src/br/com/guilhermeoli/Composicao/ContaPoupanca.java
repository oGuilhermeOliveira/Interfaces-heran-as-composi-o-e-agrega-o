package br.com.guilhermeoli.Composicao;

/**
 * @author guiol
 */
public class ContaPoupanca {

    private Banco banco;

    private Double saldo;

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }
}
