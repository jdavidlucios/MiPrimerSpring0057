package cl.awekelab.miprimerspring0057.restcontroller;

import cl.awekelab.miprimerspring0057.entity.Curso;
import cl.awekelab.miprimerspring0057.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/curso")
public class CursoRestController {

    @Autowired
    ICursoService objCursoService;

    @GetMapping("/{id}")
    public Curso listarCursoId(@PathVariable int id) {
        return objCursoService.listarCursoID(id);
    }

    @PostMapping
    public Curso crearCurso(@RequestBody Curso curso){
        return objCursoService.crearCurso(curso);

    }
    @GetMapping
    public List<Curso> listarCurso(){
        return objCursoService.listarCurso();
    }
}
