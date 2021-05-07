package heranca;

public class ContaCorrente extends Conta {
    protected double limite = 1000;

    public ContaCorrente(int saldo, String banco, int numeroConta, int agencia, String nomeTitular, double valorSacado, double valorDepositado, double limite) {
        super(saldo, banco, numeroConta, agencia, nomeTitular, valorSacado, valorDepositado);
        this.limite = limite;
    }


    public double sacar() {
            return (saldo + this.limite) - valorSacado;
        }

        public double depositar(){
            return this.saldo + this.valorDepositado;
        }

        public double getSaldo(){

            return this.saldo + this.limite;
        }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "limite=" + limite +
                '}';
    }
}
