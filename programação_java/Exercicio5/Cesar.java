package programação_java.Exercicio5;

import java.util.ArrayList;

public class Cesar {
    /*6) Crie uma classe para Cifra de César, devendo ter um método criptografia e receba como valor inicial uma mensagem e o valor constante.
    Cifra de César é uma das criptografias mais antigas conhecidas, onde a chave está no valor constante, para cada letra do alfabeto atribuí-se um número
    (exemplo: A=1;B=2;C=3,etc), então para cada letra da mensagem, soma-se o valor correspondente a esta letra ao valor constante,
    gerando uma nova letra para formar a nova mensagem, ou seja, a mensagem "Ataque a roma" com um valor constante de 3 seria "dwdtxh d urpd". Dica, utilize arrays para isso.*/

    String mensagem;
    Integer valorConstante;

    public Cesar(Integer valorConstante,String mensagem){
        this.mensagem = mensagem.toLowerCase();
        this.valorConstante = valorConstante;
    }
    public String Embaralhador(){
        char[] alfabeto = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        ArrayList<Character> temporario = new ArrayList<>();
        Integer temp;
        int y=0,i=0;
        String txt;
        while(temporario.size()!=this.mensagem.length()){
            char caractere = this.mensagem.charAt(i);
            if(caractere==alfabeto[i]){
                temp = i+this.valorConstante;
                if(temp>25){
                    temp= temp/25;
                }
                temporario.add(alfabeto[temp]);
                y++;
            }
            i++;
        }
        StringBuilder builder = new StringBuilder();
        
        for (char c : temporario) {
            builder.append(c);
        }
        
        txt = builder.toString();
        return(txt);
    }
   /* public String Desembaralhador(String codigo){
        char[] alfabeto = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int i = 0;
        for(int y=0;y<26;y++){
            i++;
            char caractere = codigo.charAt(i);
            if(caractere==alfabeto[i]){
                temp = i-this.valorConstante;
                if(temp>25){
                    temp= temp/25;
                }
                temporario[y] = alfabeto[temp];
                y++;
            }
            if(i==26){
                i=0;
            }
        }
        return(new String(alfabeto);
    }*/
}