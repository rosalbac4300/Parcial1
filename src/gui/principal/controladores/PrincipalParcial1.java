/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.principal.controladores;



import gui.areas.modelos.Area;
import gui.personas.modelos.Alumno;
import gui.personas.modelos.Cargo;
import gui.personas.modelos.Persona;
import gui.personas.modelos.Profesor;
import gui.trabajos.modelos.AlumnoEnTrabajo;
import gui.trabajos.modelos.Rol;
import gui.trabajos.modelos.RolEnTrabajo;
import gui.trabajos.modelos.Trabajo;
import java.time.LocalDate;
import java.util.ArrayList;

public class PrincipalParcial1 {
    public static void main (String Args[] ) { 
        ArrayList<Area> listaAreas =new ArrayList<> ();
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        ArrayList<Trabajo> listaTrabajos = new ArrayList<>();
        
        
        //***************************AREAS**********************************
        Area area1 = nuevaArea("Software");
        Area area2 = nuevaArea("Hardware");
        Area area3 = nuevaArea("Sistemas Embebidos");
        Area area4 = nuevaArea("Redes");
        Area area5 = nuevaArea("Redes"); //nombre repetido
        Area area6 = nuevaArea(null); //nombre nulo
        Area area7 = nuevaArea(""); //nombre vacío
        
        System.out.println(agregarArea(area1, listaAreas));
        System.out.println(agregarArea(area1, listaAreas)); //área repetida
        System.out.println(agregarArea(area2, listaAreas));
        System.out.println(agregarArea(area3, listaAreas));
        System.out.println(agregarArea(area4, listaAreas));
        System.out.println(agregarArea(area5, listaAreas));
        System.out.println(agregarArea(area6, listaAreas));
        System.out.println(agregarArea(area7, listaAreas));
               
        mostrarAreas(listaAreas);
        
        ArrayList<Area> listaAreas1 = new ArrayList<>();
        listaAreas1.add(listaAreas.get(0)); //Software

               
        //***************************PERSONAS**********************************
        Persona prof1 = PrincipalParcial1.nuevaPersona("Juárez", "Juan José", 1, Cargo.ASOCIADO);
        Persona prof2 = PrincipalParcial1.nuevaPersona("Díaz", "Juan Pablo", 2, Cargo.JTP);
        Persona prof3 = PrincipalParcial1.nuevaPersona("Juárez", "Ana María", 3, Cargo.ADJUNTO);
        Persona prof4 = PrincipalParcial1.nuevaPersona("San Martín","José Manuel", 4, Cargo.ADG); 
        Persona prof5 = PrincipalParcial1.nuevaPersona("Ortega", "Laura", 5, Cargo.ASOCIADO);
        Persona prof6 = PrincipalParcial1.nuevaPersona("Rodríguez","Juliana", 4, Cargo.TITULAR); //dni repetido con otro profesor 
        Persona prof7 = PrincipalParcial1.nuevaPersona(null,"Juliana", 6, Cargo.TITULAR); //apellido nulo
        Persona prof8 = PrincipalParcial1.nuevaPersona("","Juliana", 6, Cargo.TITULAR); //apellido vacío
        Persona prof9 = PrincipalParcial1.nuevaPersona("Rodríguez",null, 6, Cargo.TITULAR); //nombre nulo
        Persona prof10 = PrincipalParcial1.nuevaPersona("Rodríguez","", 6, Cargo.TITULAR); //nombre vacío
        Persona prof11 = PrincipalParcial1.nuevaPersona("Rodríguez","Juliana", 0, Cargo.TITULAR); //dni <=0
        Persona prof12 = PrincipalParcial1.nuevaPersona("Rodríguez","Juliana", 6, (Cargo)null); //cargo nulo
        
        System.out.println(agregarPersona(prof1, listaPersonas));
        System.out.println(agregarPersona(prof1, listaPersonas));  //profesor repetido
        System.out.println(agregarPersona(prof2, listaPersonas));
        System.out.println(agregarPersona(prof3, listaPersonas));
        System.out.println(agregarPersona(prof4, listaPersonas));
        System.out.println(agregarPersona(prof5, listaPersonas));
        System.out.println(agregarPersona(prof6, listaPersonas));
        System.out.println(agregarPersona(prof7, listaPersonas));
        System.out.println(agregarPersona(prof8, listaPersonas));
        System.out.println(agregarPersona(prof9, listaPersonas));
        System.out.println(agregarPersona(prof10, listaPersonas));
        System.out.println(agregarPersona(prof11, listaPersonas));
        System.out.println(agregarPersona(prof12, listaPersonas));
        System.out.println();
        
        Persona al1 = nuevaPersona("Musa", "Ezequiel", 101, "A1");
        Persona al2 = nuevaPersona("Martinez", "Ricardo Juan", 102, "A9");
        Persona al3 = nuevaPersona("Gimenez", "María José", 103, "A2");
        Persona al4 = nuevaPersona("Flores", "Mauricio José", 104, "A3");
        Persona al5 = nuevaPersona("Campos", "Juan Pablo", 105, "A4");
        Persona al6 = nuevaPersona("Campos", "Augusto", 104, "A6"); //dni repetido con otro alumno
        Persona al7 = nuevaPersona("Rodriguez", "Miguel Angel", 106, "A4"); //cx repetido con otro alumno
        Persona al8 = nuevaPersona("Alvarez", "Ezequiel", 1, "A7"); //dni repetido con un profesor
        Persona al9 = nuevaPersona(null, "Luciana", 107, "A7"); //apellido nulo
        Persona al10 = nuevaPersona("", "Luciana", 107, "A7"); //apellido vacío
        Persona al11 = nuevaPersona("Pérez", null, 107, "A7"); //nombre nulo
        Persona al12 = nuevaPersona("Pérez", "", 107, "A7"); //nombre vacío
        Persona al13 = nuevaPersona("Pérez", "Luciana", 0, "A7"); //dni <= 0
        Persona al14 = nuevaPersona("Pérez", "Luciana", 107, (String)null); //cx nulo
        Persona al15 = nuevaPersona("Pérez", "Luciana", 107, ""); //cx vacío
        
        System.out.println(agregarPersona(al1, listaPersonas));
        System.out.println(agregarPersona(al1, listaPersonas));
        System.out.println(agregarPersona(al2, listaPersonas));
        System.out.println(agregarPersona(al3, listaPersonas));
        System.out.println(agregarPersona(al4, listaPersonas));
        System.out.println(agregarPersona(al5, listaPersonas));
        System.out.println(agregarPersona(al6, listaPersonas));
        System.out.println(agregarPersona(al7, listaPersonas));
        System.out.println(agregarPersona(al8, listaPersonas));
        System.out.println(agregarPersona(al9, listaPersonas));
        System.out.println(agregarPersona(al10, listaPersonas));
        System.out.println(agregarPersona(al11, listaPersonas));
        System.out.println(agregarPersona(al12, listaPersonas));
        System.out.println(agregarPersona(al13, listaPersonas));
        System.out.println(agregarPersona(al14, listaPersonas));
        System.out.println(agregarPersona(al15, listaPersonas));
        System.out.println();
        
        mostrarPersonas(listaPersonas, "Profesor");
        mostrarPersonas(listaPersonas, "Alumno");
        
        
        //***************************TRABAJOS**********************************

        LocalDate fechaPresentacion = LocalDate.of(2019, 10, 1);
        LocalDate fechaAprobacion = LocalDate.of(2019, 10, 10);

        Alumno unAlumno1 = (Alumno)listaPersonas.get(7);
        Alumno unAlumno2 = (Alumno)listaPersonas.get(8);
        ArrayList<AlumnoEnTrabajo> listaAlumnosEnTrabajo = new ArrayList<>();
        listaAlumnosEnTrabajo.add(new AlumnoEnTrabajo(fechaAprobacion, unAlumno1));
        listaAlumnosEnTrabajo.add(new AlumnoEnTrabajo(fechaAprobacion, unAlumno2));

        Profesor unProfesor1 = (Profesor)listaPersonas.get(0);
        Profesor unProfesor2 = (Profesor)listaPersonas.get(1);
        Profesor unProfesor3 = (Profesor)listaPersonas.get(2);
        Profesor unProfesor4 = (Profesor)listaPersonas.get(3);
        Profesor unProfesor5 = (Profesor)listaPersonas.get(4);
        ArrayList<RolEnTrabajo> listaRolesEnTrabajo = new ArrayList<>();
        listaRolesEnTrabajo.add(new RolEnTrabajo(fechaAprobacion, unProfesor1, Rol.TUTOR));
        listaRolesEnTrabajo.add(new RolEnTrabajo(fechaAprobacion, unProfesor2, Rol.COTUTOR));
        listaRolesEnTrabajo.add(new RolEnTrabajo(fechaAprobacion, unProfesor3, Rol.JURADO));
        listaRolesEnTrabajo.add(new RolEnTrabajo(fechaAprobacion, unProfesor4, Rol.JURADO));
        listaRolesEnTrabajo.add(new RolEnTrabajo(fechaAprobacion, unProfesor5, Rol.JURADO));
               
        Trabajo trab1 = nuevoTrabajo("Protocolos de comunicación", listaAreas1, 6, fechaPresentacion, fechaAprobacion, listaAlumnosEnTrabajo, listaRolesEnTrabajo);
        System.out.println(agregarTrabajo(trab1, listaTrabajos));
        System.out.println(agregarTrabajo(trab1, listaTrabajos)); //trabajo repetido
         
        Trabajo trab2 = nuevoTrabajo("", listaAreas1, 6, fechaPresentacion, fechaAprobacion, listaAlumnosEnTrabajo, listaRolesEnTrabajo); //título vacío
        System.out.println(agregarTrabajo(trab2, listaTrabajos));
        
        Trabajo trab3 = nuevoTrabajo(null, listaAreas1, 6, fechaPresentacion, fechaAprobacion, listaAlumnosEnTrabajo, listaRolesEnTrabajo); //sin título
        System.out.println(agregarTrabajo(trab3, listaTrabajos));        
        
        Trabajo trab4 = nuevoTrabajo("Gestión de Trabajos Finales", null, 6, fechaPresentacion, fechaAprobacion, listaAlumnosEnTrabajo, listaRolesEnTrabajo); //sin áreas
        System.out.println(agregarTrabajo(trab4, listaTrabajos));                
        
        Trabajo trab5 = nuevoTrabajo("Gestión de Trabajos Finales", new ArrayList<Area>(), 6, fechaPresentacion, fechaAprobacion, listaAlumnosEnTrabajo, listaRolesEnTrabajo); //sin áreas
        System.out.println(agregarTrabajo(trab5, listaTrabajos));                
        
        Trabajo trab6 = nuevoTrabajo("Gestión de Trabajos Finales", listaAreas1, 0, fechaPresentacion, fechaAprobacion, listaAlumnosEnTrabajo, listaRolesEnTrabajo); //duración <= 0
        System.out.println(agregarTrabajo(trab6, listaTrabajos));                        
        
        Trabajo trab7 = nuevoTrabajo("Gestión de Trabajos Finales", listaAreas1, 6, null, fechaAprobacion, listaAlumnosEnTrabajo, listaRolesEnTrabajo); //sin fecha de presentación
        System.out.println(agregarTrabajo(trab7, listaTrabajos));                        
        
        Trabajo trab8 = nuevoTrabajo("Gestión de Trabajos Finales", listaAreas1, 6, fechaPresentacion, null, listaAlumnosEnTrabajo, listaRolesEnTrabajo); //sin fecha de aprobación
        System.out.println(agregarTrabajo(trab8, listaTrabajos));                                
        
        Trabajo trab9 = nuevoTrabajo("Gestión de Trabajos Finales", listaAreas1, 6, fechaAprobacion, fechaPresentacion, listaAlumnosEnTrabajo, listaRolesEnTrabajo); //fecha de aprobación anterior a la de presentación
        System.out.println(agregarTrabajo(trab9, listaTrabajos));                                        
        
        Trabajo trab10 = nuevoTrabajo("Gestión de Trabajos Finales", listaAreas1, 6, fechaPresentacion, fechaAprobacion, null, listaRolesEnTrabajo); //sin alumnos
        System.out.println(agregarTrabajo(trab10, listaTrabajos));                                                
         
        Trabajo trab11 = nuevoTrabajo("Gestión de Trabajos Finales", listaAreas1, 6, fechaPresentacion, fechaAprobacion, new ArrayList<AlumnoEnTrabajo>(), listaRolesEnTrabajo); //sin alumnos
        System.out.println(agregarTrabajo(trab11, listaTrabajos));                                                        
        
        listaRolesEnTrabajo = new ArrayList<>();
        listaRolesEnTrabajo.add(new RolEnTrabajo(fechaAprobacion, unProfesor2, Rol.COTUTOR));
        listaRolesEnTrabajo.add(new RolEnTrabajo(fechaAprobacion, unProfesor3, Rol.JURADO));
        listaRolesEnTrabajo.add(new RolEnTrabajo(fechaAprobacion, unProfesor4, Rol.JURADO));
        listaRolesEnTrabajo.add(new RolEnTrabajo(fechaAprobacion, unProfesor5, Rol.JURADO));
        
        Trabajo trab12 = nuevoTrabajo("Gestión de Trabajos Finales", listaAreas1, 6, fechaPresentacion, fechaAprobacion, listaAlumnosEnTrabajo, listaRolesEnTrabajo); //sin tutor
        System.out.println(agregarTrabajo(trab12, listaTrabajos));                                                                

        listaRolesEnTrabajo = new ArrayList<>();
        listaRolesEnTrabajo.add(new RolEnTrabajo(fechaAprobacion, unProfesor1, Rol.TUTOR));
        listaRolesEnTrabajo.add(new RolEnTrabajo(fechaAprobacion, unProfesor1, Rol.COTUTOR));
        listaRolesEnTrabajo.add(new RolEnTrabajo(fechaAprobacion, unProfesor3, Rol.JURADO));
        listaRolesEnTrabajo.add(new RolEnTrabajo(fechaAprobacion, unProfesor4, Rol.JURADO));
        listaRolesEnTrabajo.add(new RolEnTrabajo(fechaAprobacion, unProfesor5, Rol.JURADO));        
        
        Trabajo trab13 = nuevoTrabajo("Gestión de Trabajos Finales", listaAreas1, 6, fechaPresentacion, fechaAprobacion, listaAlumnosEnTrabajo, listaRolesEnTrabajo); //tutor y cotutor iguales
        System.out.println(agregarTrabajo(trab13, listaTrabajos));  
        
        listaRolesEnTrabajo = new ArrayList<>();
        listaRolesEnTrabajo.add(new RolEnTrabajo(fechaAprobacion, unProfesor1, Rol.TUTOR));
        listaRolesEnTrabajo.add(new RolEnTrabajo(fechaAprobacion, unProfesor2, Rol.COTUTOR));
        listaRolesEnTrabajo.add(new RolEnTrabajo(fechaAprobacion, unProfesor3, Rol.JURADO));
        listaRolesEnTrabajo.add(new RolEnTrabajo(fechaAprobacion, unProfesor4, Rol.JURADO));

        Trabajo trab14 = nuevoTrabajo("Gestión de Trabajos Finales", listaAreas1, 6, fechaPresentacion, fechaAprobacion, listaAlumnosEnTrabajo, listaRolesEnTrabajo); //jurado con menos de 3 profesores
        System.out.println(agregarTrabajo(trab14, listaTrabajos));     
        
        listaRolesEnTrabajo = new ArrayList<>();
        listaRolesEnTrabajo.add(new RolEnTrabajo(fechaAprobacion, unProfesor1, Rol.TUTOR));
        listaRolesEnTrabajo.add(new RolEnTrabajo(fechaAprobacion, unProfesor2, Rol.COTUTOR));
        listaRolesEnTrabajo.add(new RolEnTrabajo(fechaAprobacion, unProfesor3, Rol.JURADO));
        listaRolesEnTrabajo.add(new RolEnTrabajo(fechaAprobacion, unProfesor4, Rol.JURADO));
        listaRolesEnTrabajo.add(new RolEnTrabajo(fechaAprobacion, unProfesor4, Rol.JURADO));
        
        Trabajo trab15 = nuevoTrabajo("Gestión de Trabajos Finales", listaAreas1, 6, fechaPresentacion, fechaAprobacion, listaAlumnosEnTrabajo, listaRolesEnTrabajo); //jurado con profesores repetidos
        System.out.println(agregarTrabajo(trab15, listaTrabajos));  
        
        listaRolesEnTrabajo = new ArrayList<>();
        listaRolesEnTrabajo.add(new RolEnTrabajo(fechaAprobacion, unProfesor1, Rol.TUTOR));
        listaRolesEnTrabajo.add(new RolEnTrabajo(fechaAprobacion, unProfesor2, Rol.COTUTOR));
        listaRolesEnTrabajo.add(new RolEnTrabajo(fechaAprobacion, unProfesor1, Rol.JURADO));
        listaRolesEnTrabajo.add(new RolEnTrabajo(fechaAprobacion, unProfesor4, Rol.JURADO));
        listaRolesEnTrabajo.add(new RolEnTrabajo(fechaAprobacion, unProfesor5, Rol.JURADO));
        
        Trabajo trab16 = nuevoTrabajo("Gestión de Trabajos Finales", listaAreas1, 6, fechaPresentacion, fechaAprobacion, listaAlumnosEnTrabajo, listaRolesEnTrabajo); //el tutor es jurado
        System.out.println(agregarTrabajo(trab16, listaTrabajos)); 
        
        listaRolesEnTrabajo = new ArrayList<>();
        listaRolesEnTrabajo.add(new RolEnTrabajo(fechaAprobacion, unProfesor1, Rol.TUTOR));
        listaRolesEnTrabajo.add(new RolEnTrabajo(fechaAprobacion, unProfesor2, Rol.COTUTOR));
        listaRolesEnTrabajo.add(new RolEnTrabajo(fechaAprobacion, unProfesor3, Rol.JURADO));
        listaRolesEnTrabajo.add(new RolEnTrabajo(fechaAprobacion, unProfesor2, Rol.JURADO));
        listaRolesEnTrabajo.add(new RolEnTrabajo(fechaAprobacion, unProfesor5, Rol.JURADO));
        
        Trabajo trab17 = nuevoTrabajo("Gestión de Trabajos Finales", listaAreas1, 6, fechaPresentacion, fechaAprobacion, listaAlumnosEnTrabajo, listaRolesEnTrabajo); //el cotutor es jurado
        System.out.println(agregarTrabajo(trab17, listaTrabajos)); 

        listaRolesEnTrabajo = new ArrayList<>();
        listaRolesEnTrabajo.add(new RolEnTrabajo(fechaAprobacion, unProfesor1, Rol.TUTOR));
        listaRolesEnTrabajo.add(new RolEnTrabajo(fechaAprobacion, unProfesor3, Rol.JURADO));
        listaRolesEnTrabajo.add(new RolEnTrabajo(fechaAprobacion, unProfesor2, Rol.JURADO));
        listaRolesEnTrabajo.add(new RolEnTrabajo(fechaAprobacion, unProfesor5, Rol.JURADO));  
        
        Trabajo trab18 = nuevoTrabajo("Gestión de Trabajos Finales", listaAreas1, 6, fechaPresentacion, fechaAprobacion, listaAlumnosEnTrabajo, listaRolesEnTrabajo); //el cotutor es jurado
        System.out.println(agregarTrabajo(trab18, listaTrabajos));         

        mostrarTrabajos(listaTrabajos);                
    } 
    
    
    /**
     * Crea un área nueva siempre y cuando el nombre no sea nulo ni vacío
     * @param nombre nombre del área
     * @return Area  - área nueva (si se pudo crear) o null si no se pudo crear
     */
    private static Area nuevaArea(String nombre){
        if ((nombre != null) && (!nombre.isEmpty()))
            return new Area(nombre);
        else
            return null;
    }
    
