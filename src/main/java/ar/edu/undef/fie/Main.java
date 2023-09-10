package ar.edu.undef.fie;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No proporcionó elementos");
            return; // si no hay argumentos, finaliza
        }

        System.out.print("Ingresó los siguientes argumentos: ");
        for (String argumento : args) {
            System.out.print(argumento + " ");
        }

        // Inicializamos las variables mayor y menor con el primer número
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
    }
}
