package com.aruna;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.aruna.Agenda;
import com.aruna.Event;
import com.aruna.AgendaRepository;
import com.aruna.EventRepository;

@RestController
@RequestMapping("/rest/Event")
public class EventResource {
private EventRepository eventRepository;

public EventResource(EventRepository eventRepository) {
this.eventRepository = eventRepository;
}

@GetMapping(value = "/all")
public List<Event> getUsersContact() {
return eventRepository.findAll();
}

@GetMapping(value = "/update")
public List<Event> update() {

Event event = new Event();

Agenda agenda = new Agenda();
agenda.setDescription("one2onemapping");
agenda.setTime("6.30 PM");
agenda.setInstructor("You tube here");

event.setDate("23/08/2017");
event.setAgenda(agenda);

eventRepository.save(event);

return eventRepository.findAll();

}
}
