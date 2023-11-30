

import model.Credenciales;
import org.springframework.beans.factory.annotation.Autowired;
package Service;
@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public boolean autenticar(Credenciales credenciales) {
        // Implementar la lógica de autenticación
        return true; // Cambiar según la implementación
    }

    public boolean estaAutenticado(Long usuarioId) {
        // Implementar la verificación de autenticación
        return true; // Cambiar según la implementación
    }
}