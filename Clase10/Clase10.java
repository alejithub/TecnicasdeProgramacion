public class Clase10 {

    public static void main(String[] args) {

        // Utilizando la estructura for imprimir la suma de números del 1 al 30
        System.out.println("-- Laboratorio 1 --");
        int total = 0;
        for (int a = 1; a <= 30; a++) {
            total += a;
        }
        System.out.println("total: " + total);
        System.out.println();

        // Utilizando la estructura for imprimir la suma de números pares del 1 al 30
        System.out.println("-- Laboratorio 2 --");
        total = 0;
        int impares = 0;
        // for (int a = 2; a <= 30; a += 2) {
        // total += a; Se pide del 1 al 30 empezar desde 2 no abarca todo el programa
        // }
        for (int a = 1; a <= 30; a++) {
            if (a % 2 == 0)
                total += a;
            else
                impares += a;
        }
        System.out.println("Total: " + total);
        System.out.println("Total impares: " + impares);
        System.out.println();

        //
        System.out.println("-- Laboratorio 3 --");
        for (int a = 1; a <= 10; a++) {
            if (a % 2 == 0)
                System.out.println(a + " **");
            else
                System.out.println(a + " *");
        }
        System.out.println();

        // Haciéndolo para números impares NO FUNCIONA para números negativos (a%2==-1)
        for (int a = 1; a <= 10; a++) {
            if (a % 2 == 1)
                System.out.println(a + " *");
            else
                System.out.println(a + " **");
        }
        System.out.println();

        // Haciéndolo con los negativos
        for (int a = -10; a <= 0; a++) {
            if (a % 2 == 1)
                System.out.println(a + " *");
            else
                System.out.println(a + " **");
        }
        System.out.println();

        // Laboratorio 4: Imprimir la siguiente figura en consola

        // *
        // **
        // ***
        // ****
        // *****

        System.out.println("-- Laboratorio 4 --");
        System.out.println();
        System.out.println("Ejemplo 1");
        System.out.println();

        // Quiero imprimir *****
        for (int a = 1; a <= 5; a++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println();

        // Quiero imprimir:

        // *****
        // *****
        // *****
        // *****
        // *****

        System.out.println("Ejemplo 2");
        System.out.println();
        for (int x = 1; x <= 5; x++) {
            for (int a = 1; a <= 5; a++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println();

        // Se forma la figura

        System.out.println("Ejemplo 3");
        System.out.println();
        for (int x = 1; x <= 5; x++) {
            for (int a = 1; a <= x; a++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("Se forma la figura");
        System.out.println();

        // Se forma la figura

        System.out.println("Ejemplo 4");
        System.out.println();
        for (int x = 1; x <= 5; x++) {
            for (int a = 1; a <= x; a++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("Se forma la figura");
        System.out.println();

        // Se forma la figura

        System.out.println("Ejemplo 5");
        System.out.println();
        for (int x = 1; x <= 5; x++) {
            for (int a = 1; a <= x; a++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("Se forma la figura");
        System.out.println();

        // Se forma la figura inversa

        System.out.println("Ejemplo 6");
        System.out.println();
        for (int x = 5; x >= 1; x--) {
            for (int a = 1; a <= x; a++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("Se forma la figura inversa");
        System.out.println();

        // Otra forma

        System.out.println("Ejemplo 7");
        System.out.println();
        String caracter = "";
        for (int a = 1; a <= 5; a++) {
            caracter += "*";
            System.out.println(caracter);
        }
        System.out.println("Se forma la figura");
        System.out.println();

        // Figura inversa

        System.out.println("Ejemplo 8: Fórmula para sacar un caracter");
        System.out.println();
        String nombre = "Carlos";
        System.out.println(nombre);
        nombre = nombre.substring(0, nombre.length() - 1);
        System.out.println(nombre);
        System.out.println();

        // Otra forma siguiendo el ejemplo 8

        System.out.println("Ejemplo 9");
        for (int a = 1; a <= 5; a++) {
            System.out.println(caracter);
            caracter = caracter.substring(0, caracter.length() - 1);
        }

        // Vectores -- Arrays

        // Declaración de un Array
        int[] numeros = new int[4];
        String[] nombres = new String[4];

        // Inicialización de un Array
        numeros[0] = 1;
        nombres[0] = "Juan";
        numeros[1] = 2;
        nombres[1] = "Jose";
        numeros[2] = 3;
        nombres[2] = "Maria";
        numeros[3] = 4;
        nombres[3] = "Andrea";
        // Indice fuera de rango
        // numeros[4]=5;
        // nombres[4]="Mirta";

        /*
         * numeros nombres índice
         * 1 Juan 0
         * 2 Jose 1
         * 3 Maria 2
         * 4 Andrea 3
         */
        System.out.println();
    }
}