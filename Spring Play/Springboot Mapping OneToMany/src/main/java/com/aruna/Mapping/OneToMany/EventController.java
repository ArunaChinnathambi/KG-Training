package com.aruna.mapping.OneToMany;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aruna.mapping.OneToMany.Agenda;
//import com.aruna.mapping.OneToMany.Employee;
import com.aruna.mapping.OneToMany.Event;
//import com.aruna.mapping.OneToMany.Users;
//import com.aruna.mapping.OneToMany.UsersContact;
//import com.aruna.mapping.OneToMany.AgendaRepository;
import com.aruna.mapping.OneToMany.EventRepository;
//import com.aruna.mapping.OneToMany.UsersContactRepository;

@RestController
@RequestMapping("/rest/Event")
public class EventController {
private EventRepository eventRepository;
//private AgendaRepository agendaRepository;
public EventController(EventRepository eventRepository) {
this.eventRepository = eventRepository;
}
// @GetMapping(value = "/all")
// public List<Event> getUsersContact() {
// return eventRepository.findAll();
// }

@RequestMapping(method = RequestMethod.GET)
public List<Event> allEvents() {
return eventRepository.findAll();
}

@RequestMapping(value = "/{id}",method = RequestMethod.GET)
public Event findoneEvent(@PathVariable Long id) {
return eventRepository.findOne(id);
}

@RequestMapping(method = RequestMethod.POST)
public Event addEvent(@RequestBody Event event) {
//event.setId(null); 
return eventRepository.saveAndFlush(event);
}

@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
public Event updateEvent(@RequestBody Event updateEvent, @PathVariable Long id) {
updateEvent.setId(id);
return eventRepository.saveAndFlush(updateEvent);
}

@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
public void deleteEvent(@PathVariable Long id) {
eventRepository.delete(id);
}
// @GetMapping(value = "/update")
// public List<Event> update() {
//
// Event event = new Event();
//
// Agenda agenda = new Agenda();
// agenda.setDescription("one2onemapping");
// agenda.setTime("6.30 PM");
// agenda.setInstructor("You tube");
//
// event.setDate("23/08/2017");
// event.setAgenda(agenda);
//
// eventRepository.save(event);
//
// return eventRepository.findAll();
//
// }
}
