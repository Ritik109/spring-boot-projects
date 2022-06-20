package com.springproject.apigatway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
    @GetMapping("/productServiceFallback")
    public String productServiceFallback() {
        return "Unable to reach Product Service please try after some time";

    }

    @GetMapping("/categoryServiceFallback")
    public String categoryServiceFallback() {
        return "Unable to reach Category Service please try after some time";

    }
}
