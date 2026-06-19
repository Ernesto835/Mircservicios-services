package ec.edu.uteq.soportetecnico.repository;

import ec.edu.uteq.soportetecnico.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}