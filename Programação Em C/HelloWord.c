#include <stdio.h>
void main(){
	system("cls");
	int i =0;
	for (i=0; i<=10; i++){
		printf("laco For\n");
	}
	printf("\n");
	i=0;
	while(i<=10){
		printf("laco While\n");
		i++;
	}
	printf("\n");
	i=0;
	do{
		printf("laco do While\n");
		i++;
	}while(i<=10);
}