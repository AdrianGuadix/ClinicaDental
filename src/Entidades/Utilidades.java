/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author punib
 */
public class Utilidades {
   private static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
       
       
    
    public static final Cobro COBROS [] = {
        new Cobro (001, 110, Date.valueOf(LocalDate.parse("22/12/2020", dateFormatter))),
        new Cobro (015, 300, Date.valueOf(LocalDate.parse("04/01/2021", dateFormatter))),
        new Cobro (033, 250.500, Date.valueOf(LocalDate.parse("10/01/2021", dateFormatter))),
    };
    
    
        public static final int numCobro = COBROS.length;
        
    
    public static final Pago PAGOS [] = {
        
        new Pago (002, Date.valueOf(LocalDate.parse("23/12/2020", dateFormatter)), 160, "tarjeta", COBROS[0]),
        new Pago (022, Date.valueOf(LocalDate.parse("27/12/2020", dateFormatter)), 70, "metálico", COBROS[0]),
        new Pago (030, Date.valueOf(LocalDate.parse("31/12/2020", dateFormatter)), 57.99, "transferencia", COBROS[0]), // preguntar a Luis
        
    };
    
         public static final int numPago = PAGOS.length;
         
         
   public static final Intervencion INTERVENCIONES [] = {
       //new Intervencion (49, ) // medir en minutos (reflejarlo en la tabla) preguntar por los ARRAYLIST
       
   };
        public static final int numIntervencion = INTERVENCIONES.length;
        
   public static final InformeGlobal INFORMES [] = {
        
       //new InformeGlobal (3333,"patatín y patatán") //ArrayList
       
   };
   
   public static final Empleado EMPLEADOS [] = {
    
       new Empleado (01,"Manolo","Garcia","649678821","72598327C","C/Menendez Pelayo"),
       new Empleado (02,"Carlos","Martinez","649673821","72598327N","C/Venancio Bosco"),
       new Empleado (03,"David","Lopez","659678821","73598327C","C/Bajada el Chorrillo")
       
   };
        public static final int Empleado = EMPLEADOS.length;
    
    public static final Enfermeria ENFERMERIA [] = {
    
      new Enfermeria ('A',01,"Laura","Martinez","640798854","72208764J","C/Menendez Pelayo"),
      new Enfermeria ('B',02,"Martin","Morales","640758854","722087321A","C/Bajada el Chorrillo"),
      new Enfermeria ('C',03,"Maria","Lopez","620798854","62208764N","C/Menendez Pelayo"),
       
   };
        public static final int Enfermeria = ENFERMERIA.length;
        
    public static final Cirujano CIRUJANOS [] = {
    
      //new Cirujano (ArrayList,01,"Elsa","Patico","640758854","72208724J","C/Menendez Pelayo"),
      //new Cirujano (ArrayList,02,"Ana","Rosa","640218854","725687321A","C/San Ignacio"),
      //new Cirujano (ArrayList,03,"Aaron","Garcia","620928854","73208764N","Barrio Los Marineros"),
       
   };
     public static final int Cirujano = CIRUJANOS.length;
   
      public static final Secretariado SECRETARIADO [] = {
    
      //new Secretariado (2,ArrayList,01,"Elsa","Pataco","640758214","72205524J","C/Menendez Pelayo"),
      //new Secretariado (5,ArrayList,02,"Marcos","Rosa","640412854","725227321A","C/San Ignacio"),
      //new Secretariado (8,ArrayList,03,"Aaron","Lopez","620928854","73208764N","Barrio Los Marineros"),
       
   };
      public static final int Secretariado = SECRETARIADO.length;
}
