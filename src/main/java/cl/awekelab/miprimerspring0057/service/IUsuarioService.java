package cl.awekelab.miprimerspring0057.service;
import cl.awekelab.miprimerspring0057.entity.Usuario;
import java.util.List;

public interface IUsuarioService {
    public Usuario crearUsuario(Usuario nuevoUsuario);
    public Usuario actualizarUsuario(int id);
    public List<Usuario> listarUsuario();
    public Usuario listarUsuarioID(int idUsuario);
    public void eliminarUsuario(int id);
}
