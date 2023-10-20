// Base de dados
let fem = [];
let masc = [];

fem.push(2);
fem.push(1.5);
fem.push(1.5);
fem.push(3);
fem.push(2);
fem.push(1.5);
fem.push(1.5);
fem.push(3);
fem.push(0.5);
fem.push(1.5);
fem.push(3);
fem.push(2);
fem.push(1.5);
fem.push(1.5);
fem.push(3.5);
console.log(fem);

masc.push(2);
masc.push(2.5);
masc.push(3.5);
masc.push(2);
masc.push(1.5);
masc.push(2);
masc.push(2.5);
masc.push(3.5);
masc.push(2);
masc.push(1.5);
masc.push(2);
masc.push(1.5);
masc.push(2);
masc.push(2.5);
masc.push(3.5);
console.log(masc);

// Calculo de média das mulheres
let i=0;
let contagem = 0;
for(;i<fem.length; i++){
    let p1 = fem[i];
    contagem =contagem + p1;
}
contagem = contagem /fem.length;
console.log(contagem.toFixed(2));

// Maior e menor altura do grupo
let maior = 0;
let menor = 10;
i=0;
for(;i<fem.length; i++){
    let p1 = fem[i];
    if(p1>maior){
        maior=p1;
    }
    if(p1<menor){
        menor = p1;
    }
}
i=0;
for(;i<masc.length; i++){
    let p1 = masc[i];
    if(p1>maior){
        maior=p1;
    }
    if(p1<menor){
        menor = p1;
    }
}
console.log("Maior e menor altura do grupo"+maior,menor);
console.log(menor);

//Numero de Homens
console.log(masc.length);
