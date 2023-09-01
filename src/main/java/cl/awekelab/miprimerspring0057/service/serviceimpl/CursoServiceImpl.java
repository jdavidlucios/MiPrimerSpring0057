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
    public Curso crearCurso(Curso crearCurso) {

        Curso nuevoCurso = new Curso();
        nuevoCurso = objCursoRepo.save(crearCurso);
        return objCursoRepo.save(crearCurso);
    }

    @Override
    public Curso actualizarCurso(int id, Curso cursoActualizar) {

        Curso cursoEncontrado = objCursoRepo.findById(id).orElse(null);
        cursoEncontrado.setNombreCurso(cursoActualizar.getNombreCurso());
        return objCursoRepo.save(cursoEncontrado);

    }

    @Override
    public List<Curso> listarCurso() {

        return objCursoRepo.findAll();
    }

    @Override
    public Curso listarCursoID(int idCurso) {

        return objCursoRepo.findById(idCurso).orElse(null);
    }

    @Override
    public void eliminarCurso(Curso curso) {

        objCursoRepo.delete(curso);
    }
}
