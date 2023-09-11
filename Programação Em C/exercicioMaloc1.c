#include <stdio.h>
#include <stdlib.h> // Para as funções malloc() e free()

main() {
	system("chcp 65001");
    int tamanho;
    printf("Bem vindo mestre digite até quanto quer contar\n"
		   "Lembrando que so contamos numeros pares\n"
		   "=> ");
    scanf("%d", &tamanho);
    
    // Alocar memória dinamicamente para o vetor
    int *vetor = (int *)malloc(tamanho * sizeof(int));
    if (vetor == NULL) {
        printf("Erro ao alocar memória.\n");
        return 1;
    }
    
    // Preencher o vetor com valores
    for (int i = 0; i < tamanho; i++) {
        vetor[i] = i * 2;
    }

    // Imprimir os valores do vetor
    printf("Os valores são:\n");
    for (int i = 0; i < tamanho; i++) {
        printf("%d ", vetor[i]);
    }
    printf("\n");

    // Liberar a memória alocada
    free(vetor);
}