/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandro.DAO;

import com.alejandro.dominio.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alejandro
 */
public class UsuarioDao {

    public Connection conectar() {
        try {
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/facturadb", "root", "alejodaniel12345");
            return connect;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public boolean editarUsuario(Usuario usuario) {
        String sql = "update usuario set nombreUsuario='" + usuario.getNombreUsuario() + "',contraseña='" + usuario.getPassword() + "',rol='" + usuario.getRol()
                + "' where idPersona=" + usuario.getIdUsuario();
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
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public List<Usuario> getUsuarios(String criterio) {
        String sql = "Select * from usuario where nombreUsuario like '%" + criterio + "%'";
        Connection con = conectar();
        try {
            //preparando la sentencia para ser ejecutada
            PreparedStatement pst = con.prepareStatement(sql);
            //obtener los datos q estan en la variable rs
            ResultSet rs = pst.executeQuery();
            //para recoorere toda la consulta contenida en rs
            List<Usuario> usuarios = new ArrayList<>();
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdUsuario(rs.getInt("idUsuario"));
                usuario.setNombreUsuario(rs.getString("nombreUsuario"));
                usuario.setPassword(rs.getString("contraseña"));
                usuario.setRol(rs.getString("rol"));

                usuarios.add(usuario);

            }

            //cierra la conexion a la bdd despues de la consulta
            if (con != null) {
                con.close();
            }
            return usuarios;

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean saveUsuario(Usuario usuario) {
        String sql = "insert into usuario values (?,?,?,?,?)";
//        System.out.println("Persona: "+persona.toString());
//        String sql1 = "insert into persona values ("+persona.getIdPersona()+",'"+persona.getNombre()+"'....)";
        Connection connect = conectar();
        try {
            PreparedStatement pst = connect.prepareStatement(sql);
            pst.setInt(1, usuario.getIdUsuario());
            pst.setString(2, usuario.getNombreUsuario());
            pst.setString(3, usuario.getPassword());
            pst.setString(4, usuario.getRol());
            pst.setInt(5, usuario.getIdPersona());

            //guarda o actualiza en la base de datos
            int guarda = pst.executeUpdate();
            //cierra la conexion a la bdd despues de la consulta
            if (connect != null) {
                connect.close();
            }

            //0 no se guardo y 1 si se guardo
            if (guarda == 0) {
                return false;
            } else {

                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public int getSiguienteIdUsuario() {
        String sql = "select * from usuario where idUsuario=(select max(idUsuario) from usuario)";
        Connection connect = conectar();
        try {
            PreparedStatement pst = connect.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            int idActual = 0;
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdUsuario(rs.getInt("idUsuario"));
                idActual = usuario.getIdUsuario();
            }
            idActual++;
            //cierra la conexion a la bdd despues de la consulta
            if (connect != null) {
                connect.close();
            }
            return idActual;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

}
