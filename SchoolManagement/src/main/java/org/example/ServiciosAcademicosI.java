package org.example;

public interface ServiciosAcademicosI {

    class EstudianteYaIncritoException extends Exception {
        public EstudianteYaIncritoException(String mensaje) {
            super(mensaje);
        }
    }

    class EstudianteNoIncritoException extends Exception {
        public EstudianteNoIncritoException(String mensaje) {
            super(mensaje);
        }
    }

    void matricularEstudiante(Estudiante estudiante);
    void agregarCurso(Curso curso);
    void inscribirEstudianteCurso(Estudiante estudiante, int idCurso) throws EstudianteYaIncritoException;
    void desinscribirEstudianteCurso(int idEstudiante, int idCurso) throws EstudianteNoIncritoException;

}
