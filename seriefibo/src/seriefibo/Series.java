/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriefibo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class Series {

    public void fibonacci() {
        Scanner reader = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 1;
        int valor = 0;

        System.out.println("Ingrese un numero:");
        int numero = reader.nextInt();

        System.out.print(numero1 + "-");
        System.out.print(numero2 + "-");
        for (int i = 1; i <= numero; i++) {

            valor = numero1 + numero2;
            numero1 = numero2;
            numero2 = valor;
            if (i < numero) {
                System.out.print(valor + "-");
            } else {
                System.out.print(valor);
            }

        }

    }
//-----------------------------------------------------------------------------------------------------------------

    public int ciclofibonacci(int n) {
        int a = 0;
        int b = 1;
        int s = 0;

        int valorposicion = 0;
        int cont = 0;
        while (cont < n) {
//            System.out.print(a);
            valorposicion = a;
            s = a + b;
            a = b;
            b = s;
            cont++;
        }

        return valorposicion;
    }
//----------------------------------------------------------------------------------------------------------------

    public boolean primo(int numero) {
//        Scanner reader = new Scanner(System.in);
        int contador = 0;
//
//        System.out.print("Ingrese un numero:");
//        {
//            numero = reader.nextInt();
//
//        }
        for (int i = 1; i <= numero; i++) {
            if ((numero % i) == 0) {
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
//--------------------------------------------------------------------------------------------------------

    public int serieprimo(int numero) {
//        Scanner reader = new Scanner(System.in);
//        System.out.print("\nIngrese un numero:");
//        int numero = reader.nextInt();
        int cont = 0;
        int valor = 0;
        for (int i = 2; cont < numero; i++) {
            if (primo(i) == true) {
//                System.out.print(i + "/");
                valor = i;
                cont++;

            }
        }
        return valor;
    }

    //---------------------------------------------------------------------------------------------------
    public void primofibo() {

        try {
            Scanner reader = new Scanner(System.in);
            System.out.print("\nIngrese un numero:");
            int numero = reader.nextInt();
            float total = 0;
            for (int i = 1; i <= numero; i++) {
                int numfib = ciclofibonacci(i);

                //System.out.println("numfib: " + numfib);
                int numpri = serieprimo(i);
                //System.out.println("numpri: " + numpri);

                float resultado = (int) Math.pow(numero, numfib);
                //System.out.println("El resultado de la potencia es: " + resultado);
                total = total + resultado / numpri;
                //if( total!= 1)
                if (i < numero) {
                    System.out.print(numero + "^" + numfib + "/" + numpri + "+");
                } else {
                    System.out.print(numero + "^" + numfib + "/" + numpri);
                }

            }

            System.out.print("=" + total);

        } catch (InputMismatchException error) {
            System.out.println("Solo ingresar numeros");
            primofibo();
        }
    }

//------------------------------------------------------------------------------------------------------------------
    public void seno() {
        try {
            Scanner reader = new Scanner(System.in);
            System.out.print("\nIngrese un numero:");
            int numero = reader.nextInt();
            double resultado = 0;
            //float total = 0;
            for (int i = 1; i <= numero; i++) {
                //exponente
                int exponente = impares(i);
                //es el factorial
                double denominador = factor(exponente);
                double potencia = (int) Math.pow(numero, exponente);
                //System.out.println("potencia: "+potencia);
                //System.out.println("factorial: "+denominador);
                double division = potencia / denominador;
                String signo = "";
                //cunado es impar sumamos
                if (esimpar(i) == true) {
                    signo = "-";

                    resultado = resultado + division;
                } else {
                    signo = "+";
//                  
                    resultado = resultado - division;
                }
                if (i < numero) {
                    System.out.print(+numero + "^" + denominador + "/" + denominador + " " + signo + " ");

                } else {

                    System.out.print(+numero + "^" + denominador + "/" + denominador + " ");
                }
            }
            System.out.println(" = " + resultado);
        } catch (InputMismatchException error) {
            System.out.println("Solo ingresar numeros");
            seno();
        }
    }

    //-------------------------------------------------------------------------------------------------------------
    public void coseno() {
        try {
            Scanner reader = new Scanner(System.in);
            System.out.print("\nIngrese un numero:");
            int numero = reader.nextInt();
            double resultado = 0;
            //float total = 0;
            for (int i = 1; i <= numero; i++) {
                //exponente
                int exponente = impares(i);
                //es el factorial
                double denominador = factor(exponente);
                double potencia = (int) Math.pow(numero, exponente);
                //System.out.println("potencia: "+potencia);
                //System.out.println("factorial: "+denominador);
                double division = potencia / denominador;
                String signo = "";
                //cunado es impar sumamos
                if (esimpar(i) == true) {
                    signo = "-";
                    //System.out.print("division: "+division);
//                    System.out.println(+numero + "^" + denominador + "/" + denominador);
                    resultado = resultado + division;
                } else {
                    signo = "+";
//                    System.out.println(+numero + "^" + denominador + "/" + denominador);
                    //System.out.print("division: "+division);
                    resultado = resultado - division;
                }
                //System.out.print("Resultado: " + resultado);
                System.out.print(+numero + "^" + denominador + "/" + denominador + " " + signo + " ");
                //System.out.print("=" + resultado);

//                System.out.println("factorial: " + exponente);
            }
            System.out.println(" = " + resultado);
        } catch (InputMismatchException error) {
            System.out.println("Solo ingresar numeros");
            coseno();
        }
    }

//-------------------------------------------------------------------------------------------------------
    public boolean espar(int numero) {
        if (numero % 2 == 0) {
            return true;
            //System.out.println("El número " + numero + " Es par");
        } else {
            return false;
            //System.out.println("El número " + numero + " Es impar");
        }
    }

//--------------------------------------------------------------------------------------------------------
    public int pares(int numero) {

        int cont = 0;
        int par = 1;
        int posicion = 0;

        while (cont <= numero) {
            posicion = par;
            par += 2;
            cont++;
        }

        return posicion;
    }
//---------------------------------------------------------------------------------------------------------

    public boolean esimpar(int numero) {
        if (numero % 2 == 1) {
            return true;
            //System.out.println("El número " + numero + " Es par");
        } else {
            return false;
            //System.out.println("El número " + numero + " Es impar");
        }
    }
    //--------------------------------------------------------------------------------------------------------------------------------------

    //------------------------------------------------------------------------------------------------------------------
    public int factor(int n) {

        int producto = n;
        int factorial = 1;
        int valor = 0;

        for (int i = 1; i <= n; i++) {

            factorial = factorial * producto;
            valor = i;
            producto--;
        }

        return factorial;
    }
//--------------------------------------------------------------------------------------------------

    public int impares(int numero) {

        int cont = 1;
        int imp = 1;
        int posicion = 0;

        while (cont <= numero) {
            posicion = imp;
            imp += 2;
            cont++;
        }

        return posicion;
    }

    //----------------------------------------------------------------------------------------------------------------------
    public void serie() {
        Scanner reader = new Scanner(System.in);
        int n;
        int s = 0;
        //ingresar los datos
        System.out.println("Ingrese un numero:");
        {
            n = reader.nextInt();
        }
        // aumentar los numeros de acuerdo al numero dado
        for (int i = 1; i <= n; i++) {
            if (i > 1) {
                System.out.print("+" + i);
            } else {
                System.out.print(i);
            }
            s = s + i;
        }
        System.out.println("\nla respuesta es:" + s);
    }
}
