package br.edu.ifal.agenda_rayane;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendaRepository extends JpaRepository<Agenda, Long>{
    
}