    /**
     * Agrega el área especificada al ArrayList de áreas siempre y cuando la misma no sea nula y no esté ya en el ArrayList
     * @param unArea área a agregar
     * @param listaAreas ArrayList de áreas
     * @return String  - cadena que informa si se pudo o no agregar el área
     */
    private static String agregarArea(Area unArea, ArrayList<Area> listaAreas) {
        if ((unArea != null) && (!listaAreas.contains(unArea))) {
            listaAreas.add(unArea);
            return "Se agregó el área";
        } 
        else
            return "No se agregó el área";                
    }
    
    /**
     * Muestra todas las áreas guardadas en el ArrayList
     * @param listaAreas ArrayList de áreas
     */
    private static void mostrarAreas(ArrayList<Area> listaAreas) {
        System.out.println("\n***Lista de Areas *** \n ");
        for (Area a :listaAreas)
            System.out.println(a);
        System.out.println();
    }
    
    /**
     * Crea un profesor nuevo siempre y cuando:
     *  los apellidos no sean nulos ni vacíos
     *  los nombres no sean nulos ni vacíos
     *  el dni no sea menor o igual a cero
     *  el cargo no sea nulo
     * @param apellidos apellidos del profesor
     * @param nombres nombres del profesor
     * @param dni dni del profesor
     * @param cargo cargo del profesor
     * @return Profesor  - profesor nuevo (si se pudo crear) o null si no se pudo crear
     */
    private static Profesor nuevaPersona(String apellidos, String nombres, int dni, Cargo cargo) {
        if((apellidos != null) && (!apellidos.isEmpty()) && (nombres != null) && (!nombres.isEmpty()) && (dni > 0) && (cargo != null)){
            return new Profesor(apellidos, nombres, dni, cargo);
        }
        return null;
    }
    
