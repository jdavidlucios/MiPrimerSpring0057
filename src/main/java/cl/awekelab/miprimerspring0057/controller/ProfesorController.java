package cl.awekelab.miprimerspring0057.controller;

import cl.awekelab.miprimerspring0057.entity.Profesor;
import cl.awekelab.miprimerspring0057.service.IProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/profesor")
public class ProfesorController {

    @Autowired
    IProfesorService objProfesorService;

    @GetMapping
    public String listarProfesor(Model model){
        List<Profesor> listaProfesores = objProfesorService.listarProfesor();
        model.addAttribute("atributoListaProfesor", listaProfesores);
        return "templateListarProfesores";
    }
    @GetMapping("/crearprofesor") //Llama al formulario
    public String mostrarFormularioCrearProfesor(){
        return "templateFormularioCrearProfesor";
    }

    @PostMapping("/crearprofesor")
    public String mostrarFormularioCrearProfesor(@ModelAttribute Profesor profesor){
        objProfesorService.crearProfesor(profesor);
        return "redirect:/profesor"; //Redirije a "Listar Profesor"
    }

    @PostMapping("/eliminar/{id}")
    public String eliminarProfesor(@RequestBody Profesor profesor){
        objProfesorService.eliminarProfesor(profesor);
        return "redirect:/alumno";
    }
}
