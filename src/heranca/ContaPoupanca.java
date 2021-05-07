package heranca;

public class ContaPoupanca extends Conta {
    protected int diaDeAniversario;
    protected double taxaJuros;

    public ContaPoupanca(int saldo, String banco, int numeroConta, int agencia, String nomeTitular, double valorSacado, double valorDepositado, int diaDeAniversario, double taxaJuros) {
        super(saldo, banco, numeroConta, agencia, nomeTitular, valorSacado, valorDepositado);
        this.diaDeAniversario = diaDeAniversario;
        this.taxaJuros = taxaJuros;
    }

    public double sacar() {
        return saldo - valorSacado;
    }

    public double depositar() {
        return saldo + valorDepositado;
    }

    public double getSaldo() {
        return saldo + taxaJuros * saldo;
    }


    }
