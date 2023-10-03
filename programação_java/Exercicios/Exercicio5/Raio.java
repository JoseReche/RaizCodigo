package programação_java.Exercicios.Exercicio5;

public class Raio{

   // 5) Crie uma classe que calcule a área de uma circunferência, recebendo com valor inicial o raio
   Double raio;

   public Raio(Double raio) {
    this.raio = raio;
}

   public Double Calculo (){
    Double area = 3.14 * (this.raio*this.raio);
    return area;
   }

}
