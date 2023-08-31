package cl.awekelab.miprimerspring0057.service.serviceimpl;
import cl.awekelab.miprimerspring0057.entity.Alumno;
import cl.awekelab.miprimerspring0057.repository.IAlumnoRepository;
import cl.awekelab.miprimerspring0057.service.IAlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("alumnoServiceImpl")
public class AlumnoServiceImpl implements IAlumnoService {
    @Autowired
    IAlumnoRepository objAlumnoRepo;

    @Override
    public Alumno crearAlumno(Alumno crearAlumno) {
        Alumno nuevoAlumno = new Alumno();
        nuevoAlumno = objAlumnoRepo.save(crearAlumno);
        return nuevoAlumno;
    }

    @Override
    public Alumno actualizarAlumno(int id, Alumno alumnoActualizar) {
        Alumno alumnoEncontrado = objAlumnoRepo.findById(id).orElse(null);
        alumnoEncontrado.setNombres(alumnoActualizar.getNombres());
        alumnoEncontrado.setApellido1(alumnoActualizar.getApellido1());
        alumnoEncontrado.setApellido2(alumnoActualizar.getApellido2());
        alumnoEncontrado.setCursoAsignado(alumnoActualizar.getCursoAsignado());
        return objAlumnoRepo.save(alumnoEncontrado);
    }

    @Override
    public List<Alumno> listarAlumnos() {
        return objAlumnoRepo.findAll();
    }

    @Override
    public Alumno listarAlumnosID(int idAlumno) {
        return objAlumnoRepo.findById(idAlumno).orElse(null);
    }

    @Override
    public void eliminarAlumno(int id) {
        objAlumnoRepo.deleteById(id);
    }

    @Override
    public void eliminarAlumno2(Alumno alumno) {
        objAlumnoRepo.delete(alumno);

    }

}
