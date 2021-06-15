package in.raptoracademy.ironman.controller;

import in.raptoracademy.ironman.entity.User;
import in.raptoracademy.ironman.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class AppController {

    @Autowired
    UserService userService;

    @ApiOperation(value = "Get all users from DB", response = ResponseEntity.class)
    @GetMapping(path = "/getAll")
    public ResponseEntity getAllUsers() {
        try {
            Iterable<User> response = userService.getAllUsers();
            return ResponseEntity.ok(response);
        } catch (Exception exception) {
            return ResponseEntity.badRequest().build();
        }
    }

    @ApiOperation(value = "Add new user entry into DB", response = ResponseEntity.class)
    @PostMapping(path = "/saveUser")
    public ResponseEntity saveUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.saveUser(user));
    }
}
