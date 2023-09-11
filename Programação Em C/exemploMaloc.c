#include <stdlib.h>
#include <stdio.h>

main(){
	system("chcp 65001");
	int *ptr_a;
	ptr_a = malloc(sizeof(int));
	//cria a área necessária para 01 inteiro e coloca em 'ptr_a o endereço desta área.
	if(ptr_a == NULL){
		printf("Memória insuficiente!\n");
		exit(1);
	}
	
	printf("Endereço de ptr_a: %p\n", ptr_a);
	*ptr_a = 45;
	printf("Conteúdo de ptr_a: %d\n", *ptr_a);//Imprime 45
	free(ptr_a);//Libera a área alocada
}