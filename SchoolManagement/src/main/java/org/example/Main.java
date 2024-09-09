package org.example;

public class Main {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante(1, "Elmer", "Santos", "02/12/2024", "matriculado");
        Estudiante estudiante2 = new Estudiante(2, "Rodrigo", "García", "03/09/2024", "matriculado");

        Curso curso1 = new Curso(1, "Matemática", "Curso basico", 4, "1.0");

        GestorAcademico gestorAcademico = new GestorAcademico();

        gestorAcademico.matricularEstudiante(estudiante2);
        gestorAcademico.agregarCurso(curso1);

        try{
            gestorAcademico.inscribirEstudianteCurso(estudiante1, curso1.getId());
        }catch (ServiciosAcademicosI.EstudianteYaInscritoException e){
            System.out.println(e.getMessage());
        }

        gestorAcademico.matricularEstudiante(estudiante1);

        try{
            gestorAcademico.desinscribirEstudianteCurso(1, 1);
        }catch(ServiciosAcademicosI.EstudianteNoInscritoEnCursoException e){
            System.out.println(e.getMessage());
        }
    }
}