package com.hsrp.nic_project.controller;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import com.hsrp.nic_project.relation.User;
import com.hsrp.nic_project.service.DataService;

import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
@Transactional
@CrossOrigin("http://localhost:5173")
public class DataController {

    private final DataService dataService;

    public DataController(DataService dataService) {
        this.dataService = dataService;
    }
    
    @GetMapping(value = "/all", consumes = MediaType.ALL_VALUE, produces= MediaType.APPLICATION_JSON_VALUE)
    public List<User> getAllUsers() {
        return dataService.getAllUsers();

    }
    
    @GetMapping(value = "/{id}", consumes = MediaType.ALL_VALUE, produces= MediaType.APPLICATION_JSON_VALUE)
    public Optional<User> getUser(@PathVariable Long id) {
        return dataService.getUser(id);

    }

    @PostMapping(value = "/input", consumes = MediaType.ALL_VALUE, produces= MediaType.APPLICATION_JSON_VALUE)
    public User createUser(@RequestBody User user) {
    	return dataService.createUser(user);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        return dataService.updateUser(id, user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
    	dataService.deleteUser(id);
    }
}
