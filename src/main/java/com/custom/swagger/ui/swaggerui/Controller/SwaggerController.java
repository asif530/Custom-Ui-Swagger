package com.custom.swagger.ui.swaggerui.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SwaggerController {
    @GetMapping("/swagger-ui")
    public String swaggerUi() {
        return "swagger-ui";  // Return the name of the Thymeleaf template
    }
}
