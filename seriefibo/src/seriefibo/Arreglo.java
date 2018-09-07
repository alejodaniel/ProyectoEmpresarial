/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriefibo;

import java.util.InputMismatchException;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro
 */
public class Arreglo {

    public void ejercicioarreglo2() {
        try {

            String s = JOptionPane.showInputDialog(null, "Ingrese el tamaño del arreglo");
            int numero = Integer.parseInt(s);
            System.out.println("El número que ingreso es: " + numero);

            System.out.println("Trabajando con arreglos");
            int[] numeros = new int[numero];

            generarnumeroaleatorio(numeros);
            muestra(numeros);

        } catch (NumberFormatException error) {
            System.out.println("Solo ingresar numeros");
            ejercicioarreglo2();
        }
    }

//-------------------------------------------------------------------------------------------------------------------------------------------------------
    public void generarnumeroaleatorio(int numeros[]) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = (int) (Math.random() * 9 + 0);
            suma = suma + numeros[i];
        }
        System.out.println("la suma de los valores aleatorios es: " + suma);
    }

    public void muestra(int numeros[]) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("El valor aleatorio: " + numeros[i] + "-esta en el indice: " + i);
        }
    }

    //------------------------------------------------------------------------------------------------------------
    public void ejercicioarreglo1() {
        try {

            int[] numeracion = new int[5];

            rellenar(numeracion);
            mostrar(numeracion);

        } catch (NumberFormatException error) {
            System.out.println("Solo ingresar numeros");
            ejercicioarreglo1();
        }
    }

    public void rellenar(int numeros[]) {

        for (int i = 0; i < numeros.length; i++) {
            String number = JOptionPane.showInputDialog(null, "Ingrese el valor del indice: " + i);
            numeros[i] = Integer.parseInt(number);

        }

    }

    public void mostrar(int numeros[]) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("el valor: " + numeros[i] + "-esta en el indice: " + i);
        }
    }

    //----------------------------------------------------------------------------------------------------------------------
    public void ejemplo() {
        try {

            String s = JOptionPane.showInputDialog(null, "Ingrese el tamaño del arreglo");
            int numero = Integer.parseInt(s);
            System.out.println("El número que ingreso es: " + numero);

            System.out.println("Trabajando con arreglos");
            int[] numeros = new int[numero];
            for (int i = 0; i < numeros.length; i++) {
                //JOptionPane.showMessageDialog(null, "Ingrese el valor del indice "+i);

                numeros[i] = (int) (Math.random() * 9 + 0);
//                System.out.print(numeros[i]+" ");
            }
            for (int i = 0; i < numeros.length; i++) {
                System.out.print(numeros[i] + " ");
            }

        } catch (NumberFormatException error) {
            System.out.println("Solo ingresar numeros");
            ejemplo();
        }
    }

//-----------------------------------------------------------------------------------------------------------------------------------  
    public void pruebaArreglo() {
        try {
            String s = JOptionPane.showInputDialog(null, "Ingrese el tamaño del arreglo");
            int numero = Integer.parseInt(s);
            System.out.println("El número que ingreso es: " + numero);

            System.out.println("Trabajando con arreglos");
            int[] numeros = new int[10];
            numeros[0] = 6;
            numeros[1] = 9;
            numeros[2] = 2;
            numeros[3] = 4;
            numeros[4] = 3;
            numeros[5] = 1;
            numeros[6] = 10;
            numeros[7] = 5;
            numeros[8] = 7;
            numeros[9] = 8;
            for (int i = 0; i < numeros.length; i++) {
                System.out.print(numeros[i]);

            }
        } catch (NumberFormatException error) {
            System.out.println("Solo ingresar numeros");
            pruebaArreglo();
        }
    }

//-----------------------------------------------------------------------------------------------------------------------------
    public void ejercicioarreglo3() {
        try {
            String s = JOptionPane.showInputDialog(null, "Ingrese el tamaño del arreglo");
            int numero = Integer.parseInt(s);
            System.out.println("El número que ingreso es: " + numero);

            System.out.println("Trabajando con arreglos");
            int[] numeros = new int[numero];
            int mayor = 0;
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = (int) (Math.random() * 50 + 10);
                if (esprimo(numeros[i])) {
                    System.out.println(" es primo: " + numeros[i]);
                } else {
                    System.out.println("no es primo: " + numeros[i]);
                }
                if (numeros[i] > mayor) {
                    mayor = numeros[i];
                }

            }
            System.out.println("el numero mayor es: " + mayor);
        } catch (NumberFormatException error) {
            System.out.println("Solo ingresar numeros");
            ejercicioarreglo3();
        }
    }

    public boolean esprimo(int numeros) {

        int contador = 0;
        for (int i = 1; i <= numeros; i++) {
            if ((numeros % i) == 0) {
                contador++;
            }
        }
        if (contador <= 2) {
            // System.out.print("El numero es primo");
            return true;
        } else {
            // System.out.print("El numero NO es primo");
            return false;
        }

    }

    //----------------------------------------------------------------------------------------------------------------------
    public int serieprimo(int numero) {
//       Scanner reader = new Scanner(System.in);
//        System.out.print("\nIngrese un numero:");
//       int numero = reader.nextInt();
        int cont = 0;
        int valor = 0;
        for (int i = 2; cont < numero; i++) {
            if (esprimo(i) == true) {
//               System.out.print(i + "/");
                valor = i;
                cont++;

            }
        }
        return valor;
    }

    //-------------------------------------------------------------------------------------------------------------------------------------
    public void ejercicioarreglo4() {
        double suma = 0;
        double media = 0;

        int[] numeros = new int[100];
        for (int i = 1; i <= numeros.length; i++) {

            if (i <= numeros.length) {
                System.out.print("+" + i);
            } else {
                System.out.print(i);
            }
            suma = suma + i;
        }
        media = suma / 100;
        System.out.println("");
        System.out.println("la suma es: " + suma);
        System.out.println("la media es: " + media);
    }
}
