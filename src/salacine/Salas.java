package salacine;

import java.util.ArrayList;
import java.util.Scanner;

public class Salas {

    String[][] salas = new String[5][6];
    public static ArrayList<Peliculas> pelicula = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public void marcarSilla() {
        System.out.println("Por favor escoja el sitio de la silla de la siguiente manera");
        System.out.println("Ejemplo: B5 (Fila B , columna 5)");
        String silla = sc.nextLine();
        String[] aux = silla.split("");
        if ("A".equalsIgnoreCase(aux[0])) {
            int fila = 1;
            int columna = Integer.parseInt(aux[1]);
            for (int i = 0; i < salas.length; i++) {
                for (int j = 0; j < salas[0].length; j++) {
                    if (i == fila && j == columna) {
                        if (salas[i][j] == "-") {
                            salas[i][j] = "O";
                            System.out.println("Por favor escriba su nombre y su edad separado por -");
                            String arreglo[] = sc.nextLine().split("-");
                            Peliculas dato = new Peliculas(arreglo[0], Integer.parseInt(arreglo[1]));
                            pelicula.add(dato);
                            for (int k = 0; k < pelicula.size(); k++) {
                                System.out.println(pelicula.get(k) + "Codigo= " + aux[0] + aux[1] + '}');
                            }
                        } else if (salas[i][j] == "O") {
                            System.out.println("Esta silla ya esta ocupada");
                        }
                    }
                }
            }
        } else if ("B".equalsIgnoreCase(aux[0])) {
            int fila = 2;
            int columna = Integer.parseInt(aux[1]);
            for (int i = 0; i < salas.length; i++) {
                for (int j = 0; j < salas[0].length; j++) {
                    if (i == fila && j == columna) {
                        if (salas[i][j] == "-") {
                            salas[i][j] = "O";
                            System.out.println("Por favor escriba su nombre y su edad separado por -");
                            String arreglo[] = sc.nextLine().split("-");
                            Peliculas dato = new Peliculas(arreglo[0], Integer.parseInt(arreglo[1]));
                            pelicula.add(dato);
                            for (int k = 0; k < pelicula.size(); k++) {
                                System.out.println(pelicula.get(k) + "Codigo= " + aux[0] + aux[1] + '}');
                            }
                        } else if (salas[i][j] == "O") {
                            System.out.println("Esta silla ya esta ocupada");
                        }
                    }
                }
            }
        } else if ("C".equalsIgnoreCase(aux[0])) {
            int fila = 3;
            int columna = Integer.parseInt(aux[1]);
            for (int i = 0; i < salas.length; i++) {
                for (int j = 0; j < salas[0].length; j++) {
                    if (i == fila && j == columna) {
                        if (salas[i][j] == "-") {
                            salas[i][j] = "O";
                            System.out.println("Por favor escriba su nombre y su edad separado por -");
                            String arreglo[] = sc.nextLine().split("-");
                            Peliculas dato = new Peliculas(arreglo[0], Integer.parseInt(arreglo[1]));
                            pelicula.add(dato);
                            for (int k = 0; k < pelicula.size(); k++) {
                                System.out.println(pelicula.get(k) + "Codigo= " + aux[0] + aux[1] + '}');
                            }
                        } else if (salas[i][j] == "O") {
                            System.out.println("Esta silla ya esta ocupada");
                        }
                    }
                }
            }
        } else if ("D".equalsIgnoreCase(aux[0])) {
            int fila = 4;
            int columna = Integer.parseInt(aux[1]);
            for (int i = 0; i < salas.length; i++) {
                for (int j = 0; j < salas[0].length; j++) {
                    if (i == fila && j == columna) {
                        if (salas[i][j] == "-") {
                            salas[i][j] = "O";
                            System.out.println("Por favor escriba su nombre y su edad separado por -");
                            String arreglo[] = sc.nextLine().split("-");
                            Peliculas dato = new Peliculas(arreglo[0], Integer.parseInt(arreglo[1]));
                            pelicula.add(dato);
                            for (int k = 0; k < pelicula.size(); k++) {
                                System.out.println(pelicula.get(k) + "Codigo= " + aux[0] + aux[1] + '}');
                            }
                        } else if (salas[i][j] == "O") {
                            System.out.println("Esta silla ya esta ocupada");
                        }
                    }
                }
            }
        }
    }

