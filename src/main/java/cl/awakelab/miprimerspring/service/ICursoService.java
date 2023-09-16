package cl.awakelab.miprimerspring.service;
import cl.awakelab.miprimerspring.entity.Curso;
import cl.awakelab.miprimerspring.entity.Profesor;

import java.util.List;

public interface ICursoService {
    public Curso crearCurso(Curso cursoCreador);


    Curso actualizarCurso(int id, Curso cursoActualizado);

    public List<Curso> listarCurso();

    String obtenerNombreCursoPorId(int cursoId);

    Curso asignarProfesorACurso(Curso cursoRecibido, Profesor profesorRecibido);

    public void eliminarCurso(int id);
    public Curso listaCursoId(int idCurso);
}
