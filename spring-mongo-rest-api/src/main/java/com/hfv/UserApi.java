package com.hfv;

import com.hfv.entity.User;
import com.hfv.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserApi {
    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public ResponseEntity<User> add(@RequestBody User user)
    {
        return ResponseEntity.ok(userRepository.save(user));
    }

    @GetMapping
    public ResponseEntity<List<User>> getAll(User user)
    {
        return ResponseEntity.ok(userRepository.findAll());
    }
}
