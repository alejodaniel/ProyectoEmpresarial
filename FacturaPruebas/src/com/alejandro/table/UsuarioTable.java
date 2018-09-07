/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandro.table;

import com.alejandro.dominio.Usuario;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Alejandro
 */
public class UsuarioTable extends AbstractTableModel {

    String titulo[] = {"NombreUsuario", "Contraseña", "Rol"};

    private List<Usuario> filas;
    private Usuario usuario;

    public UsuarioTable(List<Usuario> filas) {
        this.filas = filas;
    }
//Herencia

    @Override
    public int getRowCount() {
        return getFilas() != null ? getFilas().size() : 0;//retorna el numero de filas
    }

    @Override
    public int getColumnCount() {
        return titulo.length;
    }

    @Override
    public String getColumnName(int column) {
        return titulo[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        setUsuario(getFilas().get(rowIndex));

        switch (columnIndex) {
            case 0:
                return getUsuario().getNombreUsuario();
            case 1:
                return getUsuario().getPassword();
            case 2:
                return getUsuario().getRol();

        }

        return null;
    }

    /**
     * @return the filas
     */
    public List<Usuario> getFilas() {
        return filas;
    }

    /**
     * @param filas the filas to set
     */
    public void setFilas(List<Usuario> filas) {
        this.filas = filas;
    }

    /**
     * @return the persona
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the persona to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
