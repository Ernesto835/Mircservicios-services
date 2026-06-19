package ec.edu.uteq.soportetecnico.controller;


import ec.edu.uteq.soportetecnico.dto.StandardResponse;
import ec.edu.uteq.soportetecnico.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired private JwtUtil jwtUtil;

    @PostMapping("/login")
    public StandardResponse login(@RequestBody Map<String, String> creds) {
        // Usuario de prueba para el PFC
        if ("admin".equals(creds.get("username")) && "123".equals(creds.get("password"))) {
            String token = jwtUtil.generateToken("admin");
            return StandardResponse.success(Map.of("access_token", token), "Login exitoso");
        }
        return new StandardResponse("error", null, "Credenciales incorrectas", java.time.LocalDateTime.now().toString());
    }
}