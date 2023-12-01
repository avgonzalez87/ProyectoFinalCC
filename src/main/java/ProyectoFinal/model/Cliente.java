package ProyectoFinal.model;

import jakarta.persistence.*;

//import javax.persistence.*;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String correoElectronico;

    private String direccion;

    public Cliente(Long idCliente, String nombre, String correoElectronico, String direccion) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;
    }

    public Cliente() {

    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    private Long id;



    public Long getId() {
        return id;
    }

}
