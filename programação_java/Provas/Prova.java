/** Crie um ou mais coleções de strings para armazenar os nomes de alunos e seus conceitos.
    * Os conceitos podem ser 'O', 'B', 'S' ou 'I'.
    * Caso seja criada mais de uma coleção, os nomes e os conceitos sempre devem corresponder no índice.
    * Exemplo: João está no índice 0 das coleções e seu conceito está no índice 0 das coleções.
    * Crie um vetor de inteiros para armazenar a quantidade de cada conceito.
    * O vetor deve ter 4 posições, uma para cada conceito.
    * O vetor deve ser inicializado com 0 em todas as posições.
    * O vetor deve ser atualizado sempre que um novo conceito for inserido.

    * Implemente um menu de opções numeradas que permita aos usuários: ok

   * Inserir um novo aluno e seu conceito.
   * Listar todos os alunos e seus conceitos.
   * Calcular e exibir a quantidade de cada conceito.
   * Exibir os alunos com o conceito mais alto.
   * Encerrar o programa.

    Utilize estruturas de controle "if", "for" e "while" para realizar as operações de acordo com as escolhas dos usuários.

    Implemente tratamento de erros para garantir que os conceitos inseridas sejam `char` válidos.*/
package programação_java.Provas;
import java.util.ArrayList;
import java.util.Scanner;

public class Prova {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Estrutura para Usar o metodo Scanner

        ArrayList<String> alunosNomes = new ArrayList<>();
        ArrayList<String> conceitoAlunos = new ArrayList<>();

        String[] conceito = new String[]{"O","B","S","I"};// Conceitos expecificados pelo professor

