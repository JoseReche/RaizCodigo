let paragrafo=document.querySelector('myParagraph');    

paragrafo.addEventListener('mouseout', function(){
    paragrafo.classList.remove('hover');
});

paragrafo.addEventListener('mouseout', function(){
    paragrafo.classList.remove('hover');
});

function mostrarOla(){
    let inputNome = document.querySelector("#nome").value;
    document.querySelector("#mensagem").textContent = 'olá ' + inputNome;
}

function mostrarOla2(){
    let inputNome = document.querySelector("#nome").value;
    document.querySelector("#mensagem2").textContent = 'olá ' + inputNome;
}

let botao = document.querySelector("#botao");
botao.addEventListener('click', function(){
    mostrarOla2()
});