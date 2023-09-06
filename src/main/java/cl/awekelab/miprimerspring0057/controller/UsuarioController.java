package cl.awekelab.miprimerspring0057.controller;

import cl.awekelab.miprimerspring0057.entity.Usuario;
import cl.awekelab.miprimerspring0057.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    IUsuarioService objUsuarioService;

    public String listarUsuarios(Model model){
        List<Usuario> listaUsuarios = objUsuarioService.listarUsuario();
        model.addAttribute("atributoListaUsuarios", listaUsuarios);
        return "templateListarUsuarios";
    }
    @GetMapping("/crearusuario") //Llama al formulario
    public String mostrarFormularioCrearUsuario(){
        return "templateFormularioCrearUsuario";
    }

    @PostMapping("/crearusuario")
    public String mostrarFormularioCrearUsuario(@ModelAttribute Usuario usuario){
        objUsuarioService.crearUsuario(usuario);
        return "redirect:/usuario"; //Redirije a "Listar Usuarios"
    }
}
