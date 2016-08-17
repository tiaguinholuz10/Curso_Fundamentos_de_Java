package softblue.banco;

public abstract class Conta {
    
        private double saldo;

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract void sacarDinheiro(double valor) throws ValorInvalidoException;
    
    public abstract void depositar(double valor) throws ValorInvalidoException;
}
