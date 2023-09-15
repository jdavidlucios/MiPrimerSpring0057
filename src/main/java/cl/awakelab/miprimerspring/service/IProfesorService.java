package cl.awakelab.miprimerspring.service;
import cl.awakelab.miprimerspring.entity.Profesor;
import java.util.List;

public interface IProfesorService {

        public Profesor crearProfesor(Profesor profesorCreador);


        Profesor actualizarProfesor(int id, Profesor profesorActualizado);

        public List<Profesor> listarProfesor();

    Profesor asignarCursoAProfesor(int id, int cursoId);

    public void eliminarProfesor(int id);
        public Profesor listaProfesorId(int idProfesor);
    }
