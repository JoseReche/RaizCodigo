//estrutura de repetição
/*
for (var i = 0; i <10; i++) {
    console.log(i);
}
i=0;
while (i<10) {
    console.log(i);
    i++;
}
i=0
do {
    console.log(i);
    i++;
} while (i<10);
*/


function somar(n1, n2) {
    alert('somar: ' +(n1 + n2));
}
function subtrair(n1, n2) {
    alert('Subitrair: ' +(n1 - n2));
}
function dividir(n1, n2) {
    alert('Dividir: ' +(n1 / n2));
}
function multiplicar(n1, n2) {
    alert('Multiplicar: ' +(n1 * n2));
}
function resto(n1, n2) {
    alert('Resto: ' +(n1 % n2));
}
let confirma = confirm('Deseja realizar cauculos');

if(confirma){
    
    let numero1 = Number(prompt('Digite um numero: '));
    let numero2 = Number(prompt('Digite um numero: '));
    
    somar(numero1, numero2);
    dividir(numero1, numero2);
    subtrair(numero1, numero2);
    multiplicar(numero1, numero2);
    resto(numero1, numero2);
}else{
    alert("Não faremos calculo");
}

/*alert('Olá Mundo');
let numero = Number(prompt('Digite um número: '));
alert('Odobro do mesmo: '+(numero+numero));*/

//console.log('Ola mubndo');
/*idade = 10;
var idade = 11;
let idade = 44;*/

/*function mostrarMensagem(nome, idade){
    console.log('olá' +nome+ 'voce tem' +idade+ ' anos');
    for(let numero =30; numero <=40; numero++){
        console.log("O valor do numero é :" +numero);
    }
    console.log("Número: "+numero);
}
mostrarMensagem('Jesus',33);*/

/*function soma(){
    return n1+n2;
}
let retorno = soma(2,3);
console.log(retorno);

retorno = soma(10,50);
console.log(retorno);//printf entre aspas

let idade = 50;

if(idade === 40) { //revisa o valor e o tipo da variável
    console.log('vc tem 40 anos');
} else {
    console.log('vc ñ tem 40 anos');
}*/
