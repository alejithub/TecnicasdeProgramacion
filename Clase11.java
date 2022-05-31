import java.time.LocalDateTime;

public class Clase11{
    public static void main(String[] args) {
        
                //Vectores -- Arrays

        // Declaración de un Array
        int[] numeros=new int[4];
        String[] nombres=new String[4];

        // Inicialización de un Array
        numeros[0] = 1;
        nombres[0] ="Juan";
        numeros[1] = 2;
        nombres[1] ="Jose";
        numeros[2] = 3;
        nombres[2] ="Maria";
        numeros[3] = 4;
        nombres[3] ="Andrea";
        //Indice fuera de rango
        //numeros[4] = 5;
        //nombres[4] ="Mirta";
        //numeros[-1]=-1;
        //nombres[-1]="Miriam";


        /*
                numeros         nombres             indice
                    1           Juan                    0
                    2           Jose                    1
                    3           Maria                   2
                    4           Andrea                  3

        */
        System.out.println(numeros[2]+" "+nombres[2]);
        System.out.println("*********************************************");
        System.out.println(numeros[0]+" "+nombres[0]);
        System.out.println(numeros[1]+" "+nombres[1]);
        System.out.println(numeros[2]+" "+nombres[2]);
        System.out.println(numeros[3]+" "+nombres[3]);

        System.out.println("*********************************************");
        //Recorrido del vector
        for(int a=0; a<4; a++) System.out.println(numeros[a]+" "+nombres[a]);

        System.out.println("*********************************************");
        //Recorrido de un vector usando while
        int x=0;
        while(x<4){
            System.out.println(numeros[x]+" "+nombres[x]);
            x++;
        }

        System.out.println("*********************************************");
        //Método length
        System.out.println("Longitud del vector numeros: "+numeros.length);

        //Recorrido del vector usando metodo length
        for(int a=0; a<numeros.length; a++){
            System.out.println(numeros[a]+" "+nombres[a]);
        }

        System.out.println("*********************************************");
        for(int a=numeros.length-1;a>=0;a--){
            System.out.println(numeros[a]+" "+nombres[a]);
        }

        //Definición abreviada:
        int[] vector={14, 16, 23, 26, 39, 38, 29, 65, 24, 10, 12, 15, 17, 23, 12, 31, 12};
        System.out.println("Longitud de vector: "+vector.length);
        for(int a=0; a<vector.length; a++) System.out.print(vector[a]+", ");
        System.out.println();
        
        vector[1]=45;
        //Totalizar un vector numérico
        //Promediar un vector numérico
        int total=0;
        for(int a=0;a<vector.length;a++){
            total+=vector[a];
        }
        System.out.println("Total: "+total);
        System.out.println("Promedio: "+((double)total/vector.length));

        //Búsqueda del valor máximo
        //Búsqueda del valor mínimo
        int max=vector[0];
        int min=vector[0];
        for(int a=1; a<vector.length; a++){
            if(vector[a]>max) max=vector[a];
            if(vector[a]<min) min=vector[a];
        }
        System.out.println("Valor máximo: "+max);
        System.out.println("Valor mínimo: "+min);

        //Cantidad de números pares
        //Cantidad de números impares
        //Cantidad de veces que se repite el número 12

        int contPares=0, contImpares=0, cont12=0;
        for(int a=0; a<vector.length; a++){
            if(vector[a]%2==0) contPares++;
            else contImpares++;
            if(vector[a]==12) cont12++;
        }
        System.out.println("Cantidad de números pares: "+contPares);
        System.out.println("Cantidad de números impares: "+contImpares);
        System.out.println("Cantidad de veces que se repite el 12: "+cont12);

        String[] meses={"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        String[] semana={"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        String[] dia={"Noche", "Amanecer", "Mañana", "Mediodía", "Tarde", "Noche"};
        LocalDateTime ldt=LocalDateTime.now();
        
        int horaDia=ldt.getHour();
        int numeroDiaMes=ldt.getDayOfMonth();
        int numeroDiaSemana=ldt.getDayOfWeek().getValue();
        int numeroMes=ldt.getMonthValue();
        int numeroAnio=ldt.getYear();

        System.out.println(horaDia);
        System.out.println(numeroDiaMes);
        System.out.println(numeroDiaSemana);
        System.out.println(numeroMes);
        System.out.println(numeroAnio);

        System.out.println(dia[horaDia/4]+" de "+semana[numeroDiaSemana-1]+" "+
        numeroDiaMes+" "+meses[numeroMes-1]+" de "+numeroAnio);

    }
}