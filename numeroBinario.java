/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladores;

import java.util.*;

/**
 *
 * @author reyna
 */
public class numeroBinario {

    public static void main(String[] args) {

        try {

            Scanner dato = new Scanner(System.in);

            System.out.println("INGRESA TU NOMBRE");
            String nombre = dato.next();

            int suma = 0;

            if (nombre.matches("[aA-zZ]*")) {

                char letrasMays[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
                char letrasMins[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

                int valorLsMays[] = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90};
                int valorLsMinus[] = {97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};

                String numerosBinarios[] = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};

                System.out.println("");//Parte 1
                for (int i = 0; i <= nombre.length() - 1; i++) { //entra la cadena para ser desglosdada

                    char digito = nombre.charAt(i); // obteniendo el digito del indice
                    int bandera = 0;

                    while (bandera <= letrasMays.length - 1) {

                        if (digito == letrasMays[bandera]) {

                            suma = valorLsMays[bandera] + suma;
                            System.out.println(digito + " " + valorLsMays[bandera]);

                        }

                        if (digito == letrasMins[bandera]) {

                            suma = valorLsMinus[bandera] + suma;
                            System.out.println(digito + " " + valorLsMays[bandera]);

                        }

                        ++bandera;

                    }

                    System.out.println("\t = " + suma);

                }

                System.out.println(" ");//Parte 2 
                String cifraSuma = String.valueOf(suma); //casteo de int a String
                int suma2 = 0;

                for (int j = 0; j <= cifraSuma.length() - 1; j++) { //entra la cadena para ser desglosdada

                    char numero = cifraSuma.charAt(j); //casteo de String a char

                    suma2 = Integer.valueOf(Character.toString(numero)) + suma2;

                    System.out.println(Integer.valueOf(Character.toString(numero)));
                    System.out.println("\t = " + suma2);

                }

                System.out.println("");//Parte 3
                String cifraSuma2 = String.valueOf(suma2); //casteo de int a String
                int suma3 = 0;

                for (int k = 0; k <= cifraSuma2.length() - 1; k++) { //entra la cadena para ser desglosdada

                    char numero2 = cifraSuma2.charAt(k); //casteo de String a char

                    suma3 = Integer.valueOf(Character.toString(numero2)) + suma3;

                    System.out.println(Integer.valueOf(Character.toString(numero2)));
                    System.out.println("\t = " + suma3);

                }

                System.out.println("");//Parte 4
                System.out.println("Tu número Binario es: " + numerosBinarios[suma3]);
//                   
            } else {
                System.out.println("\n¡La cadena tiene números o carcateres no aceptables!" + "\n\n¡FIN DEL PROGRAMA!");
            }

        } catch (Exception io) {
            io.getMessage();
            io.getLocalizedMessage();
        }

    }
}

