package model;
import jakarta.persistence.*;

//import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "ControlOrdenesActivas")
public class ControlOrdenActiva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long controlID;

    @ManyToOne
    @JoinColumn(name = "ClienteID", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "OrdenActivaID", nullable = false)
    private Orden ordenActiva;

    @Column(nullable = false)
    private LocalDateTime fechaInicioOrden;

    @Column
    private LocalDateTime fechaEstimadaEntrega;

    // Getters y setters

    public Long getControlID() {
        return controlID;
    }

    public void setControlID(Long controlID) {
        this.controlID = controlID;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Orden getOrdenActiva() {
        return ordenActiva;
    }

    public void setOrdenActiva(Orden ordenActiva) {
        this.ordenActiva = ordenActiva;
    }

    public LocalDateTime getFechaInicioOrden() {
        return fechaInicioOrden;
    }

    public void setFechaInicioOrden(LocalDateTime fechaInicioOrden) {
        this.fechaInicioOrden = fechaInicioOrden;
    }

    public LocalDateTime getFechaEstimadaEntrega() {
        return fechaEstimadaEntrega;
    }

    public void setFechaEstimadaEntrega(LocalDateTime fechaEstimadaEntrega) {
        this.fechaEstimadaEntrega = fechaEstimadaEntrega;
    }
}
