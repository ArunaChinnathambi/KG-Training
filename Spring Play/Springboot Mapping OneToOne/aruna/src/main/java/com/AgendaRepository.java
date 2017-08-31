package com.aruna;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aruna.Agenda;



public interface AgendaRepository extends JpaRepository<Agenda, Integer>{
//List<Agenda> findByDate(String date);
}