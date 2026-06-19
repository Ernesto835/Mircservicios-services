package ec.edu.uteq.soportetecnico.controller;
import ec.edu.uteq.soportetecnico.dto.StandardResponse;
import ec.edu.uteq.soportetecnico.model.Log;
import ec.edu.uteq.soportetecnico.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notifications")
public class LogController {
    @Autowired private LogRepository repo;

    @GetMapping("/")
    public StandardResponse historial() {
        return StandardResponse.success(repo.findAll(), "Historial de auditoría");
    }

    @PostMapping("/")
    public StandardResponse registrar(@RequestBody Log log) {
        return StandardResponse.success(repo.save(log), "Evento auditado");
    }
}