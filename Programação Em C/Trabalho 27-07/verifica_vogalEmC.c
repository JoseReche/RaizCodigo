/* FUP que verifique se a letra informada
é referente ao sexo da pessoa */

#include <stdio.h> // BIBLIOTECA PADRAO C
#include <ctype.h> // PARA a função toupper ()

void main(){//inicio do bloco
	char letra;
	system("chcp 65001");
 	//tela Inicial:
 	printf(" \n=======================================  " 
		   " \n\t Verificando se a  Letra é uma VOGAL "
		   " \n=======================================  " 
		   "\n\n\n Informe uma Letra: "); 
 	scanf("%c", &letra);
 	letra=toupper (letra); //TRANSFORMA EM MAIUSCULO
 	if((letra =='A')||(letra =='E')||(letra =='I')||(letra =='O')||(letra =='U')){
  		printf("\n\n A letra informada é uma VOGAL");
  	}else{
	    printf("\n\n Esse caracter Não é VOGAL");
    }
     
   	printf("\n\n\n");
} //fecha o bloco
