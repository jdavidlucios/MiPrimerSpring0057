package cl.awekelab.miprimerspring0057.service;
import cl.awekelab.miprimerspring0057.entity.Alumno;
import java.util.List;

public interface IAlumnoService {
    public Alumno crearAlumno(Alumno nuevoAlumno);
    public Alumno actualizarAlumno(Alumno alumno);
    public List<Alumno> listarAlumnos();
    public Alumno listarAlumnosID(int idAlumno);
    public void eliminarAlumno(Alumno alumno);
}
