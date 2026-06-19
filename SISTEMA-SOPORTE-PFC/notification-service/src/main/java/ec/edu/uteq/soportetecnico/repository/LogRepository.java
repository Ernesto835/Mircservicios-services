package ec.edu.uteq.soportetecnico.repository;
import ec.edu.uteq.soportetecnico.model.Log;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogRepository extends JpaRepository<Log, Long> { }