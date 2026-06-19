package ec.edu.uteq.soportetecnico.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StandardResponse {
    private String status;   // "success" o "error"
    private Object data;     // El contenido (token, lista, objeto)
    private String message;  // El mensaje para el usuario
    private String timestamp; // Fecha y hora actual

    // Método utilitario para crear respuestas exitosas rápidamente
    public static StandardResponse success(Object data, String message) {
        return StandardResponse.builder()
                .status("success")
                .data(data)
                .message(message)
                .timestamp(LocalDateTime.now().toString())
                .build();
    }
}