package com.aruna;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aruna.Event;
public interface EventRepository extends JpaRepository<Event, Integer> {
}
