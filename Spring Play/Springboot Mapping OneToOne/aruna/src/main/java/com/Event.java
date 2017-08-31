package com.aruna;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence;

@Entity
public class Event {
@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    private String date;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "agenda_id", referencedColumnName = "agenda_id")
    private Agenda agenda;
    
    public Event(){}

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}

public String getDate() {
return date;
}

public void setDate(String date) {
this.date = date;
}

public Agenda getAgenda() {
return agenda;
}

public void setAgenda(Agenda agenda) {
this.agenda = agenda;
}
    
    
}
