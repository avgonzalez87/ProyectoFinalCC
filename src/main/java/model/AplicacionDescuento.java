package model;
import jakarta.persistence.*;

//import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "AplicacionDescuentos")
public class AplicacionDescuento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long aplicacionID;

    @ManyToOne
    @JoinColumn(name = "DescuentoID", nullable = false)
    private Descuento descuento;

    @ManyToOne
    @JoinColumn(name = "OrdenID", nullable = false)
    private Orden orden;

    @Column(nullable = false)
    private LocalDateTime fechaAplicacion;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal montoDescuento;

    // Getters y setters

    public Long getAplicacionID() {
        return aplicacionID;
    }

    public void setAplicacionID(Long aplicacionID) {
        this.aplicacionID = aplicacionID;
    }

    public Descuento getDescuento() {
        return descuento;
    }

    public void setDescuento(Descuento descuento) {
        this.descuento = descuento;
    }

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }

    public LocalDateTime getFechaAplicacion() {
        return fechaAplicacion;
    }

    public void setFechaAplicacion(LocalDateTime fechaAplicacion) {
        this.fechaAplicacion = fechaAplicacion;
    }

    public BigDecimal getMontoDescuento() {
        return montoDescuento;
    }

    public void setMontoDescuento(BigDecimal montoDescuento) {
        this.montoDescuento = montoDescuento;
    }
}
