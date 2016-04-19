package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
	
import java.io.IOException;
import java.text.MessageFormat;
import java.util.Collection;
import java.util.Date;

@RestController
public class PageController {

    @RequestMapping("/")
    public String index() {
    	//getCommits();
        return "Greetings from Spring Boot!";
    }
    public void getCommits(){
		
	}
}