    /**
     * Crea un alumno nuevo siempre y cuando:
     *  los apellidos no sean nulos ni vacíos
     *  los nombres no sean nulos ni vacíos
     *  el dni no sea menor o igual a cero
     *  el cx no sea nulo
     * @param apellidos apellidos del alumno
     * @param nombres nombres del alumno
     * @param dni dni del alumno
     * @param cx cx del alumno
     * @return Alumno  - alumno nuevo (si se pudo crear) o null si no se pudo crear
     */    
    private static Alumno nuevaPersona(String apellidos, String nombres, int dni, String cx) {
        if((apellidos != null) && (!apellidos.isEmpty()) && (nombres != null) && (!nombres.isEmpty()) && (dni > 0) && (cx != null) && (!cx.isEmpty())){
            return new Alumno(apellidos, nombres, dni, cx);
        }
        return null;
    }    
    
    /**
     * Agrega la persona especificada al ArrayList de personas siempre y cuando la misma no sea nula y no esté ya en el ArrayList
     * @param unaPersona persona a agregar
     * @param listaPersonas ArrayList de personas
     * @return String  - cadena que informa si se pudo o no agregar la persona
     */    
    private static String agregarPersona(Persona unaPersona, ArrayList<Persona> listaPersonas) {
        if((unaPersona != null) && (!listaPersonas.contains(unaPersona))){
            listaPersonas.add(unaPersona);
            return "Se agregó la Persona.";
        }
        return "No se agregó la Persona.";
    }
    
