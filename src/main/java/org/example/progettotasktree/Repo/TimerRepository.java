package org.example.progettotasktree.Repo;

import org.example.progettotasktree.Entity.Timer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Optional;
import java.util.UUID;

public interface TimerRepository extends JpaRepository<Timer, UUID> {

    Optional<Timer> findByDipendenteGiorno(int dipendente, LocalDate dataOdierna);

}
