import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
         1) Crie um programa que questione a quantidade de notas a ser informada, receba as notas e calcule a média. 
         2) Crie um programa que imprima um arrays com Foreach. 
         3) Crie um programa que leia 10 valores double e salve em um array, depois imprima esses valores. 
         4) Crie um programa que leia 10 valores int e salve em um array, depois imprima se esses valores são pares ou ímpares. 
         5) Crie um programa que possua uma collection que represente as 52 cartas do baralho, imrpima elas. 
         6) Crie um programa que una duas listas de inteiros. 
         7) Crie um programa que simule a fila de atendimento de um banco. 
         8) Crie um programa que receba a temperatura média de cada mês do ano e após exiba a temperatura média do ano. 
         9) Crie dois arrays de 10 posições e depois gere um terceiro array com os valores intercalados desses dois arrays, ao final, imprima os 3. 
         10) Crie um programa que leia 20 valores, calcule a média aritmética desses valores e imprima os valores que são inferiores a esta média.

        DESAFIO
        Crie um program aque questione 5 perguntas:
        Telefonou a vítima?
        Esteve no local do crime?
        Mora perto da vítima?
        Devia para a vítima?
        Já trabalhou com a vítima?
        Conforme as respostas sim, deve imprimir a classificação da pessoa que respondeu:
        
        0-1 - Inocente
        2 - Suspeita
        3-4 - Cumplice
        5 - Assassino
         */
        int op;
        do {
            {// menu
                System.out.println(" ");
                System.out.println("===================== Bem vindo ===================================");
                System.out.println(" ");
                System.out.println("==========Escolha um dos exercicios para iniciar===================");
                System.out.println("[01] => Quantas Notas? ");
                System.out.println("[02] => Foreach");
                System.out.println("[03] => Double array");
                System.out.println("[04] => Integer array");
                System.out.println("[05] => Baralho");
                System.out.println("[06] => Unir Inteiros");
                System.out.println("[07] => Fila Banco");
                System.out.println("[08] => Temperatura ano");
                System.out.println("[09] => Inception de array");
                System.out.println("[10] => Média aritmética");
                System.out.println("[11] => DESAFIO");
                System.out.println("[12] => SAIR");
                op = scanner.nextInt();
            } // fecha menu
            switch (op) {
                case 1: {//Crie um programa que questione a quantidade de notas a ser informada, receba as notas e calcule a média. 
                    System.out.println("==================== Quantas Notas? ==============================");
                    float nota = 0,media = 0;
                    Integer quantidadeNota;
                    System.out.println("Digite a quantidade de notas que o aluno obteve");
                    System.out.print("=> ");
                    quantidadeNota = scanner.nextInt();
                    for (int i = 0; i < quantidadeNota; ) {
                        System.out.print("Insira a " + (i + 1) + "ª Nota => ");
                        nota = scanner.nextFloat();
                        if(nota>10||nota<0.0){
                            System.out.println("Nota Invalida digite novamente");
                        }else{
                            media += nota;
                            i++;
                        }
                    }
                    media = media / quantidadeNota;
                    if (media >= 7.0) {
                        System.out.print("Você foi aprovado com Média => " + media);
                    } else {
                        System.out.print("Você não foi aprovado pois sua Média é => " + media);
                    }
                    break;
                }//OK
                case 2: {// Crie um programa que imprima um arrays com Foreach.
                    System.out.println("===================== Foreach ==============================");
                    Integer[] numeros = { 1,2,3,4,5,6,7,8,9};
                    for(Integer numero : numeros){
                        System.out.println(numero);
                    }
                    break;
                }//OK
                case 3: {//Crie um programa que leia 10 valores double e salve em um array, depois imprima esses valores.
                    System.out.println("===================== Double array ==============================");
                    System.out.println(" ");
                    Double[] valores = {}; 
                    for(int i=0;i<=10;i++){
                        System.out.println("Digite um valor Decimal ");
                        System.out.print("=> ");
                        valores[i] = scanner.nextDouble();
                    }
                    break;
                }//Corrigir
                case 4: {//Crie um programa que leia 10 valores int e salve em um array, depois imprima se esses valores são pares ou ímpares. 
                    System.out.println("===================== Integer array ==============================");
                    System.out.println(" ");
                    Integer[] valores = {}; 
                    for(int i=0;i<=10;i++){
                        System.out.println("Digite um valor Decimal ");
                        System.out.print("=> ");
                        valores[i] = scanner.nextInt();
                    }
                    break;
                }//Corrigir
                case 5: {//Crie um programa que possua uma collection que represente as 52 cartas do baralho, imrpima elas.
                    System.out.println("===================== Baralho ==============================");
                    System.out.println(" ");
                     // Criando um ArrayList de strings (Tipo da carta)
                    ArrayList<String> simbolos = new ArrayList<>();
                    ArrayList<String> valores = new ArrayList<>();
                    // Adicionando elementos ao ArrayList Simbolos
                    simbolos.add(" ♥ ");
                    simbolos.add(" ♣ ");
                    simbolos.add(" ♦ ");
                    simbolos.add(" ♠ ");
                    // Adicionando elementos ao ArrayList
                    valores.add(" A ");
                    valores.add(" 2 ");
                    valores.add(" 3 ");
                    valores.add(" 4 ");
                    valores.add(" 5 ");
                    valores.add(" 6 ");
                    valores.add(" 7 ");
                    valores.add(" 8 ");
                    valores.add(" 9 ");
                    valores.add(" 10 ");
                    valores.add(" J ");
                    valores.add(" Q ");
                    valores.add(" K ");
                    for(int i=1; i<=4;i++) {
                        int j;
                        if(i==1){
                            System.out.println("Cartas da coleção de Copas");  
                        }else if(i==2){
                            System.out.println("Cartas da coleção de Paus"); 
                        }else if(i==3){
                            System.out.println("Cartas da coleção de Oros");     
                        }else if(i==4){
                            System.out.println("Cartas da coleção de Espadas"); 
                        }
                        for(int y=0;y<13;y++){
                            System.out.println(valores.get(y)+simbolos.get(i-1));
                        }
                    }
                    break;
                }//OK
                case 6: {//Crie um programa que una duas listas de inteiros
                    System.out.println("===================== Unir Inteiros ==============================");
                    System.out.println(" ");
                    // Criando um array de inteiros
                    int[] numero1 = {1, 2, 3, 4, 5};
                    int[] numero2 = {6, 7, 8, 9, 10};
                    int[] numero = new int[50];
                    int calculo = numero1.length + numero2.length;
                    int y;
                    for(int i=0;i<=calculo;i++){
                        if(i<=numero1.length){
                            numero[i] = numero1[i]; 
                        }else{
                            numero[i] = numero2[i];
                        }
                    for(int i=0;i<=numero.length;i++){
                        System.out.println(numero[i]);
                    }
                    break;
                }//Corrigir
                case 7: {//Crie um programa que simule a fila de atendimento de um banco.
                    System.out.println("===================== Fila Banco ==============================");
                    System.out.println(" ");
                    int escolha;
                    for(int y=0;y<=1;){
                        for(int i=0;i<=100;i++){
                            System.out.println("nº "+(i+1)+" Guiche 5");
                            System.out.println(" tecle 0 para Chamar outro numero ");
                            System.out.println(" tecle 1 para encerrar");
                            escolha = scanner.nextInt(); 
                            if(escolha==1){
                                i=101;
                                y=2;
                            }
                        }
                    }
                    break;
                }//OK
                case 8: {//Crie um programa que receba a temperatura média de cada mês do ano e após exiba a temperatura média do ano.
                    System.out.println("===================== Temperatura Ano ============================");
                    System.out.println(" ");
                    Double temperatura;
                    Double media=0.0;
                    for(int i=0;i<12;i++){
                        System.out.println("Digite a temperatura do mês");
                        temperatura = scanner.nextDouble();
                        media +=temperatura;
                    }
                    media = media/12;
                    System.out.println("A temperatura média é : "+media);
                    break;
                }//OK
                case 9: {//Crie dois arrays de 10 posições e depois gere um terceiro array com os valores intercalados desses dois arrays, ao final, imprima os 3.
                    System.out.println("===================== IMC ==============================");
                    System.out.println(" ");
                    int[] numero1 = new int[9];
                    int[] numero2 = new int[9];
                    int[] numerosJuntos = new int[19];
                    for(int i=0;i<10;){
                        numerosJuntos[i] = numero1[i];
                        numerosJuntos[(i+1)] = numero2[i];
                        i+=2;
                    }
                    break;
                }
                case 10: {//Crie um programa que leia 20 valores, calcule a média aritmética desses valores e imprima os valores que são inferiores a esta média.
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
                case 11:{
                    /*Crie um program aque questione 5 perguntas:
                    Telefonou a vítima?
                    Esteve no local do crime?
                    Mora perto da vítima?
                    Devia para a vítima?
                    Já trabalhou com a vítima?
                    Conforme as respostas sim, deve imprimir a classificação da pessoa que respondeu:
                    0-1 - Inocente
                    2 - Suspeita
                    3-4 - Cumplice
                    5 - Assassino
                     */
                    break;
                }
            }

        } while (op < 11);
    }
}
