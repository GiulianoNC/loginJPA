
package persistencia;

import java.util.List;
import logica.Usuario;


public class ControladoraPersistencia {
    
    UsuarioJpaController usuarioJPA = new UsuarioJpaController();

    public List<Usuario> traerUsuario() {
       return usuarioJPA.findUsuarioEntities();
       //SELEC * FROM usuarios
       
    }
    
    
    
}
