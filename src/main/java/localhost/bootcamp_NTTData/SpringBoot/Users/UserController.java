package localhost.ejemplobootCamp.ejemplobootcamp.Users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

localhost.ejemplobootCamp.ejemplobootcamp.Model.SpringUsers;

@RestController
@RequestMapping("/api/v2")
public class UserController {
	
	@Autowired
	private UserServiceImpl userService;
	
	@GetMapping("/users")
	@ResponseBody
	public List<SpringUsers> listUsers(){
		return userService.findAll();
	}
	
	@GetMapping("/users/{id}")
	@ResponseBody
	public SpringUsers viewUser(@PathVariable("id") int id) {
		return userService.getUserById(id);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<SpringUsers> deleteUserById(@PathVariable("id") int id) {
		SpringUsers usuario = userService.getUserById(id);
		userService.deleteUser(usuario);
		return ResponseEntity.status(HttpStatus.OK).body(usuario);
	}
	
	@PostMapping("/users/new")
	public ResponseEntity<SpringUsers> insertUser(){
		
	}
}
