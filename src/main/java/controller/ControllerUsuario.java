package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clientes")
public class ControllerUsuario {

    @Autowired
    private ClienteService clienteService;

    @PutMapping("/actualizar")
    public ResponseEntity<?> actualizarDatosCliente(@RequestBody ClienteDTO clienteDTO) {
        clienteService.actualizarDatosCliente(clienteDTO);
        return new ResponseEntity<>("Datos del cliente actualizados", HttpStatus.OK);
    }

}
