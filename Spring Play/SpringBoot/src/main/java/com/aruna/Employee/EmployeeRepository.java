package com.aruna;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.*;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
        @Query("select e from Employee e where e.designation=:designation")  
       public List<Employee> getbydesign(@Param("designation") String designation);
}