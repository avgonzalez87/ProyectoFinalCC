package model;
import jakarta.persistence.*;

//import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "Ordenes")
public class Orden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ordenID;

    @ManyToOne
    @JoinColumn(name = "ClienteID", nullable = false)
    private Cliente cliente;

    @Column(nullable = false)
    private LocalDateTime fechaOrden;

    @Column(nullable = false, length = 50)
    private String estado;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal total;

    @OneToMany(mappedBy = "orden")
    private Set<DetalleOrden> detallesOrden;

    // Getters y setters

    public Long getOrdenID() {
        return ordenID;
    }

    public void setOrdenID(Long ordenID) {
        this.ordenID = ordenID;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDateTime getFechaOrden() {
        return fechaOrden;
    }

    public void setFechaOrden(LocalDateTime fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Set<DetalleOrden> getDetallesOrden() {
        return detallesOrden;
    }

    public void setDetallesOrden(Set<DetalleOrden> detallesOrden) {
        this.detallesOrden = detallesOrden;
    }
}
