package com.aruna;
import java.lang.Iterable;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeController {
 @Autowired
  private EmployeeRepository repo;

 // @RequestMapping( value="/show",method = RequestMethod.GET)
  @GetMapping("/show")
  public List<Employee> findItems() {
    return repo.findAll();
  }
  @GetMapping("/save")
  public Employee addItem(Employee employee) {
    return repo.save(employee);
  }
  @GetMapping("/getid")
  public Employee getid(@RequestParam("id") Integer id)
  {
    return repo.findOne(id);
  }
  @GetMapping("/delete")
  public void deleteid(@RequestParam("id") Integer id)
  {
      repo.delete(id);
  }
  @GetMapping("/designations")
  public List<Employee> getbydesign(@RequestParam("designation") String designation)
  {
    return repo.getbydesign(designation);
  }
}