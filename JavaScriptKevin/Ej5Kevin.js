//Pedir bebida
let bebida = prompt("¿Qué bebida quieres? Elige entre: Cerveza, vino, refresco o agua.");
bebida = bebida.toLowerCase();

//Comprobar bebidas y mandar
if(bebida === "vino" || bebida === "cerveza"){
    alert("Tienes que ir a la barra");
} else if(bebida === "agua" || bebida === "refresco") {
    alert("Tienes que ir a la tienda");
} else {
    alert(`${bebida} no es una bebida válida`);
}