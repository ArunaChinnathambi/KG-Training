package com.aruna.mapping.OneToMany;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aruna.mapping.OneToMany.Event;
public interface EventRepository extends JpaRepository<Event, Long> {
}
