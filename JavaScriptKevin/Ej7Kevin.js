// Pedir el medio de transporte
let transporte = prompt("¿Cómo vas a viajar? Elige entre: coche, tren, bicicleta o autobús");
transporte = transporte.toLowerCase();  

// Comprobar el medio de transporte
if(transporte === "tren" || transporte === "autobús") {
    alert("Recuerda llevar dinero para el billete");
} else if(transporte === "coche" || transporte === "bicicleta") {
    alert("¡Buen viaje! No olvides revisar que todo esté en orden");
} else {
    alert("Medio de transporte no válido. Por favor, elige entre coche, tren, bicicleta o autobús");
}
