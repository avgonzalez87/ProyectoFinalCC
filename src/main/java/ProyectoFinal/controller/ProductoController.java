package ProyectoFinal.controller;

import ProyectoFinal.model.Producto;
import ProyectoFinal.Service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/{id}")
    public ResponseEntity<Producto> obtenerProducto(@PathVariable Long id) {
        Producto producto = productoService.buscarProductoPorId(id);
        return ResponseEntity.ok(producto);
    }

}
