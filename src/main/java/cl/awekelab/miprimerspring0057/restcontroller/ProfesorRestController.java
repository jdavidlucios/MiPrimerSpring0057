package cl.awekelab.miprimerspring0057.restcontroller;

import cl.awekelab.miprimerspring0057.entity.Profesor;
import cl.awekelab.miprimerspring0057.service.IProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/profesor")
public class ProfesorRestController {

    @Autowired
    IProfesorService objProfesorService;

    @GetMapping("/{id}")
    public Profesor listarProfesorId(@PathVariable int id) {

        return objProfesorService.listarProfesorID(id);
    }

    @PostMapping
    public Profesor crearProfesor(@RequestBody Profesor profesor){

        return objProfesorService.crearProfesor(profesor);

    }
    @GetMapping
    public List<Profesor> listarProfesor(){

        return objProfesorService.listarProfesor();
    }

    @PutMapping("/{id}")
    public Profesor actualizarProfesor(@PathVariable int id, @RequestBody Profesor profesor){

        return objProfesorService.actualizarProfesor(id, profesor);

    }

    @DeleteMapping("/{id}")
    public void eliminarProfesor(@PathVariable int id, Profesor profesor){
        objProfesorService.eliminarProfesor(profesor);
    }
}
