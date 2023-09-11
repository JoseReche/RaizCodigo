/* FUP que verifique se a pessoa poderá ir na Igreja
sozinha (o) nas seguintes condiçõe:
	Rapaz só poderá ir na Igreja sozinho se for maior
	de 18 anos.
	
	Garota só poderá ir na Igreja sozinha se for
	maior de 35 anos.
*/
#include <stdio.h> // BIBLIOTECA PADRAO C
#include <ctype.h> // PARA a função toupper ()

void main(){//inicio do bloco
	system("chcp 65001");
	char sexo;
	int idade;
 	//tela Inicial:
 	printf(" \n===========================================  " 
 		   " \n\t SERÁ QUE VOCÊ PODERÁ SAIR SOZINHO(A)? "
   	 	   " \n===========================================  " 
 		   "\n\n\n Informe uma letra para o Sexo:  ");
 	scanf("%c", &sexo);
 	sexo=toupper (sexo); //TRANSFORMA EM MAIUSCULO
 	printf("\n\n\n Informe sua Idade:  ");
 	scanf("%d", &idade);
 	if((sexo=='M') && (idade >=18)){
    	printf("\n\n Poderá ir na Igreja sozinho");
 	}else if((sexo=='F') && (idade >=35)){
    	printf("\n\n Poderá ir na Igreja sozinha");
	}else{
		printf("\n\n Ai ai ai:  Vai ficar em casa!");
	} 
   	printf("\n\n\n");
} //fecha o bloco
