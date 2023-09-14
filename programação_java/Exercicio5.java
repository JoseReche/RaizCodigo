package programação_java;

import programação_java.Pessoa;
import programação_java.Banco;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
/*
1) Crie uma classe que represente uma Pessoa, devendo ter as propriedades Nome, Peso, Altura e Data de Nascimento e o método IMC, que retornará o valor do IMC.
2) Crie um programa que receba a pessoa criada e verifique qual o IMC. OK

    IMC	Classificação
    Abaixo de 18,5	Abaixo do Peso
    Entre 18,6 e 24,9	Peso Ideal
    Entre 25,0 e 29,9	Levemente acima do peso
    Entre 30,0 e 34,9	Obesidade Grau I
    Entre 35,0 e 39,9	Obesidade Grau II
    Acima de 40	Obesidade Grau III (mórbida) OK
3) Crie uma classe que represente uma Conta Corrente, devendo ter as propriedades
    Número da Conta, Agência, Saldo, Nome do Titular e os métodos Depósito, Saque e Saldo Total.
4) Crie um programa que receba a conta corrente e deposite e saque valores, ao final imprimindo o saldo existente.
5) Crie uma classe que calcule a área de uma circunferência, recebendo com valor inicial o raio
6) Crie uma classe para Cifra de César, devendo ter um método criptografia e receba como valor inicial uma mensagem e o valor constante.
    Cifra de César é uma das criptografias mais antigas conhecidas, onde a chave está no valor constante, para cada letra do alfabeto atribuí-se um número
    (exemplo: A=1;B=2;C=3,etc), então para cada letra da mensagem, soma-se o valor correspondente a esta letra ao valor constante,
    gerando uma nova letra para formar a nova mensagem, ou seja, a mensagem "Ataque a roma" com um valor constante de 3 seria "dwdtxh d urpd". Dica, utilize arrays para isso.
*/
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op;
        do{
            System.out.println("======================================");
            System.out.println("||      Bem Vindo Ao Exercicio      ||");
            System.out.println("||==================================||");
            System.out.println("|| Selecione uma das opçoes a baixo ||");
            System.out.println("|| [0] -  Sair                      ||");
            System.out.println("|| [1] -  IMC                       ||");
            System.out.println("|| [2] -  Banco                     ||");
            System.out.println("======================================");
            System.out.print("=>  ");
            op = scanner.nextInt();
            switch (op){
                case 0:{
                    System.out.println("Saindo...");
                    break;
                }
                case 1:{
                    String nome,dataNascimento;
                    Double peso,altura;
                    System.out.println("======================================");
                    System.out.println("||     Bem Vindo Ao Calculo IMC     ||");
                    System.out.println("||==================================||");

                    System.out.println("Digite o nome da pessoa ");
                    System.out.print("=>  ");
                    nome = scanner.next();
                    peso = valid();
                    System.out.print("=>  "+peso);
                    altura = valid();
                    System.out.print("=>  "+altura);
                   
                    peso = scanner.nextDouble(); 

                    System.out.println("Digite a altura da pessoa ");
                    altura = scanner.nextDouble();

                    System.out.println("Digite a data de nascimento da pessoa ");
                    System.out.print("=>  ");
                    dataNascimento = scanner.next();

                    Pessoa pessoa = new Pessoa(nome,peso,altura,dataNascimento);
                    pessoa.IMC();
                    break;
                }
                case 2:{
                    
                    break;
                }
            }
        }while(op!=0);
        scanner.close();
    }
    public static Double valid(){
        Scanner scanner = new Scanner(System.in);
        Double valor=0.0;
        try {
            System.out.println("Digite o peso da pessoa ");
            System.out.print("=>  ");
            valor = scanner.nextDouble();
        }catch (Throwable t) {
            System.out.println("Ocorreu uma exceção: "+ t.getMessage()+"   "+ valor);
            valor = valid();
        }
        
        return valor;
    }
}
