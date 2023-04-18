package ejemplobootCamp.ejemplobootcamp;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/v1")
public class MessageRestController {
	
	/*@Value("${course.message}")
	private String message;*/
	
	@Value("${defaultvalue:${course.message}}")
	private String message;
	
	
	@GetMapping(value="/message")
	public String saludo() {
		return message;
	}
	
	

}
