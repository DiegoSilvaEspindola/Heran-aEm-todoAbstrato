package heranca;

public class ContaSalario extends Conta {
    private double salario;

    public ContaSalario(int saldo, String banco, int numeroConta, int agencia, String nomeTitular, double valorSacado, double valorDepositado, double salario) {
        super(saldo, banco, numeroConta, agencia, nomeTitular, valorSacado, valorDepositado);
        this.salario = saldo;
    }

    public double sacar(){
        return this.salario - this.valorSacado ;
    }

    public double depositar(){
        return this.salario + this.valorDepositado;
    }

    public double getSaldo(){
        return salario;
    }
}
