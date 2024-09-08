package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class GestorAcademico implements ServiciosAcademicosI{

    private ArrayList<Estudiante> listEstudiantes = new ArrayList<>();
    private ArrayList<Curso> listCursos = new ArrayList<>();
    private HashMap<Integer, ArrayList<Estudiante>> estudiantesPorCurso = new HashMap<>();

    @Override
    public void matricularEstudiante(Estudiante estudiante) {

    }

    @Override
    public void agregarCurso(Curso curso) {

    }

    @Override
    public void inscribirEstudianteCurso(Estudiante estudiante, int idCurso) throws EstudianteYaIncritoException {

    }

    @Override
    public void desinscribirEstudianteCurso(int idEstudiante, int idCurso) throws EstudianteNoIncritoException {

    }
}
