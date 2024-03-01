package com.example.privatetransportation;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/transportroutes/*")
public class Controller {

    @GetMapping("/route/{start}/{end}/{transportType}")
    public String getRoute(@PathVariable String start, @PathVariable String end, @PathVariable String transportType) {
        // Implementera logik för att hämta rutter
        return "Route from " + start + " to " + end + " using " + transportType;
    }

    @GetMapping("/walk/{start}/{end}")
    public String getWalkRoute(@PathVariable String start, @PathVariable String end) {
        // Implementera logik för att hämta promenadrutten
        return "Walk route from " + start + " to " + end;
    }

    @GetMapping("/bike/{start}/{end}")
    public String getBikeRoute(@PathVariable String start, @PathVariable String end) {
        // Implementera logik för att hämta cykelrutten
        return "Bike route from " + start + " to " + end;
    }

    @GetMapping("/car/{start}/{end}")
    public String getCarRoutes(@PathVariable String start, @PathVariable String end) {
        // Implementera logik för att hämta bilrutten
        return "Car routes from " + start + " to " + end;
    }
}
