package cl.awekelab.miprimerspring0057.service;
import cl.awekelab.miprimerspring0057.entity.Alumno;
import java.util.List;

public interface IAlumnoService {
    public Alumno crearAlumno(Alumno nuevoAlumno);
    public Alumno actualizarAlumno(int id, Alumno alumnoActualizar);
    public List<Alumno> listarAlumnos();
    public Alumno listarAlumnosID(int idAlumno);
    public void eliminarAlumno(int id);
    public void eliminarAlumno2(Alumno alumno);
}
