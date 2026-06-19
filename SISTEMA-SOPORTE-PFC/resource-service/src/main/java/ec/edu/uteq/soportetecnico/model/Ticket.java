package ec.edu.uteq.soportetecnico.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tickets")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cliente;
    private String titulo;
    private String descripcion;
    private String prioridad; // Baja, Normal, Alta, Urgente
    private String estado;    // Pendiente, En Proceso, Cerrada
}