/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandro.table;

import com.alejandro.dominio.Persona;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class PersonaTable extends AbstractTableModel {

    String titulo[] = {"Nombre", "Cedula", "Direccion", "Telefono", "Celular"};

    private List<Persona> filas;
    private Persona persona;

    public PersonaTable(List<Persona> filas) {
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
        setPersona(getFilas().get(rowIndex));

        switch (columnIndex) {
            case 0:
                return getPersona().getNombre();
            case 1:
                return getPersona().getCedula();
            case 2:
                return getPersona().getDireccion();
            case 3:
                return getPersona().getTelefono();
            case 4:
                return getPersona().getCelular();
        }

        return null;
    }

    /**
     * @return the filas
     */
    public List<Persona> getFilas() {
        return filas;
    }

    /**
     * @param filas the filas to set
     */
    public void setFilas(List<Persona> filas) {
        this.filas = filas;
    }

    /**
     * @return the persona
     */
    public Persona getPersona() {
        return persona;
    }

    /**
     * @param persona the persona to set
     */
    public void setPersona(Persona persona) {
        this.persona = persona;
    }

}
