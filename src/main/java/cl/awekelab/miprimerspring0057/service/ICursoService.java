package cl.awekelab.miprimerspring0057.service;
import cl.awekelab.miprimerspring0057.entity.Curso;
import java.util.List;

public interface ICursoService {
    public Curso crearCurso(Curso nuevoCurso);
    public Curso actualizarCurso(int id);
    public List<Curso> listarCurso();
    public Curso listarCursoID(int idCurso);
    public void eliminarCurso(int id);
}
