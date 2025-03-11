//Calcular diferencia
function difNum(mayor,menor){
    return mayor - menor;
}

//Pedir números

var mayor = Number(prompt("Introduce el primer número"));
var menor = Number(prompt("Introduce el segundo número"));
// Convertir  mayor en el mayor siempre 
if(mayor < menor){
    let temp = mayor;
    mayor = menor;
    menor = temp;
    alert(`La diferencia entre ${mayor} y ${menor} es de ${difNum(mayor, menor)}`);
} else {
    alert(`La diferencia entre ${mayor} y ${menor} es de ${difNum(mayor, menor)}`);
}