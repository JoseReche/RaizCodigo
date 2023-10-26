// Base de dados

let idade = [];
let quest = [];

idade.push(20);
idade.push(20);
idade.push(15);
idade.push(14);
idade.push(12);
idade.push(19);
idade.push(20);
idade.push(15);
idade.push(16);
idade.push(15);
idade.push(16);
idade.push(30);
idade.push(35);
idade.push(20);
idade.push(20);

console.log(idade);

quest.push(1);
quest.push(3);
quest.push(2);
quest.push(1);
quest.push(2);
quest.push(1);
quest.push(2);
quest.push(3);
quest.push(3);
quest.push(2);
quest.push(3);
quest.push(1);
quest.push(2);
quest.push(1);
quest.push(1);

console.log(quest);

// Calculo de média das idades que escolheram Otimo
let i = 0;
let contagem = 0;
let p2 = 0;
for(;i<idade.length; i++){
    let p1 = idade[i];
    if(quest[i] === 3){
        p2++;
        contagem = contagem + p1;
    } 
}
contagem = contagem /p2;
console.log(contagem.toFixed(0));

// a quantidade de pessoas que responderam regular;
contagem = 0;
i=0;
for(;i<quest.length; i++){
    if(quest[i] === 1){
        contagem ++;
    }
}
console.log(contagem);
// a porcentagem de pessoas que responderam bom entre todos os espectadores analisados.
i=0;
let porcentagem;
for(;i<quest.length; i++){
    if(quest[i] === 2){
        contagem ++;
    }
}
porcentagem = (contagem * 100) / quest.length;
console.log(porcentagem.toFixed(2) + "%");

