
package softblue.banco.contacorrente;

import softblue.banco.Conta;
import softblue.banco.ValorInvalidoException;

public class ContaCorrente extends Conta {

    @Override
    public void sacarDinheiro(double valor) throws ValorInvalidoException {
        
        if (valor <= 0) {
            throw new ValorInvalidoException();
        }
        
        setSaldo(getSaldo() - valor);
    }

    @Override
    public void depositar(double valor) throws ValorInvalidoException {
        if (valor <= 0) {
            throw new ValorInvalidoException();
        }
        
        setSaldo(getSaldo() + valor);
    }
}
