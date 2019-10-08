/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.trabajos.modelos;

//import gui.areas.modelos.Area;
//import gui.personas.modelos.Alumno;
//import gui.personas.modelos.Profesor;
import gui.areas.modelos.Area;
import gui.personas.modelos.Alumno;
import gui.seminarios.modelos.Seminario;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;


/**
 *
 * @author gabinete
 */
public class Trabajo {
    private String titulo;
    private int duracion; //Duracionn del proyecto en meses
    private LocalDate presentacion; //fecha de aprobacion en el CA
    private LocalDate comienzo; // fecha de comienzo del trabajo, presentacion en el CA
    private LocalDate fechaFinal; // fecha de persentacion final
    private ArrayList<Area> areasInvolucrada =new ArrayList<>();
    private ArrayList<RolEnTrabajo> rolTrabajo = new ArrayList<>();
    private ArrayList<AlumnoEnTrabajo> alumTrabajo = new ArrayList<>();
    private ArrayList<Area> area = new ArrayList<>();
    private ArrayList<Seminario> seminarios = new ArrayList<>();

    public Trabajo(String titulo, ArrayList area, int duracion, LocalDate comienzo, LocalDate presentacion, ArrayList alumTrabajo, ArrayList rolTrabajo) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.comienzo = comienzo;
        this.alumTrabajo = alumTrabajo;
        this.rolTrabajo = rolTrabajo;
        this.area = area;
        this.presentacion = presentacion;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public LocalDate getFechaAprobacion() {
        return comienzo;
    }

    public void setFechaAprobacion(LocalDate comienzo) {
        this.comienzo = comienzo;
    }

    public LocalDate getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(LocalDate presentacion) {
        this.presentacion = presentacion;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }
    
    public void agregarSeminario(Seminario s){
        if (!this.seminarios.contains(s)){
            this.seminarios.add(s);
            System.out.println();
            System.out.println("Se agregó el seminario.");
        }
        else{
            System.out.println();
            System.out.println("No se agregó el seminario.");
        }
    }   
            
    public void agregarArea(Area area){
        this.areasInvolucrada.add(area);
    }

    public String agregarProfesor(RolEnTrabajo rol){
        if(!rolTrabajo.contains(rol)){
            this.rolTrabajo.add(rol);
            String s = "Se agrego un rol en el array.";
            return s;
        }
        else{
            String s = "No se agrego un rol en el array.";
            return s;
        }
    }
    
    public void agregarAlumnoEnTrabajo(LocalDate fechaDesde, Alumno unAlumno){
        AlumnoEnTrabajo alumno = new AlumnoEnTrabajo(fechaDesde, unAlumno);
        this.alumTrabajo.add(alumno);
    }
        
    public void agregarAreasInvolucrada(String nombre){
        Area AreasInvolucradas = new Area (nombre);
        this.areasInvolucrada.add(AreasInvolucradas);
    }
    
    public void mostrar(){
        System.out.println("Trabajo: " + titulo);
        System.out.println("Duración: " + duracion + " meses");
        System.out.println("Fecha Presentacion en la CA: " + comienzo);
        System.out.print("Fecha Aprobacion: ");
        if(this.presentacion== null){
            System.out.print("-");
        }
        else{
            System.out.print(presentacion);
        }
        System.out.println();
        System.out.print("Fecha Exposición: ");
        if(fechaFinal== null){
            System.out.print("-");
        }
        else{
            System.out.print(fechaFinal);
        }
        
        System.out.println("\n\nAlumnos:");
        System.out.println("----------------------");
        for(AlumnoEnTrabajo a : alumTrabajo){
            System.out.println("CX" + a.getAlumno().getCx() + " - " + a.getAlumno().getApellido() + ", " + a.getAlumno().getNombre());  
        }
        
        System.out.println("\nTutor ");
        System.out.println("----------------------");
        for(RolEnTrabajo r : rolTrabajo){
            if(r.getRol() == Rol.TUTOR){
                System.out.println(r.getProfesor().getNombre() + " " + r.getProfesor().getApellido());
            }
        }
        System.out.println("\nJurado ");
        System.out.println("----------------------");
        for(RolEnTrabajo r : rolTrabajo){
            if(r.getRol() == Rol.JURADO){
                System.out.println(r.getProfesor().getNombre() + " " + r.getProfesor().getApellido());
            }
        }
        
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.titulo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Trabajo other = (Trabajo) obj;
        if (!Objects.equals(this.titulo.toLowerCase(), other.titulo.toLowerCase())) {
            return false;
        }
        return true;
    }  
}