    /**
     * Muestra todos los profesores o alumnos guardados en el ArrayList
     * @param listaPersonas ArrayList de personas
     * @param tipoPersona tipo de persona a mostrar: Profesor o Alumno
     */
    private static void mostrarPersonas(ArrayList<Persona> listaPersonas, String tipoPersona) {
        System.out.println("-------- " + tipoPersona + "---------");
        for( Persona p : listaPersonas){
            if(tipoPersona.equalsIgnoreCase(p.getClass().getSimpleName())){
                p.mostrar();
            }
        }
    }
    
    /**
     * Crea un trabajo nuevo siempre y cuando:
     *  el título no sea nulo ni vacío
     *  tenga al menos un área
     *  la duración sea mayor a 0 meses
     *  la fecha de presentación no sea nula
     *  la fecha de aprobación no sea nula
     *  la fecha de aprobación sea posterior a la de presentación
     *  tenga al menos un alumno
     *  tenga un tutor
     *  si tiene cotutor, debe ser distinto al tutor
     *  tenga 3 jurados distintos
     *  el tutor no debe formar parte del jurado
     *  si tiene cotutor, no debe formar parte del jurado
     * @param titulo título del trabajo
     * @param areas áreas del trabajo
     * @param duracion duración del trabajo
     * @param fechaPresentacion fecha de presentación ante la CA
     * @param fechaAprobacion fecha de aprobación por parte de la CA
     * @param aet alumnos que participan en el trabajo
     * @param ret profesores con sus respectivos roles que participan en el trabajo
     * @return Trabajo  - trabajo nuevo (si se pudo crear) o null si no se pudo crear
     */
    private static Trabajo nuevoTrabajo(String titulo, ArrayList<Area> listaAreas, int duracion, LocalDate fechaPresentacion, LocalDate fechaAprobacion, ArrayList<AlumnoEnTrabajo> aet, ArrayList<RolEnTrabajo> ret) { 
        if((titulo == null) || (titulo.isEmpty())){
            return null;
        }
        if(listaAreas == null){
            return null;
        }
        else{
            if(listaAreas.isEmpty()){
                return null;
            }
        }
        if((duracion < 0) || (duracion == 0)){
            return null;
        }
        if(fechaPresentacion == null){
            return null;
        }
        if(fechaAprobacion == null){
            return null;
        }
        if(fechaAprobacion.isBefore(fechaPresentacion)){
            return null;
        }
        if(aet == null){
            return null;
        }
        else{
            if(aet.isEmpty()){
                return null;
            }
        }
        int i = 0;
        for(RolEnTrabajo r : ret){            
            if(r.getRol() == Rol.TUTOR){
                i++;
             
            }
        }
        if(i == 0){
            return null;
        }
//        
        i = 0;
        
        for(RolEnTrabajo r : ret){
            if(r.getRol() == Rol.COTUTOR){
                for(RolEnTrabajo e : ret){
                    if(e.getRol() == Rol.TUTOR){
                        if(e.equals(r)){
                            return null;
                        }
                    }
                }
            }
        }
//        
        ArrayList<Profesor> jurados = new ArrayList<>();
        for(RolEnTrabajo r : ret){
            if(r.getRol() == Rol.JURADO){
                  jurados.add(r.getProfesor());
            }
        }
        if(!validarJurado(jurados)){
            return null;
        }
        
        
        for(RolEnTrabajo r : ret){
            if(r.getRol() == Rol.TUTOR){
                if(elProfesorEsJurado(r.getProfesor(), jurados)){
                    return null;
                }
            }
        }
        
        for(RolEnTrabajo r : ret){
            if(r.getRol() == Rol.COTUTOR){
                if(elProfesorEsJurado(r.getProfesor(), jurados)){
                    return null;
                }
            }
        }
//      // Cuando agregan el trabajo 18, dicen que agregan un cotutor que es jurado, pero no estan agreganfo
        // Ningun cotutor al arraylist de profesores en el trabajo. 
        return new Trabajo(titulo, listaAreas, duracion, fechaPresentacion, fechaAprobacion, aet, ret);
    }
    
