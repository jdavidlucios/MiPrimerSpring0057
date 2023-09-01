package cl.awekelab.miprimerspring0057.restcontroller;

import cl.awekelab.miprimerspring0057.entity.Alumno;
import cl.awekelab.miprimerspring0057.service.IAlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alumno")
public class AlumnoRestController {

    @Autowired
    IAlumnoService objAlumnoService;

    @GetMapping("/{id}")
    public Alumno listarAlumnoId(@PathVariable int id) {
        return objAlumnoService.listarAlumnosID(id);
    }

    @PostMapping
    public Alumno crearUsuario(@RequestBody Alumno alumno){
        return objAlumnoService.crearAlumno(alumno);

    }
    @GetMapping
    public List<Alumno> listarUsuarios(){
        return objAlumnoService.listarAlumnos();
    }
}
