fun main(args: Array<String>) {
    //ingresar el sueldo de una persona, si supera los 3000 pesos mostrar en mje en pantalla
    // indicando que debe abonar impuestos

    print("Ingrese el sueldo del empleado: ")
    val sueldo = readLine()!!.toDouble()
    if (sueldo > 3000){
        println("Debe pagar impuestos")
    }

    // leer dos valores por enteros distintos y muestre por pantalla el mayor de ellos

    print("Ingrese el primer valor entero: ")
    val entero1 = readLine()!!.toInt()

    print("Ingrese el segundo valor entero: ")
    val entero2 = readLine()!!.toInt()

    if (entero1 > entero2)
        println("El valor mayor es $entero1")
    else
        println("El valor mayor es $entero2")

    //si el primero es menor al segundo mostrar la suma y la resta, sino el producto y la division

    if(entero1 > entero2){
        val producto = entero1*entero2
        val division = entero1/entero2

        println("El producto de $entero1 y $entero2 es $producto y su division es $division")
    }else{
        val suma = entero1+entero2
        val resta = entero1-entero2

        println("La suma de $entero1 y $entero2 es $suma y su resta es $resta")
    }

    //se ingresan tres notas de un alumno, si el promedio es mayor o igual a 7, mostrar el mje "promocionado"

    print("Ingrese la primer nota del alumno: ")
    val nota1 = readLine()!!.toFloat()

    print("Ingrese la segunda nota del alumno: ")
    val nota2 = readLine()!!.toFloat()

    print("Ingrese la tercer nota del alumno: ")
    val nota3 = readLine()!!.toFloat()

    val elPromedio = (nota1 + nota2 + nota3) / 3

    if (elPromedio >= 7)
        println("El alumno ha sido promocionado, su promedio es de $elPromedio")
    else
        println("El alumno no ha promocionado, su promedio es de $elPromedio")

    //se ingresa un nro entero del 1 al 99, mostrar un mensaje indicando si tiene uno o dos digitos

    print("Ingrese un entero del 1 al 99: ")
    val entero = readLine()!!.toInt()
    if (entero > 9)
        println("el numero $entero tiene dos dígitos")
    else
        println("el numero $entero tiene un solo dígito")

}