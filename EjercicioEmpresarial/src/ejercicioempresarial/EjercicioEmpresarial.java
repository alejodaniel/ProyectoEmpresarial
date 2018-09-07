package ejercicioempresarial;

import static java.time.Clock.system;
import java.util.Scanner;

public class EjercicioEmpresarial {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n;
        int s = 0;
        //ingresar los datos
        System.out.println("Ingrese un numero:");
        {
            n = reader.nextInt();
        }
        //funcion para aumentar los numeros
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
