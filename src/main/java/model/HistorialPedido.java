package model;
import jakarta.persistence.*;

//import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "HistorialPedidos")
public class HistorialPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long historialID;

    @ManyToOne
    @JoinColumn(name = "ClienteID", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "OrdenID", nullable = false)
    private Orden orden;

    @Column(nullable = false)
    private LocalDateTime fechaPedido;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal totalPedido;

    // Getters y setters

    public Long getHistorialID() {
        return historialID;
    }

    public void setHistorialID(Long historialID) {
        this.historialID = historialID;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }

    public LocalDateTime getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDateTime fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public BigDecimal getTotalPedido() {
        return totalPedido;
    }

    public void setTotalPedido(BigDecimal totalPedido) {
        this.totalPedido = totalPedido;
    }
}
