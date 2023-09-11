/* FUP que verifique se o Número é Par ou Impar */
#include <stdio.h> // BIBLIOTECA PADRAO C
void main(){//inicio do bloco
	int numero;
	system("chcp 65001");
 	//tela Inicial:
 	printf(" \n=======================================  "
 		   " \n\t Par ou Ímpar? "
		   " \n=======================================  " 
     	   "\n\n\n Informe um Número: "); 
 	scanf("%d", &numero);
 	if (numero%2==0){
  		printf("\n\n ESSE NÚMERO É PAR");
  	}else{
  		printf("\n\n ESSE NÚMERO É ÍMPAR");
  	}
   	printf("\n\n\n");
} //fecha o bloco
