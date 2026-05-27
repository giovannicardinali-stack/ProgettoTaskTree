package org.example.progettotasktree.Controller;

import org.example.progettotasktree.Service.TimerService;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/timer")
public class TimerController {

    private final TimerService timerService;


    TimerController(TimerService timerService) {
        this.timerService = timerService;
    }


    @PostMapping("/avvio/{dipendente}")
    public UUID avvioTimer(@PathVariable int dipendente){
        return timerService.avvioTimer(dipendente);
    }

    @PostMapping("/ferma/{dipendente}")
    public void fermaTimer(@PathVariable int dipendente){
        timerService.fermaTimer(dipendente);
    }

    @GetMapping("/dipendente/{dipendente}")
    public void visualizzaTimer(@PathVariable int dipendente){
        timerService.visualizzaTimer(dipendente);
    }
}