package org.example.progettotasktree.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;


@Entity
public class Timer {

    @Id
    private UUID id;
    private int dipendente; //aggiungi poi dipendente
    private LocalDate Giorno;
    private LocalTime oraInizio;
    private LocalTime oraFine;

    public Timer() {
        this.id = UUID.randomUUID();
        this.dipendente = 0;
        this.Giorno = LocalDate.now();
        this.oraInizio = LocalTime.now();
    }

    public void setOraFine(){
        this.oraFine = LocalTime.now();
    }

    public void setDipendente(int dipendente){
        this.dipendente = dipendente;
    }


    public UUID getId(){
        return id;
    }

    public int getDipendente(){
        return dipendente;
    }
    public LocalDate getGiorno(){
        return Giorno;
    }
    public LocalTime getOraInizio(){
        return oraInizio;
    }
    public LocalTime getOraFine(){
        return oraFine;
    }
}
