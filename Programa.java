public class Programa {
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        //Punto de entrada de nuestro programa

        //Vector args
        // System.out.println("Longitud vector args: "+args.length);
        // for(int a=0;a<args.length;a++) System.out.println(args[a]);

        String ayuda="Ejecute java Programa.java 'Nombre Personal' 'Color (Negro, Rojo, Verde, Azul, etc.)'";
        if(args.length!=2){
            System.out.println(ayuda);
        }else{
            switch(args[1]){
                case "Negro": System.out.println(ANSI_BLACK+"Hola "+args[0]); break;
                case "Rojo": System.out.println(ANSI_RED+"Hola "+args[0]); break;
                case "Verde": System.out.println(ANSI_GREEN+"Hola "+args[0]); break;
                case "Azul": System.out.println(ANSI_BLUE+"Hola "+args[0]); break;
                case "Purpura": System.out.println(ANSI_PURPLE+"Hola "+args[0]); break;
                case "Cyan": System.out.println(ANSI_CYAN+"Hola "+args[0]); break;
                case "Blanco": System.out.println(ANSI_WHITE+"Hola "+args[0]); break;
                case "Amarillo": System.out.println(ANSI_YELLOW+"Hola "+args[0]); break;
                case "Normal": System.out.println(ANSI_RESET+"Hola "+args[0]); break;
                default: System.out.println(ayuda);
            }
        }
        System.out.println(ANSI_RESET);
        }

    }