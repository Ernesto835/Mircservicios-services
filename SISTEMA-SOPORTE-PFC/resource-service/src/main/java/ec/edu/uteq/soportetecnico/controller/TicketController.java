package ec.edu.uteq.soportetecnico.controller;

import ec.edu.uteq.soportetecnico.dto.StandardResponse;
import ec.edu.uteq.soportetecnico.model.Ticket;
import ec.edu.uteq.soportetecnico.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/loans") // Usamos /loans para mantener compatibilidad con tu Gateway anterior
public class TicketController {

    @Autowired
    private TicketRepository ticketRepository;

    @GetMapping("/")
    public StandardResponse listarTodos() {
        return StandardResponse.success(ticketRepository.findAll(), "Listado de tickets recuperado");
    }

    @PostMapping("/")
    public StandardResponse crear(@RequestBody Ticket ticket) {
        Ticket nuevo = ticketRepository.save(ticket);
        return StandardResponse.success(nuevo, "Ticket de soporte técnico registrado");
    }
}
