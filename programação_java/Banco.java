package programação_java;

public class Banco {

    Integer numeroConta;
    Integer agencia;
    Double saldo;
    String nomeTitular;

    public Banco(Integer numeroConta, Integer agencia, Double saldo, String nomeTitular){
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.nomeTitular = nomeTitular;
    }

    public void SaldoTotal(){
        System.out.println("======================");
        System.out.println("||  Saldo em conta  ||");
        System.out.println("======================");
        System.out.println("=> "+this.saldo);
    }

    public void Operacao(Double valor,Integer p1){
        if(p1==1){
            this.saldo += valor;
            SaldoTotal();
        }else if(p1==2){
            this.saldo -= valor;
            SaldoTotal();
        }
    }
}
