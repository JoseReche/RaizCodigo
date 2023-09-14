package programação_java;
import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
         * 4) Crie um programa que leia 10 valores int e salve em um array, depois
         * imprima se esses valores são pares ou ímpares.
         * 5) Crie um programa que possua uma collection que represente as 52 cartas do
         * baralho, imrpima elas.
         * 6) Crie um programa que una duas listas de inteiros.
         * 7) Crie um programa que simule a fila de atendimento de um banco.
         * 8) Crie um programa que receba a temperatura média de cada mês do ano e após
         * exiba a temperatura média do ano.
         * 9) Crie dois arrays de 10 posições e depois gere um terceiro array com os
         * valores intercalados desses dois arrays, ao final, imprima os 3. 10) Crie um
         * programa que leia 20 valores, calcule a média aritmética desses valores e
         * imprima os valores que são inferiores a esta média.
         * DESAFIO
         * Crie um program aque questione 5 perguntas:
         * Telefonou a vítima?
         * Esteve no local do crime?
         * Mora perto da vítima?
         * Devia para a vítima?
         * Já trabalhou com a vítima?
         * Conforme as respostas sim, deve imprimir a classificação da pessoa que
         * respondeu:
         * 0-1 - Inocente
         * 2 - Suspeita
         * 3-4 - Cumplice
         * 5 - Assassino
         */
        Integer op;
        do {
            {// menu
                System.out.println(" ");
                System.out.println("===================== Bem vindo ===================================");
                System.out.println(" ");
                System.out.println("==========Escolha um dos exercicios para iniciar===================");
                System.out.println("[01] => Notas aluno? será??");
                System.out.println("[02] => Foreach");
                System.out.println("[03] => Nota composta");
                System.out.println("[04] => ");
                System.out.println("[05] => ");
                System.out.println("[06] => ");
                System.out.println("[07] => ");
                System.out.println("[08] => ");
                System.out.println("[09] => ");
                System.out.println("[10] => ");
                System.out.println("[11] => ");
                op = scanner.nextInt();
            } // fecha menu
            switch (op) {
                case 1: {// Crie um programa que questione a quantidade de notas a ser informada, receba
                         // as notas e calcule a média.
                    Integer quantidadeNota;
                    Double media = 0.0, nota;
                    System.out.println("==================== Notas aluno? será?? ==============================");
                    System.out.println("Digite a quantidade de notas do aluno");
                    quantidadeNota = scanner.nextInt();
                    for (int i = 0; i < quantidadeNota; i++) {
                        System.out.print("Insira a " + (i + 1) + "ª Nota => ");
                        nota = scanner.nextDouble();
                        media = +nota;
                    }
                    media = media / 3;
                    break;
                }
                case 2: {// Crie um programa que imprima um arrays com Foreach.
                    System.out.println("===================== Foreach ==============================");
                    Integer escolha;
                    int[] numeros = new int[] { 1, 3, 5, 7, 9 };
                    System.out.print("Insira um numero => ");
                    escolha = scanner.nextInt();
                    System.out.println("contagem");
                    for (Integer numero : numeros) {
                        System.out.println(numero + escolha + " º");
                    }
                    break;
                }
                case 3: {//3) Crie um programa que leia 10 valores double e salve em um array, depois imprima esses valores.
                    System.out.println("===================== Nota composta ==============================");
                    Double[] nota = new Double[]{};
                    Double notaIncerida=1.0;
                    while(notaIncerida!=0.0){
                        int i = 0;
                        System.out.print("Digite a "+(i+1)+"ª Nota => ");
                        notaIncerida = scanner.nextDouble();
                        nota[i] = notaIncerida;
                    }
                    for(int y=0;y<=nota.length;y++){
                        System.out.println((y+1)+"ª nota = "+nota[y]);
                    }
                    break;
                }
                case 4: {
                    System.out.println("===================== Avaliação de valor ==============================");
                    int numero1, numero2;
                    System.out.print("Insira o Primeiro Numero => ");
                    numero1 = scanner.nextInt();
                    System.out.print("Insira o Segundo Numero => ");
                    numero2 = scanner.nextInt();
                    numero2 += numero2;
                    if (numero1 >= numero2) {
                        System.out.print("=> " + numero1 + " É maior que : " + numero2);
                    } else {
                        System.out.print("=> " + numero1 + " Não é maior que : " + numero2);
                    }
                    break;
                }
                case 5: {
                    System.out.println("===================== Baskara ==============================");
                    System.out.print("Digite o valor de a => ");
                    Double a, b, c, delta, raiz, raiz1, raiz2;
                    a = scanner.nextDouble();

                    System.out.print("Digite o valor de b => ");
                    b = scanner.nextDouble();

                    System.out.print("Digite o valor de c => ");
                    c = scanner.nextDouble();

                    delta = b * b - 4 * a * c;

                    if (delta < 0) {
                        System.out.println("A equação não possui raízes reais.");
                    } else if (delta == 0) {
                        raiz = -b / (2 * a);
                        System.out.println("A equação possui uma raiz real: " + raiz);
                    } else {
                        raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                        raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
                        System.out.println("A equação possui duas raízes reais");
                        System.out.println("Raiz 1: " + raiz1);
                        System.out.println("Raiz 2: " + raiz2);
                    }
                    break;
                }
                case 6: {
                    System.out.println("===================== Calculo Velocidade Média ======================");
                    Double tempo, distancia, velocidadeMed;
                    System.out.print("Digite a distancia percorrida em Km ");
                    distancia = scanner.nextDouble();
                    System.out.print("Digite o Tempo gasto referente a distancia em Horas => ");
                    tempo = scanner.nextDouble();
                    velocidadeMed = distancia / tempo;
                    System.out.print("O sua velocidade Média foi => " + velocidadeMed);
                    break;
                }
                case 7: {
                    System.out.println("===================== Faturamento ======================");
                    System.out.println("Digite o valor do faturamento:");
                    Double faturamento, imposto, percentualImposto;
                    faturamento = scanner.nextDouble();
                    System.out.println("Digite o valor do imposto:");
                    imposto = scanner.nextDouble();
                    percentualImposto = (imposto / faturamento) * 100;
                    System.out.println("O percentual de imposto pago é: " + percentualImposto + "%");
                    break;
                }
                case 8: {
                    System.out.println("===================== Par / Impar ==============================");
                    int numero = 0;
                    System.out.print("Insira o numero => ");
                    numero = scanner.nextInt();
                    numero = numero / 2;
                    if (numero == 0) {
                        System.out.print("O seu numero é par");
                    } else {
                        System.out.print("O seu numero é Impar");
                    }
                    break;
                }
                case 9: {
                    System.out.println("===================== Loguin ==============================");
                    String nomeCad = "admin";
                    String nome;
                    System.out.print("Insira o nome de usuario => ");
                    nome = scanner.next();
                    if (nome.equals(nomeCad)) {
                        System.out.print("Voce logou com sucesso");
                    } else {
                        System.out.print("Nome de usuario não identificado");
                    }
                    break;
                }
                case 10: {
                    System.out.println(
                            "===================== Converção de String para Inteiro ==============================");
                    String numero = "10.5";
                    System.out.println("numero em string " + numero);
                    Double numeroNovo = Double.parseDouble(numero);
                    System.out.println("numero em Double " + (numeroNovo + 0.5));
                    break;
                }
                case 11: {
                    System.out.println("===================== Imposto de Renda ==============================");
                    Double salario;
                    Double conta = 0.0;
                    System.out.print("Digite seu Salário Mensal => ");
                    salario = scanner.nextDouble();
                    if (salario <= 1903.98) {
                        System.out.print("Está isento de Imposto ");
                    } else if (salario >= 1903.99 && salario <= 2826.65) {
                        conta = 0.075;
                        conta = salario * conta;
                        System.out.print("Voce tera q pagar 7,5% para o governo: " + conta);
                    } else if (salario >= 2826.66 && salario <= 3751.05) {
                        // 15
                        conta = 0.15;
                        conta = salario * conta;
                        System.out.print("Voce tera q pagar 15% para o governo: " + conta);
                    } else if (salario >= 3751.06 && salario <= 4664.68) {
                        conta = 0.225;
                        conta = salario * conta;
                        System.out.print("Voce tera q pagar 22,5% para o governo: " + conta);
                    } else {
                        conta = 0.275;
                        conta = salario * conta;
                        System.out.print("Voce tera q pagar 27,5% para o governo: " + conta);
                    }
                    break;
                }
                default: {
                    // foda-se
                    break;
                }
            }
        } while (op < 12);
    }
}
