#include <stdio.h>
#include <strings.h>

struct aluno{
	char nome[255];
	char string[100];
	int ra;
	int serie;
	int turma;
	char curso[100];
}aluno_anhanguera; //pode ser assim quando não tem muitos

struct aluno aluno_tecnologia;

typedef struct aluno aluno_curso;

void main(){
  /*printf("%d\n",sizeof(aluno_anhanguera.curso));
	printf("%d\n",sizeof(aluno_anhanguera.ra));
	printf("%d\n",sizeof(aluno_anhanguera.turma));
	printf("%d\n",sizeof(aluno_anhanguera.curso));*/
	strcpy(aluno_anhanguera.string, "valor da variavel string");
	printf("%s\n",aluno_anhanguera.string);
	printf("\n digite uma string\n");
	fgets(aluno_anhanguera.string, sizeof(aluno_anhanguera.string),stdin);
	printf("%s\n",aluno_anhanguera.string);
}