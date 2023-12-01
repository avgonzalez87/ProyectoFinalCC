package ProyectoFinal.Service;

import ProyectoFinal.Repository.ProductoRepository;
import ProyectoFinal.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public Producto buscarProductoPorId(Long id) {
        return productoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
    }

    // Otros métodos relacionados con productos
}
