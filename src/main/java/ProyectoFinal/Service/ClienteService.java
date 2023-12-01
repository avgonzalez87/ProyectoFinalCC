package ProyectoFinal.Service;

import ProyectoFinal.Repository.ClienteRepository;
import ProyectoFinal.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente buscarClientePorId(Long id) {
        return clienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado"));
    }

    public Cliente buscarClientePorCorreo(String correo) {
        return clienteRepository.findByCorreoElectronico(correo);
    }

    // Otros métodos relacionados con clientes
}
