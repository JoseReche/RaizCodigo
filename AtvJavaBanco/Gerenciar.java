import java.util.Scanner;

public class Gerenciar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int op = 0;
        Conexao.ConexaoBD();

        do {
            System.out.println("Minha Biblioteca");
            System.out.println("0 - Sair");
            System.out.println("1 - Criar autor");
            System.out.println("2 - Criar livro");
            System.out.println("3 - Criar mídia digital");
            System.out.println("4 - Criar biblioteca");
            System.out.println("5 - Adicionar livro");
            System.out.println("6 - Emprestar livro");
            System.out.println("7 - Devolver livro");
            System.out.println("8 - Adicionar mídia");
            System.out.println("9 - Emprestar mídia");
            System.out.println("10 - Devolver mídia");
            try {
                op = scanner.nextInt();
            } catch (Exception e) {
                op = 99;
            }

            switch (op) {
                case 0: {
                    System.out.println("Sair....");
                    break;
                }
                case 1: {
                    System.out.println("Digite o nome do autor");
                    String nome = scanner.next();
                    System.out.println("Digite o nacionalidade do autor");
                    String nacionalidade = scanner.next();
                    new Autor(nome, nacionalidade);
                    break;
                }
                case 2: {
                    System.out.println("Digite o titulo");
                    String titulo = scanner.next();
                    int posicaoAutor = -1;
                    do {
                        Conexao.listarAutores(1);
                        try {
                            posicaoAutor = scanner.nextInt();
                            if (posicaoAutor > Conexao.ContarAutores()) {
                                throw new Exception("Autor inválido");
                            }
                        } catch (Exception e) {
                            System.out.println("Autor inválido");
                            posicaoAutor = -1;
                        }
                    } while (posicaoAutor < 0);

                    //Autor autor = Conexao.SelecionarAutor(posicaoAutor);
                    new Livro(titulo, posicaoAutor, 0);
                    break;
                }
                case 3: {
                    System.out.println("Digite o titulo");
                    String titulo = scanner.next();
                    System.out.println("Digite o album");
                    String album = scanner.next();
                    new MidiaDigital(titulo, album, 0);
                    break;
                }
                case 4: {
                    System.out.println("Digite o nome da biblioteca");
                    String nomeBiblioteca = scanner.next();
                    new Biblioteca(nomeBiblioteca);
                    break;
                }
                case 5: {
                    int posicaoBiblioteca = -1;
                    do {
                        Conexao.listarBiblioteca(1);
                        try {
                            posicaoBiblioteca = scanner.nextInt();
                            if (posicaoBiblioteca >Conexao.ContarBiblioteca()) {
                                throw new Exception("Biblioteca inválida");
                            }
                        } catch (Exception e) {
                            System.out.println("Biblioteca inválida");
                            posicaoBiblioteca = -1;
                        }
                    } while (posicaoBiblioteca < 0);

                    //Biblioteca biblioteca = Biblioteca.getBibliotecas().get(posicaoBiblioteca);

                    int posicaoLivro = -1;
                    do {
                        Conexao.listarLivro(1);
                        try {
                            posicaoLivro = scanner.nextInt();
                            if (posicaoLivro > Conexao.ContarLivro()) {
                                throw new Exception("Livro inválido");
                            }
                        } catch (Exception e) {
                            System.out.println("Livro inválido");
                            posicaoLivro = -1;
                        }
                    } while (posicaoLivro < 0);

                    //Livro livro = Livro.getLivros().get(posicaoLivro);

                   Conexao.InserirLivroBiblioteca(posicaoBiblioteca,posicaoLivro);
                    break;
                }
                case 6: {
                    int posicaoBiblioteca = -1;
                    do {
                        Conexao.listarBiblioteca(1);
                        try {
                            posicaoBiblioteca = scanner.nextInt();
                            if (posicaoBiblioteca > Conexao.ContarBiblioteca()) {
                                throw new Exception("Biblioteca inválida");
                            }
                        } catch (Exception e) {
                            System.out.println("Biblioteca inválida");
                            posicaoBiblioteca = -1;
                        }
                    } while (posicaoBiblioteca < 0);

                   // Biblioteca biblioteca = Biblioteca.getBibliotecas().get(posicaoBiblioteca);

                    int posicaoLivro = -1;
                    Conexao.listarLivroBiblioteca(posicaoBiblioteca);
                    do {
                        try {
                            posicaoLivro = scanner.nextInt();
                            /*if (posicaoLivro >= Livro.getLivros().size()) {
                                throw new Exception("Livro inválido");
                            }*/
                        } catch (Exception e) {
                            System.out.println("Livro inválido");
                            posicaoLivro = -1;
                        }
                    } while (posicaoLivro < 0);

                    //Livro livro = biblioteca.getLivros().get(posicaoLivro);
                    try {
                        Conexao.EmprestarLivro(posicaoLivro);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                }
                case 7: {
                    int posicaoBiblioteca = -1;
                    do {
                        Conexao.listarBiblioteca(1);
                        try {
                            posicaoBiblioteca = scanner.nextInt();
                            if (posicaoBiblioteca > Conexao.ContarBiblioteca()) {
                                throw new Exception("Biblioteca inválida");
                            }
                        } catch (Exception e) {
                            System.out.println("Biblioteca inválida");
                            posicaoBiblioteca = -1;
                        }
                    } while (posicaoBiblioteca < 0);

                    //Biblioteca biblioteca = Biblioteca.getBibliotecas().get(posicaoBiblioteca);

                    int posicaoLivro = -1;
                    Conexao.listarLivroBiblioteca(posicaoBiblioteca);
                    do {
                        //biblioteca.listarLivros();
                        try {
                            posicaoLivro = scanner.nextInt();
                            /*if (posicaoLivro >= Livro.getLivros().size()) {
                                throw new Exception("Livro inválido");
                            }*/
                        } catch (Exception e) {
                            System.out.println("Livro inválido");
                            posicaoLivro = -1;
                        }
                    } while (posicaoLivro < 0);

                    Conexao.DevolverLivro(posicaoLivro);
                    /*try {
                        livro.devolver();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }*/
                    break;
                }
                case 8: {
                    int posicaoBiblioteca = -1;
                    do {
                        Conexao.listarBiblioteca(1);
                        try {
                            posicaoBiblioteca = scanner.nextInt();
                            if (posicaoBiblioteca > Conexao.ContarBiblioteca()) {
                                throw new Exception("Biblioteca inválida");
                            }
                        } catch (Exception e) {
                            System.out.println("Biblioteca inválida");
                            posicaoBiblioteca = -1;
                        }
                    } while (posicaoBiblioteca < 0);

                    //Biblioteca biblioteca = Biblioteca.getBibliotecas().get(posicaoBiblioteca);

                    int posicaoMidiaDigital = -1;
                    do {
                        Conexao.listarMidiaDigital(1);
                        try {
                            posicaoMidiaDigital = scanner.nextInt();
                            if (posicaoMidiaDigital > Conexao.ContarMidiaDigital()) {
                                throw new Exception("Midia Digital inválido");
                            }
                        } catch (Exception e) {
                            System.out.println("Midia Digital inválido");
                            posicaoMidiaDigital = -1;
                        }
                    } while (posicaoMidiaDigital < 0);

                    //MidiaDigital midiaDigital = MidiaDigital.getMidiasDigitals().get(posicaoMidiaDigital);

                    Conexao.InserirMidiaDigitalBiblioteca(posicaoBiblioteca, posicaoMidiaDigital);
                    break;
                }
                case 9: {
                    int posicaoBiblioteca = -1;
                    do {
                        Conexao.listarBiblioteca(1);
                        try {
                            posicaoBiblioteca = scanner.nextInt();
                            if (posicaoBiblioteca > Conexao.ContarBiblioteca()) {
                                throw new Exception("Biblioteca inválida");
                            }
                        } catch (Exception e) {
                            System.out.println("Biblioteca inválida");
                            posicaoBiblioteca = -1;
                        }
                    } while (posicaoBiblioteca < 0);

                    //Biblioteca biblioteca = Biblioteca.getBibliotecas().get(posicaoBiblioteca);

                    int posicaoMidiaDigital = -1;
                    Conexao.listarMidiaDigitalBiblioteca(posicaoBiblioteca);
                    do {
                        try {
                            posicaoMidiaDigital = scanner.nextInt();
                            /*if (posicaoMidiaDigital >= MidiaDigital.getMidiasDigitals().size()) {
                                throw new Exception("Midia Digital inválido");
                            }*/
                        } catch (Exception e) {
                            System.out.println("Midia Digital inválido");
                            posicaoMidiaDigital = -1;
                        }
                    } while (posicaoMidiaDigital < 0);

                    //MidiaDigital midiaDigital = biblioteca.getMidiasDigitals().get(posicaoMidiaDigital);
                    try {
                        Conexao.EmprestarMidiaDigital(posicaoMidiaDigital);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                case 10: {
                    int posicaoBiblioteca = -1;
                    do {
                        Conexao.listarBiblioteca(1);
                        try {
                            posicaoBiblioteca = scanner.nextInt();
                            if (posicaoBiblioteca > Conexao.ContarBiblioteca()) {
                                throw new Exception("Biblioteca inválida");
                            }
                        } catch (Exception e) {
                            System.out.println("Biblioteca inválida");
                            posicaoBiblioteca = -1;
                        }
                    } while (posicaoBiblioteca < 0);

                    //Biblioteca biblioteca = Biblioteca.getBibliotecas().get(posicaoBiblioteca);

                    int posicaoMidiaDigital = -1;
                    Conexao.listarMidiaDigitalBiblioteca(posicaoBiblioteca);
                    do {
                        try {
                            posicaoMidiaDigital = scanner.nextInt();
                            /*if (posicaoMidiaDigital >= MidiaDigital.getMidiasDigitals().size()) {
                                throw new Exception("Midia Digital inválido");
                            }*/
                        } catch (Exception e) {
                            System.out.println("Midia Digital inválido");
                            posicaoMidiaDigital = -1;
                        }
                    } while (posicaoMidiaDigital < 0);

                    //MidiaDigital midiaDigital = biblioteca.getMidiasDigitals().get(posicaoMidiaDigital);
                    try {
                        Conexao.DevolverMidiaDigital(posicaoMidiaDigital);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                default: {
                    System.out.println("Opção inválida");
                    break;
                }
            }
        } while (op != 0);
        scanner.close();
    }
}
