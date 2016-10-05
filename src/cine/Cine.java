package cine;

/**
 *
 * @author usu26
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cine {

    private static ArrayList<Pelicula> misPeliculas = new ArrayList<>();

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = pedirEntero("Escoge una opción");
            switch (opcion) {
                case 1:
                    nuevaPeli();
                    break;
                case 2:
                    
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Hasta la próxima!");
                    break;
                default:
                    System.out.println("Opción incorrecta.");

            }
        } while (opcion != 6);

    }

    private static void mostrarMenu() {
        System.out.println("---- PELÍCULA----");
        System.out.println("1. Añadir película");
        System.out.println("2. Consultar datos de una película.");
        System.out.println("3. Listado de películas de un género");
        System.out.println("4. Película favorita");
        System.out.println("5. Totales");
        System.out.println("6. Salir");

    }

    private static int pedirEntero(String mensaje) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numero = 0;
        boolean error;
        try {
            System.out.println(mensaje);
            numero = Integer.parseInt(br.readLine());
            error = false;
        } catch (IOException ex) {
            System.out.println("Error entrada y salida");
            error = true;
        } catch (NumberFormatException ex) {
            System.out.println("No has introducido un número entero.");
            error = true;
        }
        while (error); // es lo mismo que error == true
        return numero;
    }

    private static void nuevaPeli() {
        String code = pedirCadena("Introduce el código");
        String titulo = pedirCadena("Introduce el título de la película");
        String director = pedirCadena("Introduce el director de la película");
        String genero = pedirCadena("Introduce el genero de la película");
        Double valoracion = pedirDouble("Introduce la valoración de la película");
        int duracion = pedirEntero("Introduce la duracion de la película");
        boolean visto = pedirVisto("Has visto la peli?");

        Pelicula d = new Pelicula(code, titulo, director, genero, valoracion, duracion, visto);
        misPeliculas.add(d);
    }

    private static String pedirCadena(String mensaje) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena = "";
        boolean error;
        do {
            try {
                System.out.println(mensaje);
                cadena = br.readLine();
                error = false;
            } catch (IOException ex) {
                System.out.println("Error entrada salida");
                error = true;
            }
        } while (error);
        return cadena;
    }

    private static double pedirDouble(String mensaje) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double numero = 0;
        boolean error;
        do {
            try {
                System.out.println(mensaje);
                numero = Double.parseDouble(br.readLine());
                error = false;
            } catch (IOException ex) {
                System.out.println("Error entrada salida");
                error = true;
            } catch (NumberFormatException ex) {
                System.out.println("No has introducido un número.");
                error = true;
            }
        } while (error);
        return numero;
    }

    private static boolean pedirVisto(String mensaje) {
        String cadena = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean visto2 = false;
        boolean error;
        do {
            try {
                System.out.println(mensaje);
                cadena = br.readLine();
                error=false;
            } catch (IOException ex) {
                System.out.println("Error entrada salida");
                error = true;
            } catch (NumberFormatException ex) {
                System.out.println("No has introducido un número.");
                error = true;
            }
            
                error = false;

                cadena = cadena.toLowerCase();
                if (cadena != "si" || cadena != "no") {
                    error = true;
                }
           
        } while (!error);

        String vist;
        vist = cadena.toLowerCase();
        if (vist.equals("si")) {
            //visto2=true;
        return true;
        } else {
          //  visto2=false;
        return false;
        }
        //return visto2;
    }
}
