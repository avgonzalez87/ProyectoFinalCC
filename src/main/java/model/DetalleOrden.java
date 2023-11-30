package model;
import jakarta.persistence.*;

//import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "DetallesOrden")
public class DetalleOrden {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long detalleID;

    @ManyToOne
    @JoinColumn(name = "OrdenID", nullable = false)
    private Orden orden;

    @ManyToOne
    @JoinColumn(name = "ProductoID", nullable = false)
    private Producto producto;

    @Column(nullable = false)
    private int cantidad;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal subtotal;

    // Getters y setters

    public Long getDetalleID() {
        return detalleID;
    }

    public void setDetalleID(Long detalleID) {
        this.detalleID = detalleID;
    }

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }
}
