package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class GestorAcademico implements ServiciosAcademicosI{

    private ArrayList<Estudiante> listEstudiantes = new ArrayList<>();
    private ArrayList<Curso> listCursos = new ArrayList<>();
    private HashMap<Integer, ArrayList<Estudiante>> estudiantesPorCurso = new HashMap<>();

    @Override
    public void matricularEstudiante(Estudiante estudiante) {
        if(!listEstudiantes.contains(estudiante)){
            listEstudiantes.add(estudiante);
            System.out.println("Estudiante matriculado correctamente");
        }else {
            System.out.println("El estudiante ya esta matriculado.");
        }
    }

    @Override
    public void agregarCurso(Curso curso) {
        if(!listCursos.contains(curso)){
            listCursos.add(curso);
            System.out.println("Curso añadido correctamente");
        }else {
            System.out.println("Este curso ya esta en la lista.");
        }
    }

    @Override
    public void inscribirEstudianteCurso(Estudiante estudiante, int idCurso) throws EstudianteYaInscritoException {

        ArrayList<Estudiante> estudiantes = estudiantesPorCurso.get(idCurso);

        if(estudiantes == null){
            estudiantes = new ArrayList<>();
            estudiantesPorCurso.put(idCurso, estudiantes);
        }

        if(!estudiantes.contains(estudiante)){
            estudiantes.add(estudiante);
            System.out.println("Estudiante agregado al curso correctamente");
        }else {
            throw new EstudianteYaInscritoException("El estudiante ya esta incrito en este curso.");
        }
    }

    @Override
    public void desinscribirEstudianteCurso(int idEstudiante, int idCurso) throws EstudianteNoInscritoEnCursoException {

        ArrayList<Estudiante> estudiantes = estudiantesPorCurso.get(idCurso);
        boolean estudianteEncontrado = false;

        if(estudiantes == null || estudiantes.isEmpty()){
            throw new EstudianteNoInscritoEnCursoException("No hay estudiantes en el curso.");
        }

        for(Estudiante estudiante : estudiantes){
            if(estudiante.getId() == idEstudiante){
                estudiantes.remove(estudiante);
                System.out.println("Estudiante desinscrito del curso correctamente.");
                estudianteEncontrado = true;
                break;
            }
        }

        if(!estudianteEncontrado){
            throw new EstudianteNoInscritoEnCursoException("El estudiante no esta incrito en este curso.");
        }
    }
}
