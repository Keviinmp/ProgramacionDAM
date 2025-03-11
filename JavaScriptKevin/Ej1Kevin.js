// Verificar si es par o impar
function esPar(num) {
    if(num % 2 == 0){
        return `El número ${num} es par`;  //IMPORTANTE USAR ESTAS COMILLAS PARA QUE DETECTE EL ${num}
    } else {
        return `El número ${num} es impar`;
    }
}

// Pedir número al usuario
const num = Number(prompt("Introduce un número"));
if(!isNaN(num)) {   //Is not a number
   alert(esPar(num));
} else {
    alert("Debes introducir un número válido");
}