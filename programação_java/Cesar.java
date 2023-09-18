package programação_java;

import java.util.ArrayList;

public class Cesar {
    /*6) Crie uma classe para Cifra de César, devendo ter um método criptografia e receba como valor inicial uma mensagem e o valor constante.
    Cifra de César é uma das criptografias mais antigas conhecidas, onde a chave está no valor constante, para cada letra do alfabeto atribuí-se um número
    (exemplo: A=1;B=2;C=3,etc), então para cada letra da mensagem, soma-se o valor correspondente a esta letra ao valor constante,
    gerando uma nova letra para formar a nova mensagem, ou seja, a mensagem "Ataque a roma" com um valor constante de 3 seria "dwdtxh d urpd". Dica, utilize arrays para isso.*/

    String mensagem;
    Integer valorConstante;
    String[] alfabeto = {};

    public Cesar(Integer valorConstante,String mensagem){
       this.alfabeto = {"a", "b", "c", "d", "e","f", "g", "h", "i", "j", "k", "l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        this.mensagem = mensagem;
        this.valorConstante = valorConstante;
    }
}