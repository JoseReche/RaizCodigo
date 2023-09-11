#include <stdio.h>
#include <stdlib.h> // Necessário para as funções malloc() e free()

int main() {
	system("chcp 65001");
	system("cls");
    // Alocação dinâmica de memória para armazenar os números
    int* num1 = (int*)malloc(sizeof(int));
    int* num2 = (int*)malloc(sizeof(int));
    int* num3 = (int*)malloc(sizeof(int));

    if (num1 == NULL || num2 == NULL || num3 == NULL) {
        fprintf(stderr, "Erro na alocação de memória.\n");
        return 1;
    }

    float media;
    
    free(num2);
    printf("Bem vindo mestre digite as notas de seu aluno para calcular a média\n");
    printf("Digite a primeira nota: ");
    scanf("%d", num1);

    printf("Digite o segunda nota: ");
    scanf("%d", num2);

    printf("Digite o terceira nota: ");
    scanf("%d", num3);

    media = (*num1 + *num2 + *num3) / 3.0;
    printf("A média das três notas é: %.2f\n", media);free(num3);
}
