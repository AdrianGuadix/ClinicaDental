/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author punib
 */
public class InformeGlobal {
    private long id; // VALIDOS: >0 INVÁLIDOS <0. Valor unico, no se puede repetir.
    private String descripcion; // No puede estar vacío, y tiene un mínimo de 10 carcteres.
    private ArrayList<Secretariado> secretarios = new ArrayList<Secretariado>();

    public long getId() {
        return id;
    }

    public ArrayList<Secretariado> getSecretarios() {
        return secretarios;
    }

    public void setSecretarios(ArrayList<Secretariado> secretarios) {
        this.secretarios = secretarios;
    }

    

    public String getDescripcion() {
        return descripcion;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public InformeGlobal() {
    }

    public InformeGlobal(long id, String descripcion, ArrayList<Secretariado> secretarios) {
        this.id = id;
        this.descripcion = descripcion;
        this.secretarios = secretarios;
    }
    public InformeGlobal(InformeGlobal e) {
        this.id = e.id;
        this.descripcion = e.descripcion;
        this.secretarios = e.secretarios;
    }

    @Override
    public String toString() {
        return "InformeGlobal{" + "id=" + id + ", descripcion=" + descripcion + ", secretarios=" + secretarios + '}';
    }
    
    
    
     public static InformeGlobal InformeGlobal(){
        InformeGlobal nuevoInformeGlobal = new InformeGlobal(); 
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el Id:");
        nuevoInformeGlobal.setId(in.nextInt()); 
        System.out.println("Introduce una descripción:");
        nuevoInformeGlobal.setDescripcion (in.nextLine ());
        return nuevoInformeGlobal;
       
         
    }
    
     public static InformeGlobal nuevoInformeGlobal(){
        InformeGlobal ret = new InformeGlobal(); 
        Scanner in = new Scanner(System.in);
        System.out.println("Intrudce el Id del informe:");
        int id = in.nextInt();
        ret.setId (in.nextInt()); 
        System.out.println("Descripción:");
        String descripcion = in.nextLine();
        ret.setDescripcion(descripcion);
                
             return ret;         
    }
    
}
