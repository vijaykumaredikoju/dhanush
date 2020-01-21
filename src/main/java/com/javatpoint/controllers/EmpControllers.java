import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.beans.Emp;
import com..repository.Repository;

@RestController
public class Controller {
	@Autowired
	private Repository repository;

	@PostMapping("/add")
	public String responseEntity(@RequestBody Entity entity){
		
		repository.save(entity);
		
		return "Sucess";
	}
}