        System.out.println("Bem Vindo mestre");
        int op;// para direcionar o usuario
        String validOp;//para validação
        do{//Menu simples para a escolha do usuario
            System.out.println("=================================");
            System.out.println("          System(Echola)         ");
            System.out.println("=================================");
            System.out.println("  [1] Inserir Aluno e Conceito   ");
            System.out.println("  [2] Listar Alunos e Conceito   ");
            System.out.println("  [3] Calcular e Exibir Conceito ");
            System.out.println("  [4] Top 3 Melhores alunos      ");
            System.out.println("  [5] Exit                       ");
            System.out.println("=================================");
            System.out.println("Digite o numero de sua escolha: ");
            System.out.print("=> ");
            validOp = scanner.next();//Coleta o numero escolhido em uma string
            if (validarLetras(validOp)) {//valida se é letra se for retorna 0 para op e com isso faz que caia no defull e retorne o programa
                op = 0;
            }else{
                op = Integer.parseInt(validOp);//transforma a string em inteiro
            }
            switch(op){//Direciona para as cases
                case 1:{
                    int valid=0; // para validar a resposta do usuario usado mais a frente
                    System.out.println("=================================");
                    System.out.println("     Inserir Aluno e Conceito    ");
                    System.out.println("=================================");
                    System.out.println("  [O] Ótimo");
                    System.out.println("  [B] Bom");
                    System.out.println("  [S] Suficiente");
                    System.out.println("  [I] Insuficiente");
                    System.out.println("=================================");
                    System.out.println(" ");

                    System.out.println("Digite o Nome do aluno ");
                    System.out.print("=> ");
                    alunosNomes.add(scanner.next());// addiciona o nome do aluno ao arreio alunosNomes
                    while (valid!=1) {//aqui usamos o valid para repetir de acorso com o digitado pelo usuario mais a frente
                        System.out.println("Digite o Conceito do aluno ");
                        System.out.print("=> ");
                        String conceitoRecebido = scanner.next(); // conceito que o usuario vai dar para o aluno
                        String conceitoMaiusculo = conceitoRecebido.toUpperCase();//Transfoma em maiuscula

                        if (conceitoMaiusculo.equals(conceito[0])|| conceitoMaiusculo.equals(conceito[1])||
                        conceitoMaiusculo.equals(conceito[2]) ||conceitoMaiusculo.equals(conceito[3])) {// valida se os conceitos são referentes ao sitados no mini menu
                            conceitoAlunos.add(conceitoMaiusculo);// addiciona o conceito do aluno ao arreio conceitoAlunos
                            valid=1;//aqui validamos pois se for 1 não vai mais repetir
                        }else{//caso contrario ele ira umprimir e retornar para o while
                            System.out.println("Digite um Conceito correspondente ao Sugerido");
                        }
                    }
                    break;
                }
                case 2:{
                    System.out.println("=================================");
                    System.out.println("     Listar Alunos e Conceito    ");
                    System.out.println("=================================");
                    System.out.println(" ");
                    for (int i=0;i<alunosNomes.size();i++) {// for usado para imprimir os alunos com seus conceitos
                        System.out.println("Aluno : "+alunosNomes.get(i));// imprimindo alunos
                        System.out.println("=================================");
                        System.out.println("Conceito : "+conceitoAlunos.get(i));// imprimindo conceitos
                    }
                    break;
                }
                case 3:{
                    int otimo=0,bom=0,suficiente=0,insuficiente=0; //variaveis para contar quantos de cada conceito foi incerido
                    System.out.println("=================================");
                    System.out.println("    Calcular e Exibir Conceito   ");
                    System.out.println("=================================");
                    System.out.println(" ");
                    for (int i=0;i<conceitoAlunos.size();i++) {// for para coletar as quantidades de cada conceito
                        if(conceitoAlunos.get(i).equals(conceito[0])){//avalia qual conceito é e soma de acordo com o conceito
                            otimo++;
                        }else if(conceitoAlunos.get(i).equals(conceito[1])){//avalia qual conceito é e soma de acordo com o conceito
                            bom++;
                        }else if(conceitoAlunos.get(i).equals(conceito[2])){//avalia qual conceito é e soma de acordo com o conceito
                            suficiente++;
                        }else if(conceitoAlunos.get(i).equals(conceito[3])){//avalia qual conceito é e soma de acordo com o conceito
                            insuficiente++;
                        }
                    }
                    System.out.println("  [O] Ótimo: "+otimo);// imprime a quantidade de cada comceito
                    System.out.println("  [B] Bom: "+bom);// imprime a quantidade de cada comceito
                    System.out.println("  [S] Suficiente: "+suficiente);// imprime a quantidade de cada comceito
                    System.out.println("  [I] Insuficiente: "+insuficiente);// imprime a quantidade de cada comceito
                    break;
                }
                case 4:{
                    String[] top3 = new String[conceitoAlunos.size()];//Arreio para alocar os 3 alunos mais melhores da escola
                    System.out.println("=================================");
                    System.out.println("      Top 3 Melhores alunos      ");
                    System.out.println("=================================");
                    System.out.println(" ");

                    for (int i=0;i<conceitoAlunos.size();i++) {// for para coletar e selecionar os melhores alunos de acordo com o conceito
                        if(conceitoAlunos.get(i).equals(conceito[0])){//valida qual conceito é
                            top3[i] = alunosNomes.get(i);//incere o nome do aluno nao arreio top3
                        }else if(conceitoAlunos.get(i).equals(conceito[1])){//valida qual conceito é
                            top3[i] = alunosNomes.get(i);//incere o nome do aluno nao arreio top3
                        }else if(conceitoAlunos.get(i).equals(conceito[2])){//valida qual conceito é
                            top3[i] = alunosNomes.get(i);//incere o nome do aluno nao arreio top3
                        }else if(conceitoAlunos.get(i).equals(conceito[3])){//valida qual conceito é
                            top3[i] = alunosNomes.get(i);//incere o nome do aluno nao arreio top3
                        }
                    }
                    System.out.println("  1º lugar "+top3[0]);//Imprime o aluno que esta no primeiro lugar
                    System.out.println("  2º lugar "+top3[1]);//Imprime o aluno que esta no Segundo lugar
                    System.out.println("  3º lugar "+top3[2]);//Imprime o aluno que esta no terceiro lugar
                    break;
                }
                default: {// Cai aqui caso digite errado
                    if(op<=0||op>=6){//Valida De acordo com a escolha do usuario
                        System.err.println("Digite um numero que seja correspondente ao menu");//Repreende o usuario e pede para refazer sua escolha
                        System.out.println(" ");
                    }
                    break;
                }
            }
        }while(op!=5);//Se for menor que 4 vai repetir caso contrario sai do programa
        scanner.close();// fecha o scanner
        System.out.println("Obrigado por usar este serviço! Se você tiver mais perguntas no futuro, não hesite em retornar!!");//msg de adeus
        System.exit(0);//fecha o programa
    }

    public static boolean validarLetras(String texto) {//Para validar se é letra
        return texto.matches("[a-zA-Z]+");//percorre de a z e valida se é letra
    }
}

