package programação_java.Exercicios;
import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
         * 1) Crie um programa que calcule a média ((nota1 + nota2 + nota3 / 3))
         * 2) Crie um programa que calcule a área (lado1 * lado2)
         * 3) Crie um programa que calcule o volume (largura * altura * profundidade)
         * 4) Crie um programa que avalie se um valor é maior do que o dobro de outro
         * valor
         * 5) Crie um programa que calcule bhaskara
         * 6) Crie um programa que calcule a velocidade média de uma viagem (distancia
         * (km) / tempo (h))
         * 7) Crie um programa que calcule o percentual de imposto pago (faturamento \
         * qtd imposto)
         * 8) Crie um programa que teste se um valor é par ou ímpar
         * 9) Crie um programa que compare dois valores Strings
         * 10) Crie um programa que tenha uma variável com ponto em String e converta
         * seu valor para inteiro
         * 11) Crie um programa que receba o salário e diga o valor de imposto de renda
         * conforme abaixo
         *
         * Base Alíquota
         * Até 1.903,98 Isento
         * De 1.903,99 até 2.826,65 7,5%
         * De 2.826,66 até 3.751,05 15%
         * De 3.751,06 até 4.664,68 22,5%
         * Acima de 4.664,68 27,5
         *
         */
        int op;
        do {
            {// menu
                System.out.println(" ");
                System.out.println("===================== Bem vindo ===================================");
                System.out.println(" ");
                System.out.println("==========Escolha um dos exercicios para iniciar===================");
                System.out.println("[01] => Cálculo de Média");
                System.out.println("[02] => Cálculo de Área");
                System.out.println("[03] => Cálculo de Volume");
                System.out.println("[04] => Avaliação de valor");
                System.out.println("[05] => Cálculo de Bhaskara");
                System.out.println("[06] => Cálculo de Velocidade média");
                System.out.println("[07] => Cálculo de Percentual");
                System.out.println("[08] => Par ou Impar");
                System.out.println("[09] => Compare duas Strings");
                System.out.println("[10] => Converção de String para Inteiro");
                System.out.println("[11] => Imposto de Renda");
                op = scanner.nextInt();
            } // fecha menu
            switch (op) {
                case 1: {
                    System.out.println("====================Calculo de Média ==============================");
                    Double nota, media = 0.0;
                    for (int i = 0; i < 3; i++) {
                        System.out.print("Insira a " + (i + 1) + "ª Nota => ");
                        nota = scanner.nextDouble();
                        media += nota;
                    }
                    media = media / 3;
                    System.out.print("A sua média é => " + media);
                    break;
                }
                case 2: {
                    System.out.println("=====================Calculo de Área ==============================");
                    Double lado1, lado2, area;
                    System.out.print("Insira o Primeiro lado => ");
                    lado1 = scanner.nextDouble();
                    System.out.print("Insira o Segundo lado => ");
                    lado2 = scanner.nextDouble();
                    area = lado1 * lado2;
                    System.out.print("A área é => " + area);
                    break;
                }
                case 3: {
                    System.out.println("=====================Calculo de Volume ==============================");
                    Double largura, altura, profund, volume;
                    System.out.print("Insira a largura => ");
                    largura = scanner.nextDouble();
                    System.out.print("Insira a altura => ");
                    altura = scanner.nextDouble();
                    System.out.print("Insira a profundidade => ");
                    profund = scanner.nextDouble();
                    volume = largura * altura * profund;
                    System.out.print("O seu volume é => " + volume);
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
