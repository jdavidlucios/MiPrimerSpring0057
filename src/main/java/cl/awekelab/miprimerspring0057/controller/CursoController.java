package cl.awekelab.miprimerspring0057.controller;

import cl.awekelab.miprimerspring0057.entity.Curso;
import cl.awekelab.miprimerspring0057.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/curso")
public class CursoController {

    @Autowired
    ICursoService objCursoService;

    @GetMapping
    public String listarCursos(Model model){
        List<Curso> listaCursos = objCursoService.listarCurso();
        model.addAttribute("atributoListaCursos", listaCursos);
        return "templateListarCursos";
    }
    @GetMapping("/crearcurso") //Llama al formulario
    public String mostrarFormularioCrearCurso(){
        return "templateFormularioCrearCurso";
    }

    @PostMapping("/crearcurso")
    public String mostrarFormularioCrearCurso(@ModelAttribute Curso curso){
        objCursoService.crearCurso(curso);
        return "redirect:/curso"; //Redirije a "Listar Cursos"
    }

    @PostMapping("/eliminar/{id}")
    public String eliminarCurso(@RequestBody Curso curso){
        objCursoService.eliminarCurso(curso);
        return "redirect:/curso";
    }
}
