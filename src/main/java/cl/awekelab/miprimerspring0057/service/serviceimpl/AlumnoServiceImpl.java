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
    public Alumno actualizarAlumno(Alumno alumno) {
        try {
            if (objAlumnoRepo.existsById(alumno.getId())) {
                alumno.setId(alumno.getId());
                objAlumnoRepo.save(alumno);
            }
            else {
                throw new RuntimeException("UPS!!!! " + alumno.getId() + " no existe");
            }

        }
        catch (Exception e) {
            return alumno;
        }

    @Override
    public List<Alumno> listarAlumnos() {
        return objAlumnoRepo.findAll();
    }

    @Override
    public Alumno listarAlumnosID(int idAlumno) {
        return null;
    }

    @Override
    public void eliminarAlumno(Alumno alumno) {
            try {
                if (objAlumnoRepo.existsById(alumno.getId())){
                    objAlumnoRepo.deleteById(alumno.getId());
                }
                else {
                    throw new RuntimeException("UPS!!!! " + alumno.getId() + " no existe");
                }

            }
            catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Alumno borrado");
                return alumno;
        }

    }
    @Override
    public Alumno listaAlumnoId(int idAlumno);
    return objAlumnoRepo.findById(idAlumno).orElse(null);

}
