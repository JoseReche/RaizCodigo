package programação_java;

public class testes {
    public static void main(String[] args){
        for (int i = 0; i <5; i++) {
            String texto="Autores";
            int espacosEsquerda = (50 - texto.length()) / 2;
            String textoCentralizado = " ".repeat(espacosEsquerda) + texto;
            System.out.println(textoCentralizado);
            
            //System.out.println("[ "+ i+1 + " ] " + autores.get(i).toString());
            
        }
    }
}