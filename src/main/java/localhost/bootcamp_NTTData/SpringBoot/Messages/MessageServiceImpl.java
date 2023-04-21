package localhost.ejemplobootCamp.ejemplobootcamp.Messages;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {

	@Value("${saludo.hello:${saludo.pordefecto}}")
	private String saludo;

	@Override
	public String getMessage() {
		return this.saludo;
	}
	
	
}