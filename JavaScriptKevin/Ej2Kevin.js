// Devolver cociente
function devCociente(num1,num2) {
return num1 / num2;
}

//Pedir números

var num1 = Number(prompt("Introduce el primer número"));
var num2 = Number(prompt("Introduce el segundo número"));
if(num2 == 0 ){
    alert("ERROR. No se puede dividir entre 0");
} else {
    alert(`El resultado es ${devCociente(num1,num2)}`);
}








