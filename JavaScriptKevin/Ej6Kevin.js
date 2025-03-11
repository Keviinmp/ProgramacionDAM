//Descuento
const descuento = 0.15;

//Pedir artículos e importe
var art = Number(prompt("¿Cuántos artículos has comprado?"));
var imp = Number(prompt(`¿Cuánto has pagado por estos ${art} artículos?`));
if(art > 10 && imp > 40 ){
    let impDesc = imp*descuento; //Sacar € del descuento
    alert(`Se te aplica un descuento del 15% (${impDesc.toFixed(2)}€). Tu importe es de ${(imp-impDesc).toFixed(2)}€`);
    //Como siempre que sea un número hay que parsearlo, tenemos que poner los decimales que queremos con el tofixed y los decimales que queremos
    // es como usar un printf(%.2f) en java
} else {
    alert(`No se aplica descuento. Tu importe total por ${art} artículos es de ${imp.toFixed(2)}€`)
}