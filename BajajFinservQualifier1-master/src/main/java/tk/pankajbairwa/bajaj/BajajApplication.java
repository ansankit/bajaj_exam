package tk.pankajbairwa.bajaj;

import java.util.LinkedList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tk.pankajbairwa.bajaj.models.Request;
import tk.pankajbairwa.bajaj.models.Response;

@RestController
@SpringBootApplication
public class BajajApplication {

	public static void main(String[] args) {
		SpringApplication.run(BajajApplication.class, args);
	}
	
	@PostMapping(path = "/bfhl")
	public Response getData(@RequestBody Request req) {
		
		List<String> numbers = new LinkedList<>();
		List<String> alphabets = new LinkedList<>();
		
		for(String s : req.getData()) {
			
			try{
				Integer.parseInt(s);
				numbers.add(s);
			}catch(Exception e) {
				alphabets.add(s);
			}
		}
		
		Response s = new Response();
		s.setIsSuccess(true);
		s.setUserId("Ankit_Pandey_28091995");
		s.setEmail("ansankit@gmail.com");
		s.setRollNumber("PD0492");
		s.setNumbers(numbers);
		s.setAlphabets(alphabets);
		
		return s;
	}


}
