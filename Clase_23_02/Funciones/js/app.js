
// sumaNN(prompt("¿Cuantos números se van a sumar?"))

function sumaNN(N){
    let sum = 0;
    for (let i = 1; i<=N; i++){
        let num = prompt("Ingresa el " + i +" número");
        sum = sum + parseInt(num);
    }
    document.write("El resultado de la suma es: " + sum)
}

function vtd(){
    let v = 0
       t = 0
       d = 0;
    let seleccion = parseInt(prompt("Seleccione que quiere calcular: 1.velocidad, 2.Tiempo, 3.Distancia"));
    switch (seleccion){

       case 1:
           t = prompt("Ingrese el tiempo en horas");
           d = prompt("Ingrese la distancia en kilometros");
           v = d/t;
           document.write("La velocidad es: " + v + " km/h");
           break;
        case 2:
            
            d = prompt("Ingrese la distancia en kilometros");
            v = prompt("Ingrese la velocidad km/h");
            t = d/v;
            document.write("El tiempo es: " + t + " horas");
            break;
        case 3:
            t = prompt("Ingrese el tiempo en horas");
            v = prompt("Ingrese la velocidad en km/h");
            d = v*t;
            document.write("La distancia es: " + d + " Km" );
            break;
        default :
            document.write("El dato ingresado no es valido");
            break;
    }
}

function tenTwo(){
    sum = 0;
     for (i = 0; i <=5; i++) {
         document.write(sum + "<br>")
         sum = sum + 2
     }
 }

 function tenTen(){
     for (let i = 0; i <=18; i = i+2) {
         document.write(i + "<br>")
     } 
}

function vecTen(){
    let vec = [];
    let c = 0;
    for (let i = 1; i <22; i = i+2) {
        
        vec[c] = [i];
        c++;
    } 
    document.write(vec + " ");
}

explocion();

function explocion(){
    c = 0;
    do {
        c++;
        document.write(c);
    } while (c != 0);
}