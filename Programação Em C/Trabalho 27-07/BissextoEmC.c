/* FUP que verifique se o Número é Par ou Impar */
#include <stdio.h> // BIBLIOTECA PADRAO C
void main(){//inicio do bloco
	int ano;
	system("chcp 65001");
	//tela Inicial:
	printf(" \n=======================================  " 
	 		" \n\t Verificando se o Ano é Bissexto "
			" \n=======================================  " 
			"\n\n\n Informe um Número: "); 
	scanf("%d", &ano);
	if (ano%4==0){
	  	printf("\n\n ESSE ANO É BISSEXTO");
	}else{
	  	printf("\n\n ESSE ANO NÃO É BISSEXTO");
	}
	printf("\n\n\n");
} //fecha o bloco