    /**
     * Devuelve el profesor tutor 
     * Si no hay profesores, o ninguno es tutor, devuelve null
     * @param listaRolEnTrabajo lista con los profesores que actúan como tutor, cotutor (si hubiera) y jurado
     * @return Profesor  - profesor tutor, o null
     */
    private static Profesor obtenerTutor(ArrayList<RolEnTrabajo> listaRolEnTrabajo) {        
        for(RolEnTrabajo r : listaRolEnTrabajo){
            if(r.getRol() == Rol.TUTOR){
                return r.getProfesor();
            }
        }
        return null;
    }
    
    /**
     * Devuelve el profesor cotutor 
     * Si no hay profesores, o ninguno es cotutor, devuelve null
     * @param listaRolEnTrabajo lista con los profesores que actúan como tutor, cotutor (si hubiera) y jurado
     * @return Profesor  - profesor cotutor, o null
     */
    private static Profesor obtenerCotutor(ArrayList<RolEnTrabajo> listaRolEnTrabajo) {        
        for(RolEnTrabajo r : listaRolEnTrabajo){
            if(r.getRol() == Rol.COTUTOR){
                return r.getProfesor();
            }
        }
        return null;
    }

    /**
     * Devuelve la lista con el jurado del trabajo
     * @param listaRolEnTrabajo lista con los profesores que actúan como tutor, cotutor (si hubiera) y jurado
     * @return ArrayList<Profesor>  - lista con el jurado del trabajo
     */
    private static ArrayList<Profesor> obtenerJurado(ArrayList<RolEnTrabajo> listaRolEnTrabajo) {
        ArrayList<Profesor> jurado = new ArrayList<>();
        
        for(RolEnTrabajo r : listaRolEnTrabajo){
            if(r.getRol() == Rol.JURADO){
                jurado.add(r.getProfesor());
            }
        }
        
        return jurado;
    }        
    
