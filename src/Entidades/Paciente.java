/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author Mikel
 */
public class Paciente {
    private long id;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String DNI;
    private ArrayList<Tratamiento> tratamientos = new ArrayList<Tratamiento>();
    private ArrayList<Cita> citas = new ArrayList<Cita>();
    private Historial historial;
    
    public Paciente() {
    }

    public Historial getHistorial() {
        return historial;
    }

    public void setHistorial(Historial historial) {
        this.historial = historial;
    }

    
    
    public ArrayList<Tratamiento> getTratamientos() {
        return tratamientos;
    }

    public void setTratamientos(ArrayList<Tratamiento> tratamientos) {
        this.tratamientos = tratamientos;
    }

    public ArrayList<Cita> getCitas() {
        return citas;
    }

    public void setCitas(ArrayList<Cita> citas) {
        this.citas = citas;
    }

       
    
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    
}

