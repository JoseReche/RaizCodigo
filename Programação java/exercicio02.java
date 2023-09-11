import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
         * # Exercícios de Revisão
         * 1) Crie um programa que receba três notas calcule a média e diga se foi
         * aprovado
         * (`(nota1 + nota2 + nota3 / 3)`) e (`média maior que 7 para ser aprovado`).
         *
         * 2) Crie um programa que receba um número e indique o mês que representa.
         *
         * 3) Crie um programa que simule um jogo da forca, com a entrada da palavra
         * oculta,
         * a quantidade de tentativas para acerto e depois solicite a entrada da letra.
         * A cada erro deve imprimir a quantidade de tentativas restantes e o 'membro'
         * que foi marcado. Ao final deve imprimir se acertou ou não a palavra e se foi
         * 'enforcado'.
         *
         * 4) Crie um programa que imprima a tabuada de 0 a 10.
         * 5) Crie um programa que receba uma String e imprima linha a linha suas
         * letras.
         * 6) Crie um programa que de a soma de todos os números ímpares e múltiplos de
         * 7 entre 1 e 500.
         * 7) Crie um programa que tenha como entrada as notas de um aluno. Somente se
         * encerrará quando
         * for inserida uma nota negativa. Ao final deverá informar a média das notas.
         *
         * 8) Crie um programa que receba um valor e imprima o fatorial desse número.
         * Ex.: 3! = 3 x 2 x 1 = 6.
         * 9) Crie um programa que receba a altura e o peso e calcule o IMC:
         *
         * IMC | Classificação
         * --- | ------
         * Abaixo de 18,5 | Abaixo do Peso
         * Entre 18,6 e 24,9 | Peso Ideal
         * Entre 25,0 e 29,9 | Levemente acima do peso
         * Entre 30,0 e 34,9 | Obesidade Grau I
         * Entre 35,0 e 39,9 | Obesidade Grau II
         * Acima de 40 | Obesidade Grau III (mórbida)
         * 10) Crie um programa que receba dois valores e solicite a operação a ser
         * realizada (+ - * /). Ao final imprima o resultado.
         *
         * ## DESAFIO
         *
         * **Crie um programa que receba um valor em reais e determine qual o mínimo de
         * notas
         * necessárias para entregá-lo. <br> Notas: R$ 100, R$ 50, R$ 10, R$ 5, R$ 1
         * <br> Exemplo: R$ 15 -> 1 nota de R$ 10 e 1 nota de R$ 5**
         */
        int op;
        do {
            {// menu
                System.out.println(" ");
                System.out.println("===================== Bem vindo ===================================");
                System.out.println(" ");
                System.out.println("==========Escolha um dos exercicios para iniciar===================");
                System.out.println("[01] => Cálculo de Média");
                System.out.println("[02] => Mes de referencia");
                System.out.println("[03] => Forca");
                System.out.println("[04] => Tabuada");
                System.out.println("[05] => Soletrando");
                System.out.println("[06] => Multiplos 1 - 500");
                System.out.println("[07] => Calculo de nota");
                System.out.println("[08] => Fatorial");
                System.out.println("[09] => IMC");
                System.out.println("[10] => Calculadora");
                System.out.println("[11] => Conversora");
                op = scanner.nextInt();
            } // fecha menu
            switch (op) {
                case 1: {
                    System.out.println("==================== Calculo de Média ==============================");
                    float nota = 0;
                    float media = 0;
                    for (int i = 0; i < 3; i++) {
                        System.out.print("Insira a " + (i + 1) + "ª Nota => ");
                        nota = scanner.nextFloat();
                        media += nota;
                    }
                    media = media / 3;
                    if (media >= 7.0) {
                        System.out.print("Você foi aprovado com Média => " + media);
                    } else {
                        System.out.print("Você não foi aprovado pois sua Média é => " + media);
                    }
                    break;
                }
                case 2: {
                    System.out.println("===================== Mes de referencia ==============================");
                    int mes;
                    String[] mesReferente = { "janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho",
                            "agosto", "setembro", "outubro", "novembro", "dezembro" };
                    System.out.print("Insira o numero referente ao mês => ");
                    mes = scanner.nextInt();
                    System.out.print("O mês Referente é => " + mesReferente[mes - 1]);
                    break;
                }
                case 3: {
                    String palavraOculta = "JAVA";
                    int tentativas = 6;
                    System.out.println("Bem-vindo ao Jogo da Forca!");
                    StringBuilder progresso = new StringBuilder("_".repeat(palavraOculta.length()));

                    while (tentativas > 0 && progresso.toString().contains("_")) {
                        System.out.println("Palavra: " + progresso);
                        System.out.println("Tentativas restantes: " + tentativas);
                        System.out.print("Digite uma letra: ");
                        char letra = scanner.next().toUpperCase().charAt(0);

                        if (progresso.toString().indexOf(letra) != -1) {
                            System.out.println("Você já tentou essa letra.");
                            continue;
                        }
                        boolean acertou = false;
                        for (int i = 0; i < palavraOculta.length(); i++) {
                            if (palavraOculta.charAt(i) == letra) {
                                progresso.setCharAt(i, letra);
                                acertou = true;
                            }
                        }
                        if (!acertou) {
                            tentativas--;
                        }
                    }
                    if (progresso.toString().equals(palavraOculta)) {
                        System.out.println("Parabéns! Você acertou a palavra: " + palavraOculta);
                    } else {
                        System.out.println("Suas tentativas acabaram. A palavra era: " + palavraOculta);
                    }
                    break;
                }
                case 4: {
                    System.out.println("===================== Tabuada ==============================");
                    int num, multiplica;
                    System.out.print("Insira o numero a ser feito a tabuada => ");
                    num = scanner.nextInt();
                    for (int i = 0; i <= 10; i++) {
                        multiplica = num * i;
                        System.out.println(num + " X " + i + " = " + multiplica);
                    }
                    break;
                }
                case 5: {
                    System.out.println("===================== Soletrando ==============================");
                    String palavra;
                    System.out.print("Insira a palavra a ser soletrada => ");
                    palavra = scanner.next();
                    for (int i = 0; i < palavra.length(); i++) {
                        char letra = palavra.charAt(i);
                        System.out.println(i + 1 + " => " + letra);
                    }
                    break;
                }
                case 6: {
                    System.out.println("===================== Multiplos 1 - 500 ==============================");
                    int soma = 0, y = 1;
                    for (int i = 1; i <= 500; i++) {
                        if (i % 2 != 0) {
                            if (i % 7 == 0) {
                                soma = soma + i;
                                System.out.println((y) + "º => " + soma);
                                y++;
                            }
                        }
                    }
                    break;
                }
                case 7: {
                    System.out.println("===================== Calculo de nota ==============================");
                    int soma = 0, y = 1;
                    for (int i = 1; i <= 500; i++) {
                        if (i % 2 != 0) {
                            if (i % 7 == 0) {
                                soma = soma + i;
                                System.out.println((y) + "º => " + soma);
                                y++;
                            }
                        }
                    }
                    break;
                }
                case 8: {
                    int parcelas, result, denominador;
                    System.out.println("===================== Fatorial ============================");
                    System.out.println("+---------------------------------------------------------+");
                    System.out.println("|           1    1    1    1    1     1      1     ...    |");
                    System.out.println("| [1]  1 + -- + -- + -- + -- + --- + --- + ----- + ---    |");
                    System.out.println("|           3    9   27   81   243   729   2.187   ...    |");
                    System.out.println("+---------------------------------------------------------+");
                    System.out.println("Para começar Digite a quantidade de Parcelas");
                    System.out.println("=> ");
                    parcelas = scanner.nextInt();
                    /*
                     * o i começa com 1 pq na minha concepção tem que entrar no for
                     * para contabilizar a primeira parcela q eh de 1/3
                     */
                    result = 1;// Numero de cima
                    denominador = 3;// Numero de baixo
                    for (int i = 1; i <= parcelas; i++) {
                        result = result + denominador;
                        denominador = denominador * 3;// Aqui ele vai multiplicar para a proxima volta
                    }
                    System.out.println(" O resultado é: " + result);
                    break;
                }
                case 9: {
                    System.out.println("===================== IMC ==============================");
                    Double altura, peso, calculo;
                    System.out.print("Digite sua altura => ");
                    altura = scanner.nextDouble();
                    System.out.print("Digite seu peso => ");
                    peso = scanner.nextDouble();
                    calculo = peso / (altura * 2);
                    if (calculo <= 18.5) {
                        System.out.print("Você está Abaixo do Peso");
                    } else if (calculo >= 18.6 && calculo <= 24.9) {
                        System.out.print("Você está com o Peso Ideal");
                    } else if (calculo >= 25.0 && calculo <= 29.9) {
                        System.out.print("Você está Levemente acima do peso");
                    } else if (calculo >= 30.0 && calculo <= 34.9) {
                        System.out.print("Você está com Obesidade Grau I");
                    } else if (calculo >= 35.0 && calculo <= 39.9) {
                        System.out.print("Você está com Obesidade Grau II");
                    } else {
                        System.out.print("Você está com Obesidade Grau III (mórbida)");
                    }
                    break;
                }
                case 10: {
                    System.out.println("===================== Calculadora ==============================");
                    Double numero1, numero2, calculo;
                    Integer operador;
                    System.out.print("Digite o primeiro numero => ");
                    numero1 = scanner.nextDouble();
                    System.out.println("[1] (-) Subtração");
                    System.out.println("[2] (+) Adição");
                    System.out.println("[3] (*) Multiplicação");
                    System.out.println("[4] (/) Divisão");
                    System.out.println("[5] (%) Resto de Divisão");
                    System.out.print("Digite um operador  => ");
                    operador = scanner.nextInt();
                    System.out.print("Digite o segundo numero => ");
                    numero2 = scanner.nextDouble();
                    if (operador == 1) {
                        calculo = numero1 - numero2;
                        System.out.print("O resultado de " + numero1 + " - " + numero2 + " é : " + calculo);
                    } else if (operador == 2) {
                        calculo = numero1 + numero2;
                        System.out.print("O resultado de " + numero1 + " + " + numero2 + " é : " + calculo);
                    } else if (operador == 3) {
                        calculo = numero1 * numero2;
                        System.out.print("O resultado de " + numero1 + " * " + numero2 + " é : " + calculo);
                    } else if (operador == 4) {
                        calculo = numero1 / numero2;
                        System.out.print("O resultado de " + numero1 + " / " + numero2 + " é : " + calculo);
                    } else if (operador == 5) {
                        calculo = numero1 % numero2;
                        System.out.print("O resultado de " + numero1 + " % " + numero2 + " é : " + calculo);
                    } else {
                        System.out.print("Informe um numero válido ");
                    }
                    break;
                }
                case 11: {
                    System.out.println("===================== Conversora ==============================");
                    Integer valor,nota1,nota2,nota5,nota10,nota20,nota50,nota100,nota200;
                    System.out.println("Digite o valor em reais:");
                    valor = scanner.nextInt();

                    nota200 = valor / 200;
                    valor %= 200;

                    nota100 = valor / 100;
                    valor %= 100;

                    nota50 = valor / 50;
                    valor %= 50;

                    nota20 = valor / 20;
                    valor %= 20;

                    nota10 = valor / 10;
                    valor %= 10;

                    nota5 = valor / 5;
                    valor %= 5;
                    
                    nota2 = valor / 2;
                    valor %= 2;

                    nota1 = valor;

                    System.out.println("Notas necessárias:");
                    System.out.println("R$ 200: " + nota200);
                    System.out.println("R$ 100: " + nota100);
                    System.out.println("R$ 50: " + nota50);
                    System.out.println("R$ 20: " + nota20);
                    System.out.println("R$ 10: " + nota10);
                    System.out.println("R$ 5: " + nota5);
                    System.out.println("R$ 2: " + nota2);
                    System.out.println("R$ 1: " + nota1);
                    break;
                }
                default: {
                    break;
                }
            }

        } while (op < 13);
    }
}
