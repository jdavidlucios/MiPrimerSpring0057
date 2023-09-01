package cl.awekelab.miprimerspring0057.service;
import cl.awekelab.miprimerspring0057.entity.Curso;
import java.util.List;

public interface ICursoService {
    public Curso crearCurso(Curso nuevoCurso);
    Curso actualizarCurso(int id, Curso cursoActualizar);
    public List<Curso> listarCurso();
    public Curso listarCursoID(int idCurso);
    void eliminarCurso(Curso curso);
}