    public void mayorEdad() {
        System.out.println("Por favor escoja el sitio de la silla de la siguiente manera");
        System.out.println("Ejemplo: B5 (Fila B , columna 5)");
        String silla = sc.nextLine();
        String[] aux = silla.split("");
        if ("A".equalsIgnoreCase(aux[0])) {
            int fila = 1;
            int columna = Integer.parseInt(aux[1]);
            for (int i = 0; i < salas.length; i++) {
                for (int j = 0; j < salas[0].length; j++) {
                    if (i == fila && j == columna) {
                        if (salas[i][j] == "-") {
                            System.out.println("Por favor escriba su nombre y su edad separado por -");
                            String arreglo[] = sc.nextLine().split("-");
                            if (Integer.parseInt(arreglo[1]) >= 18) {
                                salas[i][j] = "O";
                                Peliculas dato = new Peliculas(arreglo[0], Integer.parseInt(arreglo[1]));
                                pelicula.add(dato);
                                for (int k = 0; k < pelicula.size(); k++) {
                                    System.out.println(pelicula.get(k) + "Codigo= " + aux[0] + aux[1] + '}');
                                }
                            } else {
                                System.out.println("Lo sentimos pero esta pelicula es solo para mayores de edad");
                            }
                        } else {
                            System.out.println("Esta silla ya esta ocupada");
                        }
                    }
                }
            }
        } else if ("B".equalsIgnoreCase(aux[0])) {
            int fila = 2;
            int columna = Integer.parseInt(aux[1]);
            for (int i = 0; i < salas.length; i++) {
                for (int j = 0; j < salas[0].length; j++) {
                    if (i == fila && j == columna) {
                        if (salas[i][j] == "-") {
                            System.out.println("Por favor escriba su nombre y su edad separado por -");
                            String arreglo[] = sc.nextLine().split("-");
                            if (Integer.parseInt(arreglo[1]) >= 18) {
                                salas[i][j] = "O";
                                Peliculas dato = new Peliculas(arreglo[0], Integer.parseInt(arreglo[1]));
                                pelicula.add(dato);
                                for (int k = 0; k < pelicula.size(); k++) {
                                    System.out.println(pelicula.get(k) + "Codigo= " + aux[0] + aux[1] + '}');
                                }
                            } else {
                                System.out.println("Lo sentimos pero esta pelicula es solo para mayores de edad");
                            }
                        } else {
                            System.out.println("Esta silla ya esta ocupada");
                        }
                    }
                }
            }
        } else if ("C".equalsIgnoreCase(aux[0])) {
            int fila = 3;
            int columna = Integer.parseInt(aux[1]);
            for (int i = 0; i < salas.length; i++) {
                for (int j = 0; j < salas[0].length; j++) {
                    if (i == fila && j == columna) {
                        if (salas[i][j] == "-") {
                            System.out.println("Por favor escriba su nombre y su edad separado por -");
                            String arreglo[] = sc.nextLine().split("-");
                            if (Integer.parseInt(arreglo[1]) >= 18) {
                                salas[i][j] = "O";
                                Peliculas dato = new Peliculas(arreglo[0], Integer.parseInt(arreglo[1]));
                                pelicula.add(dato);
                                for (int k = 0; k < pelicula.size(); k++) {
                                    System.out.println(pelicula.get(k) + "Codigo= " + aux[0] + aux[1] + '}');
                                }
                            } else {
                                System.out.println("Lo sentimos pero esta pelicula es solo para mayores de edad");
                            }
                        } else {
                            System.out.println("Esta silla ya esta ocupada");
                        }
                    }
                }
            }
        } else if ("D".equalsIgnoreCase(aux[0])) {
            int fila = 4;
            int columna = Integer.parseInt(aux[1]);
            for (int i = 0; i < salas.length; i++) {
                for (int j = 0; j < salas[0].length; j++) {
                    if (i == fila && j == columna) {
                        if (salas[i][j] == "-") {
                            System.out.println("Por favor escriba su nombre y su edad separado por -");
                            String arreglo[] = sc.nextLine().split("-");
                            if (Integer.parseInt(arreglo[1]) >= 18) {
                                salas[i][j] = "O";
                                Peliculas dato = new Peliculas(arreglo[0], Integer.parseInt(arreglo[1]));
                                pelicula.add(dato);
                                for (int k = 0; k < pelicula.size(); k++) {
                                    System.out.println(pelicula.get(k) + "Codigo= " + aux[0] + aux[1] + '}');
                                }
                            } else {
                                System.out.println("Lo sentimos pero esta pelicula es solo para mayores de edad");
                            }
                        } else {
                            System.out.println("Esta silla ya esta ocupada");
                        }
                    }
                }
            }
        }
    }

    public void llenarSalas() {
        for (int i = 0; i < salas.length; i++) {
            for (int j = 0; j < salas[0].length; j++) {
                salas[i][j] = "-";
                if (i == 0) {
                    salas[i][j] = String.valueOf(j);
                    salas[0][0] = " ";
                } else if (j == 0) {
                    salas[1][0] = "A";
                    salas[2][0] = "B";
                    salas[3][0] = "C";
                    salas[4][0] = "D";
                }
            }
        }
    }

    public void imprimirSala() {
        System.out.println("   Estado de la sala");
        System.out.println(" Asientos disponibles");
        for (String[] sala : salas) {
            for (int j = 0; j < salas[0].length; j++) {
                System.out.print(sala[j] + "   ");
            }
            System.out.println();
        }
        System.out.println("*******PANTALLA******");
    }

}
