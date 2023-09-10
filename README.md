# EjercicioNro3_Sendra
Ejercicio nro 3 clase 8/9

# Enunciado

Dada una arreglo de argumentos, indicar cual es el maximo y minimo (mayor y menor)

# Codigo

            int mayor = Integer.parseInt(args[0]);
            int menor = Integer.parseInt(args[0]);
    
            for (String argumento : args) {
                int numero = Integer.parseInt(argumento);
    
                if (numero > mayor) {
                    mayor = numero;
                } else if (numero < menor) {
                    menor = numero;
                }
            }
    
            System.out.println(" ");
            System.out.println("El número mayor es: " + mayor);
            System.out.println("El número menor es: " + menor);

# args[0]
        int mayor = Integer.parseInt(args[0]);
        int menor = Integer.parseInt(args[0]);

El primer numero que ingresa va a ser el mayor y el menor a la vez, despues se compara para almacenarlo
