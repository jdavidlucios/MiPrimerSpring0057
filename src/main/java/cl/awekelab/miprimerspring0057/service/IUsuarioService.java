package cl.awekelab.miprimerspring0057.service;
import cl.awekelab.miprimerspring0057.entity.Usuario;
import java.util.List;

public interface IUsuarioService {
    public Usuario crearUsuario(Usuario nuevoUsuario);
    public Usuario actualizarUsuario(int id, Usuario usuarioActualizar);
    public List<Usuario> listarUsuario();
    Usuario listarUsuarioId(int id);
    public void eliminarUsuario(int id);


}
