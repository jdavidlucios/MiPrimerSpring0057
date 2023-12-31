package cl.awekelab.miprimerspring0057.restcontroller;
import cl.awekelab.miprimerspring0057.entity.Usuario;
import cl.awekelab.miprimerspring0057.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioRestController {

    @Autowired
    IUsuarioService objUsuarioService;

    @GetMapping("/{id}")
    public Usuario listarUsuarioId(@PathVariable int id) {
        return objUsuarioService.listarUsuarioId(id);
    }

    @PostMapping
    public Usuario crearUsuario(@RequestBody Usuario usuario){
    return objUsuarioService.crearUsuario(usuario);

    }
    @GetMapping
    public List<Usuario> listarUsuarios(){
        return objUsuarioService.listarUsuario();
    }
}