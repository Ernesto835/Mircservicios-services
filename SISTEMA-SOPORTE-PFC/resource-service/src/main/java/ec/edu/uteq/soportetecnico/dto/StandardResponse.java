package ec.edu.uteq.soportetecnico.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Builder
public class StandardResponse {
    private String status;
    private Object data;
    private String message;
    private String timestamp;

    public static StandardResponse success(Object data, String message) {
        return new StandardResponse("success", data, message, LocalDateTime.now().toString());
    }
}