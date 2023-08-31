package cl.awekelab.miprimerspring0057.service.serviceimpl;
import cl.awekelab.miprimerspring0057.entity.Curso;
import cl.awekelab.miprimerspring0057.repository.ICursoRepository;
import cl.awekelab.miprimerspring0057.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("cursoServiceImpl")
public class CursoServiceImpl implements ICursoService {

    @Autowired
    ICursoRepository objCursoRepo;
    @Override
    public Curso crearCurso(Curso nuevoCurso) {
        return objCursoRepo.save(nuevoCurso);
    }

    @Override
    public Curso actualizarCurso(int id) {
        return null;
    }

    @Override
    public List<Curso> listarCurso() {
        return objCursoRepo.findAll();
    }

    @Override
    public Curso listarCursoID(int idCurso) {
        return null;
    }

    @Override
    public void eliminarCurso(int id) {

    }
}
