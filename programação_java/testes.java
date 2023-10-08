package programação_java;

import java.util.Scanner;

public class testes {
    public static String vermelho = "\u001B[31m";
    public static String verde = "\u001B[32m";
    public static String roxo = "\u001B[34m";
    public static String reset = "\u001B[0m";
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("seja bem vindo ");
        Integer texto = ValidInt("digite um numero",scanner);
        System.out.println("o texto é "+texto);
    }
    public static String ValidString(String txt,Scanner scanner){
        String parametro;
        char caracter;
        try {
            System.out.println(txt);
            System.out.print("=> ");
            parametro = scanner.next();
            for(int i=0;i<parametro.length();i++){
                caracter=parametro.charAt(i);
                if(Character.isDigit(caracter)){
                   throw new Exception(vermelho+"Digitação inválida. Favor digitar somente letras"+reset); 
                }
            }
            return (parametro);
        }catch (Exception e) {
            System.out.println(e);
           return ( ValidString(txt, scanner));
        }
    }
    public static Integer ValidInt(String txt,Scanner scanner){
        String parametro;
        char caracter;
        Integer numero;
        try {
            System.out.println(txt);
            Seta();
            parametro = scanner.next();
            for(int i=0;i<parametro.length();i++){
                caracter=parametro.charAt(i);
                if(!Character.isDigit(caracter)){
                   throw new Exception(vermelho+"Digitação inválida. Favor digitar somente Numeros"+reset); 
                }
            }
            numero = Integer.parseInt(parametro);
        }catch (Exception e) {
            System.out.println(e); 
           numero=ValidInt(txt, scanner);       
        }
        return numero;
    }
    public static void Seta(){
        System.out.print("=>  ");
    }
}