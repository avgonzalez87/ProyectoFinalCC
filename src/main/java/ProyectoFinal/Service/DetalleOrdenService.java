package ProyectoFinal.Service;

import ProyectoFinal.Repository.DetalleOrdenRepository;
import ProyectoFinal.model.DetalleOrden;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleOrdenService {

    @Autowired
    private DetalleOrdenRepository detalleOrdenRepository;

    public DetalleOrden agregarDetalleOrden(DetalleOrden detalle) {
        return detalleOrdenRepository.save(detalle);
    }

    // Otros métodos relacionados con detalles de orden
}
