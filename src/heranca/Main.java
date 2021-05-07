package heranca;

public class Main {
    public static void main (String args[]){

    ContaCorrente cc = new ContaCorrente(00,"Itaú",001, 02,"Ricardo",00,00,1000);
    if ((cc.saldo + cc.limite) < cc.valorSacado){
        System.out.println("Não é possível realizar mais saques");
    }
    ContaSalario cs = new ContaSalario(1000,"BB",0101,02,"João",00,00,1000);


    ContaPoupanca cp = new ContaPoupanca(100, "Bamerindos",010, 0011,"José",00,00,10,00);
    if(cp.diaDeAniversario == 10){
        cp.taxaJuros = 100;
    }

    }
}
