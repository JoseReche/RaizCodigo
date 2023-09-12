package programação_java;

public class Pessoa {
        String nome;
        Double peso;
        Double altura;
        String dataNascimento;

    public Pessoa(String nome, Double peso, Double altura, String dataNascimento) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.dataNascimento = dataNascimento;
    }
    public void Validacao(Double p1,Double p2,Double p3,String txt) {
        if (p1 > p2 && p1 < p3){
            System.out.println(txt);
        }
    }
    public void IMC() {
        Double calculo = this.peso/this.altura;

        Validacao(calculo,0.0,18.5,"Abaixo do Peso");                          //Abaixo de 18,5	Abaixo do Peso
        Validacao(calculo,18.5,25.0,"Peso Ideal");                             //Entre 18,6 e 24,9	Peso Ideal
        Validacao(calculo, 24.9, 30.0, "Levemente acima do peso");             //Entre 25,0 e 29,9	Levemente acima do peso
        Validacao(calculo, 29.9, 35.0, "Obesidade Grau I");                    //Entre 30,0 e 34,9	Obesidade Grau I
        Validacao(calculo, 34.9, 40.0, "Obesidade Grau II");                   //ntre 35,0 e 39,9	Obesidade Grau II
        Validacao(calculo, 40.0, 200.0, "Obesidade Grau III (m\u00F3rbida)");  //Acima de 40	Obesidade Grau III (mórbida)
    }
}
