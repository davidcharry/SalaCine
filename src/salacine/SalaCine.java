/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salacine;

import java.util.Scanner;

/**
 *
 * @author mono-
 */
public class SalaCine {

    private static Scanner sc = new Scanner(System.in);
    public static Salas sala11 = new Salas();
    public static Salas sala12 = new Salas();
    public static Salas sala13 = new Salas();
    public static Salas sala21 = new Salas();
    public static Salas sala22 = new Salas();
    public static Salas sala23 = new Salas();
    public static Salas sala31 = new Salas();
    public static Salas sala32 = new Salas();
    public static Salas sala33 = new Salas();

    public static void main(String[] args) {
        sala11.llenarSalas();
        sala12.llenarSalas();
        sala13.llenarSalas();
        sala21.llenarSalas();
        sala22.llenarSalas();
        sala23.llenarSalas();
        sala31.llenarSalas();
        sala32.llenarSalas();
        sala33.llenarSalas();
        menu();
    }

    public static void menu() {
        System.out.println("\u001B[31mBIENVENIDO");
        System.out.println("\u001B[31mPELICULAS EN CARTELERA EN CARTELERA");
        System.out.println("1)Cruella");
        System.out.println("2)Los Croods2: una nueva era");
        System.out.println("3)Cincuenta sombras más oscuras");
        System.out.println("4)Salir");
        System.out.println("\u001B[31mPor favor escoja la pelicula de su eleccion");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1: {
                System.out.println("\u001B[31mEscoja por favor el horario que desea ver la pelicula:");
                System.out.println("1)2:00 pm");
                System.out.println("2)6:30 pm");
                System.out.println("3)10:30 pm ");
                System.out.println("4)Salir");
                System.out.println("\u001B[31mPor favor escoja el horario de su elección");
                int opcion2 = sc.nextInt();
                switch (opcion2) {
                    case 1: {
                        sala11.imprimirSala();
                        sala11.marcarSilla();
                        sala11.imprimirSala();
                        break;
                    }
                    case 2: {
                        sala12.imprimirSala();
                        sala12.marcarSilla();
                        sala12.imprimirSala();
                        break;
                    }
                    case 3: {
                        sala13.imprimirSala();
                        sala13.marcarSilla();
                        sala13.imprimirSala();
                        break;
                    }
                    case 4: {
                        menu();
                        break;
                    }
                    default:
                        System.out.println("\u001B[31mOpcion no disponible");
                }
                break;
            }
            case 2: {
                System.out.println("\u001B[31mEscoja por favor el horario que desea ver la pelicula:");
                System.out.println("1)2:00 pm");
                System.out.println("2)6:30 pm");
                System.out.println("3)10:30 pm ");
                System.out.println("4)Salir");
                System.out.println("\u001B[31mPor favor escoja el horario de su elección");
                int opcion2 = sc.nextInt();
                switch (opcion2) {
                    case 1: {
                        sala21.imprimirSala();
                        sala21.marcarSilla();
                        sala21.imprimirSala();
                        break;
                    }
                    case 2: {
                        sala22.imprimirSala();
                        sala22.marcarSilla();
                        sala22.imprimirSala();
                        break;
                    }
                    case 3: {
                        sala23.imprimirSala();
                        sala23.marcarSilla();
                        sala23.imprimirSala();
                        break;
                    }
                    case 4: {
                        menu();
                        break;
                    }
                    default:
                        System.out.println("\u001B[31mOpcion no disponible");
                }
                break;
            }
            case 3: {
                System.out.println("\u001B[31mEscoja por favor el horario que desea ver la pelicula:");
                System.out.println("1)2:00 pm");
                System.out.println("2)6:30 pm");
                System.out.println("3)10:30 pm ");
                System.out.println("4)Salir");
                System.out.println("\u001B[31mPor favor escoja el horario de su elección");
                int opcion2 = sc.nextInt();
                switch (opcion2) {
                    case 1: {
                        sala31.imprimirSala();
                        sala31.marcarSilla();
                        sala31.imprimirSala();
                        break;
                    }
                    case 2: {
                        sala32.imprimirSala();
                        sala32.marcarSilla();
                        sala32.imprimirSala();
                        break;
                    }
                    case 3: {
                        sala33.imprimirSala();
                        sala33.marcarSilla();
                        sala33.imprimirSala();
                        break;
                    }
                    case 4: {
                        menu();
                        break;
                    }
                    default: {
                    }
                }
                break;
            }
            case 4: {
                System.exit(0);
                break;
            }
            default: {
                System.out.println("\u001B[31mOpcion no disponible");
            }
            break;
        }
        menu();
    }
}
