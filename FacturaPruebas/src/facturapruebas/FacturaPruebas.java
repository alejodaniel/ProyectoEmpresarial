/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturapruebas;

import com.alejandro.views.Principal;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro
 */
public class FacturaPruebas {

    public static void main(String[] args) {

        Principal p = new Principal();
        p.setVisible(true);
        int segundos = 1;
        for (segundos = 1; segundos <= 3; segundos++) {
//            JOptionPane.showMessageDialog(null, segundos);
            limiteSegundos();
        }
    }

    public static void limiteSegundos() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }
    }
}
