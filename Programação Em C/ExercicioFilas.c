#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// Definição da estrutura para representar um cliente
struct Cliente {
    char nome[50];			//nome do cliente
    int senha;				//senha unica de cada cliente
};

// Definição da estrutura para representar a fila de atendimento
struct Fila {
    int capacidade;			// Capacidade máxima da fila
    struct Cliente *dados;	// Ponteiro para o array de clientes
    int primeiro;			// Índice do primeiro cliente na fila
    int ultimo;				// Índice do último cliente na fila
    int nItens; 			// Número de clientes na fila
    int proximaSenha; 		// Próxima senha a ser atribuída
};

// Função para criar uma fila vazia
void criarFila(struct Fila *f, int c) {
    f->capacidade = c;
    f->dados = (struct Cliente *)malloc(f->capacidade * sizeof(struct Cliente));// Alocação de memória para os dados
    f->primeiro = 0;		// Inicialização do índice do primeiro elemento
    f->ultimo = -1;			// Inicialização do índice do último elemento
    f->nItens = 0;			// Inicialização do número de elementos
    f->proximaSenha = 1;	// Inicializa a próxima senha como 1
}

// Função para inserir um cliente na fila
void inserir(struct Fila *f, const char *nome) {
    if (f->ultimo == f->capacidade - 1)	// Se o último elemento estiver no final do array
        f->ultimo = -1;					// Volta ao começo do array (implementação de fila circular)

    struct Cliente novoCliente;			
    strcpy(novoCliente.nome, nome);		
    novoCliente.senha = f->proximaSenha;	// Atribui a próxima senha ao cliente

    f->ultimo++;						// Avança o índice do último elemento
    f->dados[f->ultimo] = novoCliente;// Armazena o valor no array
    f->nItens++;						// Incrementa o número de elementos
    f->proximaSenha++;// Incrementa a próxima senha para o próximo cliente
}

struct Cliente remover(struct Fila *f) {
    struct Cliente clienteRemovido = f->dados[f->primeiro];
    f->primeiro++;
    if (f->primeiro == f->capacidade)
        f->primeiro = 0;
    f->nItens--;
    return clienteRemovido;
}

int estaVazia(struct Fila *f) {
    return (f->nItens == 0);
}

int estaCheia(struct Fila *f) {
    return (f->nItens == f->capacidade);
}

void mostrarFila(struct Fila *f) {
    int i = f->primeiro;
    int posicao = 1;

    while (posicao <= f->nItens) {
        printf("Posicao: %d - Nome: %s, Senha: %d\n", posicao, f->dados[i].nome, f->dados[i].senha);

        i = (i + 1) % f->capacidade;
        posicao++;
    }
    printf("\n");
}

int main() {
    int opcao;
    char nome[50];
    struct Fila filaAtendimento;
    criarFila(&filaAtendimento, 10);

    while (1) {
        printf("1 - Inserir cliente\n");
        printf("2 - Chamar proximo cliente\n");
        printf("3 - Mostrar fila de atendimento\n");
        printf("0 - Sair\n");
        printf("Opcao? ");
        scanf("%d", &opcao);

        switch (opcao) {
            case 0:
                free(filaAtendimento.dados);
                exit(0);
            case 1:
                if (estaCheia(&filaAtendimento))
                    printf("Fila de atendimento esta cheia!\n");
                else {
                    printf("Nome do cliente: ");
                    scanf("%s", nome);
                    inserir(&filaAtendimento, nome);
                }
                break;
            case 2:
                if (estaVazia(&filaAtendimento))
                    printf("Fila de atendimento esta vazia!\n");
                else {
                    struct Cliente proximoCliente = remover(&filaAtendimento);
                    printf("Chamando proximo cliente:\n");
                    printf("Nome: %s, Senha: %d\n\n", proximoCliente.nome, proximoCliente.senha);
                }
                break;
            case 3:
                if (estaVazia(&filaAtendimento))
                    printf("Fila de atendimento esta vazia!\n");
                else {
                    printf("Fila de atendimento:\n");
                    mostrarFila(&filaAtendimento);
                }
                break;
            default:
                printf("\nOpcao invalida\n\n");
        }
    }
    return 0;
}
