package cl.awekelab.miprimerspring0057.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 50)
    private String nombreUsuario;

    @Column(length = 30)
    private String Contrasena;

    @Column(length = 30)
    private String rol;
}
