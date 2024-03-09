
package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;


public class Controladora {
    
    ControladoraPersistencia control;// = new ControladoraPersistencia();

    public Controladora() {
        control = new ControladoraPersistencia();
    }
    
    

    public String validarUsuario(String usuario, String contrasenia) {

        List<Usuario>listaUsu = control.traerUsuario(); 
        
        String mensaje="";
        for(Usuario usu: listaUsu){
            if(usu.getNombreUsuario().equals(usuario)){
                if(usu.getContraseña().equals(contrasenia)){
                    return mensaje="Usuario y contraseña correctOS";
                    
                }else{
                   return mensaje="contraseña incorrecta";
                } 
            }else{
                mensaje= "usuario incorrecto";
            }
                
        }
        return mensaje;
    }
    
    
}
