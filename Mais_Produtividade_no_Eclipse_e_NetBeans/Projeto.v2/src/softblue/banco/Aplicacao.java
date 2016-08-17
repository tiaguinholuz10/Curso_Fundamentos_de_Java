package softblue.banco;

import softblue.banco.contacorrente.ContaCorrente;
import java.util.ArrayList;
import java.util.List;

public class Aplicacao {

    public static void main(String[] args) {

        try {
            ContaCorrente c1 = new ContaCorrente();
            c1.depositar(2000);
            c1.sacarDinheiro(200);

            ContaCorrente c2 = new ContaCorrente();
            c2.depositar(500);

            List<ContaCorrente> lista = new ArrayList<>();
            lista.add(c1);
            lista.add(c2);
            
            for (ContaCorrente conta : lista) {
                System.out.println(conta.getSaldo());
            }

        } catch (ValorInvalidoException ex) {
            ex.printStackTrace();
        }
    }
}
