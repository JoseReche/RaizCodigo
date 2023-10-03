package programação_java.Exercicios.Exercicio5;

import java.util.Scanner;
/*
*1) Crie uma classe que represente uma Pessoa, devendo ter as propriedades Nome, Peso, Altura e Data de Nascimento e o método IMC, que retornará o valor do IMC. 
*2) Crie um programa que receba a pessoa criada e verifique qual o IMC. 

*    IMC	Classificação
*    Abaixo de 18,5	Abaixo do Peso
*    Entre 18,6 e 24,9	Peso Ideal
*    Entre 25,0 e 29,9	Levemente acima do peso
*    Entre 30,0 e 34,9	Obesidade Grau I
*    Entre 35,0 e 39,9	Obesidade Grau II
*    Acima de 40	Obesidade Grau III (mórbida) OK
*3) Crie uma classe que represente uma Conta Corrente, devendo ter as propriedades
*    Número da Conta, Agência, Saldo, Nome do Titular e os métodos Depósito, Saque e Saldo Total.
*4) Crie um programa que receba a conta corrente e deposite e saque valores, ao final imprimindo o saldo existente.
*5) Crie uma classe que calcule a área de uma circunferência, recebendo com valor inicial o raio
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
            System.out.println("|| [3] -  Raio                      ||");
            System.out.println("|| [4] -  Cifra cesar               ||");
            System.out.println("======================================");
            Banco banco = new Banco(00,00,0.0,"");
            Seta();
            op = scanner.nextInt();
            switch (op){
                case 0:{
                    System.out.println("Saindo...");
                    break;
                }
                case 1:{
                    Boolean condi = false;
                    Integer validCondi;
                    while (condi!=true){
                        String nome,dataNascimento;
                        Double peso,altura;
                        System.out.println("======================================");
                        System.out.println("||     Bem Vindo Ao Calculo IMC     ||");
                        System.out.println("======================================");
                        
                        System.out.println("Digite o nome da pessoa ");
                        Seta();
                        nome = scanner.next();
    
                        peso = ValidDouble(" Digite o Peso pessoa ");
    
                        altura = ValidDouble(" Digite o Altura pessoa ");
    
                        System.out.println("Digite a data de nascimento da pessoa ");
                        Seta();
                        dataNascimento = scanner.next();
    
                        Pessoa pessoa = new Pessoa(nome,peso,altura,dataNascimento);
                        pessoa.IMC();

                        System.out.println("Deseja continuar? [0] - Sim [1] - Não");
                        Seta();
                        validCondi = scanner.nextInt();
                        if (validCondi==1) {
                            condi = true;
                        }
                    }
                    break;
                }
                case 2:{
                    Integer escolha;
                    do{
                        System.out.println("======================================");
                        System.out.println("||    Bem Vindo Ao Banco Branco     ||");
                        System.out.println("||==================================||");
                        System.out.println("|| Selecione uma das opçoes a baixo ||");
                        System.out.println("|| [0] -  Retornar                  ||");
                        System.out.println("|| [1] -  Cadastrar                 ||");
                        System.out.println("|| [2] -  Saque                     ||");
                        System.out.println("|| [3] -  Deposito                  ||");
                        System.out.println("======================================");
                        escolha = scanner.nextInt();
                    switch(escolha){
                        case 0:{
                            System.out.println("Retornando ao menu anterior....");
                            break;
                        }
                        case 1:{// todo: Cadastro

                            System.out.println("Digite o nome da Do titular da conta ");
                            Seta();
                            banco.nomeTitular = scanner.next();
        
                            banco.numeroConta = ValidInt(" Digite o numero da Conta ");
        
                            banco.agencia = ValidInt(" Digite a agencia ");

                            banco.saldo = 0.0;                                
                            break;
                        }
                        case 2:{// todo: Saque
                            Double valor = ValidDouble("Digite o valor a ser Sacado ");
                            banco.SaldoTotal();
                            banco.Operacao(valor, 2);
                            break;
                        }
                        case 3:{// todo: Deposito
                            Double valor = ValidDouble("Digite o valor a ser Depositado ");
                            banco.SaldoTotal();
                            banco.Operacao(valor, 1);
                            break;
                        }

                    }}while(escolha!=0);
                    break;
                }
                case 3:{
                    Boolean condi = false;
                    Integer validCondi;
                    while (condi!=true){
                        Double valor=0.0;
                        System.out.println("======================================");
                        System.out.println("||    Bem Vindo Ao Calculo de Area   ||");
                        System.out.println("======================================");
                        
                        valor = ValidDouble(" Digite o raio do circulo ");
                        Raio raio = new Raio(valor);

                        Double calculo = raio.Calculo();
                        System.out.println("O calculo de Area da circulo é: "+calculo);
                        System.out.println("");
                        System.out.println("Deseja continuar? [0] - Sim [1] - Não");
                        Seta();
                        validCondi = scanner.nextInt();
                        
                        if (validCondi==1) {
                            System.out.println("Deseja ");
                            condi = true;
                            break;
                        }
                    }
                    break;
                }
                case 4:{
                    Boolean condi = false;
                    Integer validCondi;

                    while (condi!=true){
                        Integer valor;
                        String texto,mensagem;
                        System.out.println("======================================");
                        System.out.println("||    Bem Vindo Ao Calculo de Area   ||");
                        System.out.println("======================================");
                        valor = ValidInt(" Digite o valor constante ");
                        System.out.println("Digite a mensagem a ser criptografada");
                        Seta();
                        texto = scanner.next();
                        Cesar cesar = new Cesar(valor,texto);
                        mensagem = cesar.Embaralhador();
                        System.out.println(mensagem);
                        System.out.println("");
                        validCondi = ValidInt("Deseja continuar? [0] - Sim [1] - Não");
                        
                        if (validCondi==1) {
                            System.out.println("Deseja ");
                            condi = true;
                            break;
                        }
                    }
                    break;
                }
            }
        }while(op!=0);
        scanner.close();
    }
    public static Double ValidDouble(String txt){
        Scanner scanner = new Scanner(System.in);
        Double valor=0.0;
        try {
            System.out.println(txt);
            Seta();
            valor = scanner.nextDouble();
        }catch (Throwable t) {
            System.out.println("Digite um numero correto ");
            valor = ValidDouble(txt);
        }
        return valor;
    }
    public static Integer ValidInt(String txt){
        Scanner scanner = new Scanner(System.in);
        Integer valor=0;
        try {
            System.out.println(txt);
            Seta();
            valor = scanner.nextInt();
        }catch (Throwable t) {
            System.out.println("Digite um numero correto");
            valor = ValidInt(txt);
        }
        return valor;
    }
    public static void Seta(){
        System.out.print("=>  ");
    }
    
}
