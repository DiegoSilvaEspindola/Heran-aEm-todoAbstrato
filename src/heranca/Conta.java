package heranca;

public abstract class Conta {
    protected int saldo;
    private String banco;
    private int numeroConta;
    private int agencia;
    private String nomeTitular;
    protected double valorSacado;
    protected double valorDepositado;

    public Conta(int saldo, String banco, int numeroConta, int agencia, String nomeTitular, double valorSacado, double valorDepositado) {
        this.saldo = saldo;
        this.banco = banco;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeTitular = nomeTitular;
        this.valorSacado = valorSacado;
        this.valorDepositado = valorDepositado;
    }

    public abstract double sacar();

    public abstract double depositar();

    public abstract double getSaldo();

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                ", banco='" + banco + '\'' +
                ", numeroConta=" + numeroConta +
                ", agencia=" + agencia +
                ", nomeTitular='" + nomeTitular + '\'' +
                '}';
    }
}
