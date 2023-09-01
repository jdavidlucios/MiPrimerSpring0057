package cl.awekelab.miprimerspring0057.service.serviceimpl;

import cl.awekelab.miprimerspring0057.entity.Usuario;
import cl.awekelab.miprimerspring0057.repository.IUsuarioRepository;
import cl.awekelab.miprimerspring0057.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("usuarioServiceImpl")
public class UsuarioServiceImpl implements IUsuarioService {

    @Autowired
    IUsuarioRepository objUsuarioRepo;
    @Override
    public Usuario crearUsuario(Usuario crearUsuario) {
        Usuario nuevoUsuario;
        nuevoUsuario = objUsuarioRepo.save(crearUsuario);
        return nuevoUsuario;
    }

    @Override
    public Usuario actualizarUsuario(int id, Usuario usuarioActualizar) {
        Usuario usuarioEncontrado = objUsuarioRepo.findById(id).orElse(null);
        usuarioEncontrado.setNombreUsuario(usuarioActualizar.getNombreUsuario());
        usuarioEncontrado.setContrasena(usuarioActualizar.getContrasena());
        usuarioEncontrado.setRol(usuarioActualizar.getRol());

        return objUsuarioRepo.save(usuarioEncontrado);
    }

    @Override
    public List<Usuario> listarUsuario() {
        return objUsuarioRepo.findAll();
    }

    @Override
    public Usuario listarUsuarioId(int id) {
        return objUsuarioRepo.findById(id).orElse(null);
    }

    @Override
    public void eliminarUsuario(int id) {
        objUsuarioRepo.deleteById(id);

    }
}
