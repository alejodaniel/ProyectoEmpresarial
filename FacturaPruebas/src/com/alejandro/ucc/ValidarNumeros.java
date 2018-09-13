/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandro.ucc;

/**
 *
 * @author Alejandro
 */
public class ValidarNumeros {

   public boolean validacion(String cadena){
       int numero;
               try{
                   numero = Integer.parseInt(cadena);
                   return true;
               }catch(Exception e)
               {
                   return false;
                   
               }
       
   }
}
