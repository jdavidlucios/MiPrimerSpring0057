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
    public Usuario crearUsuario(Usuario nuevoUsuario) {
        return objUsuarioRepo.save(nuevoUsuario);
    }

    @Override
    public Usuario actualizarUsuario(int id) {
        return null;
    }

    @Override
    public List<Usuario> listarUsuario() {
        return objUsuarioRepo.findAll();
    }

    @Override
    public Usuario listarUsuarioID(int idUsuario) {
        return null;
    }

    @Override
    public void eliminarUsuario(int id) {

    }
}
