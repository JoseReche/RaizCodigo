//Calculo de media de aluno
#include <stdio.h> // BIBLIOTECA PADRAO C
#include <ctype.h> // PARA a função toupper ()
void main(){
	float nota1,nota2,nota3,nota4,media;
	system("chcp 65001");
	
	printf("==================================\n"
		"\tCALCULO DE MÉDIA\n"
		"Digite a primeira nota: ");
	scanf("%f", &nota1);
	
	printf("Digite a segunda nota: ");
	scanf("%f", &nota2);
	
	printf("Digite a terceira nota: ");
	scanf("%f", &nota3);
	
	printf("Digite a quarta nota: ");
	scanf("%f", &nota4);
	
	media = (nota1 + nota2 + nota3 + nota4) / 4;
	printf("A média do aluno é: %.2f",media);

}