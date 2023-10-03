package programação_java.Provas.Prova2;

public class Sistema {
/*
Para analisar o aprendizado, você foi designado para desenvolver um sistema de gerenciamento de biblioteca em Java. 
O sistema deve ser capaz de lidar com entidades como Livro, Autor e Biblioteca, 
e deve permitir a adição de livros à biblioteca, empréstimo de livros a usuários e devolução de livros.

Crie uma classe principal para testar seu programa.

No método main da classe principal, deverão ser descritas as seguintes operações:
- Criar autor
- Criar livro
- Criar biblioteca
- Adicionar livro à biblioteca
- Emprestar livro
- Devolver livro

Certifique-se de que seu programa seja capaz de lidar com casos em que um livro já está 
emprestado e tentativas de devolução de livros que já estão disponíveis.

Observações:

Implemente as classes com cuidado, seguindo as especificações fornecidas.
Utilize a classe Biblioteca para gerenciar os livros e suas operações relacionadas.
Certifique-se de que o sistema de gerenciamento de biblioteca funcione conforme o esperado
e apresente resultados claros das operações realizadas.*/
/*---------------Metodos------------------ */
public static String Centralizar(String txt){
    int espacosEsquerda = (40 - txt.length()) / 2;
    String textoCentralizado = " ".repeat(espacosEsquerda) + txt;
    return textoCentralizado;
}
}