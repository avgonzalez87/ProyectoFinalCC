package model;
import jakarta.persistence.*;

//import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Log")
public class Log {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long logID;

    @ManyToOne
    @JoinColumn(name = "UsuarioID", nullable = false)
    private Usuarios usuario;

    @Column(nullable = false)
    private LocalDateTime fechaHoraAcceso;

    @Column(nullable = false, length = 50)
    private String resultadoAcceso;

    @Column(length = 50)
    private String direccionIP;

    // Getters y setters

    public Long getLogID() {
        return logID;
    }

    public void setLogID(Long logID) {
        this.logID = logID;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public LocalDateTime getFechaHoraAcceso() {
        return fechaHoraAcceso;
    }

    public void setFechaHoraAcceso(LocalDateTime fechaHoraAcceso) {
        this.fechaHoraAcceso = fechaHoraAcceso;
    }

    public String getResultadoAcceso() {
        return resultadoAcceso;
    }

    public void setResultadoAcceso(String resultadoAcceso) {
        this.resultadoAcceso = resultadoAcceso;
    }

    public String getDireccionIP() {
        return direccionIP;
    }

    public void setDireccionIP(String direccionIP) {
        this.direccionIP = direccionIP;
    }
}
