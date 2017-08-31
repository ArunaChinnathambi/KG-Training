package com.aruna;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Agenda {
@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "agenda_id")
    private Integer id;
    private String time;
    private String description;
    private String instructor;
    
    public Agenda(){}

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}

public String getTime() {
return time;
}

public void setTime(String time) {
this.time = time;
}

public String getDescription() {
return description;
}

public void setDescription(String description) {
this.description = description;
}

public String getInstructor() {
return instructor;
}

public void setInstructor(String instructor) {
this.instructor = instructor;
}
    
    
}
