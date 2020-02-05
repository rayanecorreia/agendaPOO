package br.edu.ifal.agenda_rayane;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Long> {
    
Iterable<Contato> findByNomeContaining(String nome); //contato esta herdando de jpa, pq a inteface nao implemeta de outra intarface so herda
}