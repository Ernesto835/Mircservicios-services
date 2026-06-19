package ec.edu.uteq.soportetecnico.model;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity @Data
public class Log {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String accion;
    private String mensaje;
    private String timestamp = LocalDateTime.now().toString();
}