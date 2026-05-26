package org.example.progettotasktree.Service;

import org.example.progettotasktree.Entity.Timer;
import org.example.progettotasktree.Repo.TimerRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.UUID;

@Service
public class TimerService {
    private final TimerRepository timerRepository;

    public TimerService(TimerRepository timerRepository) {
        this.timerRepository = timerRepository;
    }

    public UUID avvioTimer(int dipendente){

        Timer timer = timerRepository.findByDipendenteGiorno(dipendente, LocalDate.now()).orElse(null);
        if(timer != null){
            throw new RuntimeException("Timer già avviato");
        }

        timer = new Timer();
        timer.setDipendente(dipendente);
        timerRepository.save(timer);
        return timer.getId();
    }

    public void fermaTimer(int dipendente){
        //recupero il timer dalla repo e lo salvo in appoggio
        Timer timer = timerRepository.findByDipendenteGiorno(dipendente, LocalDate.now()).orElse(null);

        if(timer == null){
            throw new RuntimeException();
        }
        else if(timer.getOraFine() != null){
            throw new RuntimeException();
        }

        //setto la ora di fine
        timer.setOraFine();
        timerRepository.save(timer);
    }

}