    /**
     * Valida que en caso de haber cotutor, el mismo sea distinto del tutor
     * @param profesores lista con los profesores que actúan como tutor, cotutor (si hubiera) y jurado
     * @return boolean  - si hay un cotutor y es distinto al tutor, devuelve true, o false en caso contrario. Si no hay cotutor, devuelve true
     */
    private static boolean validarTutorYCotutor(Profesor tutor, Profesor cotutor) {
        if(cotutor == null){
            return true;
        }
        if(!tutor.equals(cotutor)){
            return true;
        }
        return false;
    }    
    
    /**
     * Determina si el jurado está compuesto por 3 profesores distintos
     * @param jurado jurado del trabajo
     * @return boolean  - true si el jurado está integrado por 3 profesores distintos, false en caso contrario
     */
    private static boolean validarJurado(ArrayList<Profesor> jurado) {
        ArrayList<Profesor> jur = new ArrayList<>();
        
        for(Profesor p : jurado){
            if(!jur.contains(p)){
                jur.add(p);
            }
        }
        
        if(jur.size() == 3){
            return true;
        }
        
        return false;
    }    
    
    /**
     * Determina si el profesor especificado forma parte del jurado
     * @param unProfesor profesor del trabajo
     * @param jurado jurado del trabajo
     * @return boolean  - true si el profesor forma parte del jurado, false en caso contrario
     */
    private static boolean elProfesorEsJurado(Profesor unProfesor, ArrayList<Profesor> jurado) {
        if(jurado.contains(unProfesor)){
            return true;
        }
        return false;
    }    
    
    /**
     * Agrega el trabajo especificado al ArrayList de trabajos siempre y cuando el mismo no sea nulo y no esté ya en el ArrayList
     * @param unTrabajo trabajo a agregar
     * @param listaTrabajos ArrayList de trabajos
     * @return String  - cadena que informa si se pudo o no agregar el trabajo
     */    
    private static String agregarTrabajo(Trabajo unTrabajo, ArrayList<Trabajo> listaTrabajos) {
        if((unTrabajo != null) && (!listaTrabajos.contains(unTrabajo))){
            listaTrabajos.add(unTrabajo);
            return "Se añadió el Trabajo.";
        }
        return "No se añadió el Trabajo.";
    }

    /**
     * Muestra todos los trabajos guardados en el ArrayList
     * @param listaTrabajos ArrayList de trabajos
     */
    private static void mostrarTrabajos(ArrayList<Trabajo> listaTrabajos) {
        for(Trabajo t : listaTrabajos){
            System.out.println();
            t.mostrar();
            System.out.println("");
        }
    }    
}
