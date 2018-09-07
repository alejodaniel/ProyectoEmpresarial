/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandro.DAO;

import com.alejandro.dominio.Persona;
//import com.alejandro.dominio.Usuario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro
 */
public class PersonaDao {

    public Connection conectar() {
        try {
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/facturadb", "root", "alejodaniel12345");
            return connect;
        } catch (SQLException ex) {
            Logger.getLogger(PersonaDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public boolean editarPersona(Persona persona) {
        String sql = "update persona set nombre='" + persona.getNombre() + "',cedula='" + persona.getCedula() + "',direccion='" + persona.getDireccion() + "',telefono='" + persona.getTelefono() + "',celular='" + persona.getCelular() +
        "' where idPersona="+persona.getIdPersona();
        Connection con = conectar();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            //guarda o actualiza en la base de datos
            int n = pst.executeUpdate();
            //cierra la conexion a la bdd despues de la consulta
            if (con != null) {
                con.close();
            }

            //0 no se guardo 1 si
            if (n == 0) {
                return false;
            } else {

                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public List<Persona> getPersonas(String criterio) {
        String sql = "Select * from Persona where nombre like '%" + criterio + "%'";
        Connection con = conectar();
        try {
            //preparando la sentencia para ser ejecutada
            PreparedStatement pst = con.prepareStatement(sql);
            //obtener los datos q estan en la variable rs
            ResultSet rs = pst.executeQuery();
            //para recoorere toda la consulta contenida en rs
            List<Persona> personas = new ArrayList<>();
            while (rs.next()) {
                Persona persona = new Persona();
                persona.setIdPersona(rs.getInt("idPersona"));
                persona.setNombre(rs.getString("nombre"));
                persona.setCedula(rs.getString("cedula"));
                persona.setDireccion(rs.getString("direccion"));
                persona.setTelefono(rs.getString("telefono"));
                persona.setCelular(rs.getString("celular"));

                personas.add(persona);

            }

            //cierra la conexion a la bdd despues de la consulta
            if (con != null) {
                con.close();
            }
            return personas;

        } catch (SQLException ex) {
            Logger.getLogger(PersonaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean savePersona(Persona persona) {
        String sql = "insert into persona values (?,?,?,?,?,?)";
//        System.out.println("Persona: "+persona.toString());
//        String sql1 = "insert into persona values ("+persona.getIdPersona()+",'"+persona.getNombre()+"'....)";
        Connection con = conectar();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, persona.getIdPersona());
            pst.setString(2, persona.getNombre());
            pst.setString(3, persona.getCedula());
            pst.setString(4, persona.getDireccion());
            pst.setString(5, persona.getTelefono());
            pst.setString(6, persona.getCelular());
            //guarda o actualiza en la base de datos
            int n = pst.executeUpdate();
            //cierra la conexion a la bdd despues de la consulta
            if (con != null) {
                con.close();
            }

            //0 no se guardo 1 si
            if (n == 0) {
                return false;
            } else {

                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(PersonaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public int getSiguienteIdPersona() {
        String sql = "select * from persona where idPersona=(select max(idPersona) from persona)";
        Connection con = conectar();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            int idActual = 0;
            while (rs.next()) {
                Persona persona = new Persona();
                persona.setIdPersona(rs.getInt("idPersona"));
                idActual = persona.getIdPersona();
            }
            idActual++;
            //cierra la conexion a la bdd despues de la consulta
            if (con != null) {
                con.close();
            }
            return idActual;
        } catch (SQLException ex) {
            Logger.getLogger(PersonaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}



