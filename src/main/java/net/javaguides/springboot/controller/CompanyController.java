
package net.javaguides.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.entity.Company;
import net.javaguides.springboot.repository.CompanyRepository;

@RestController
public class CompanyController {
	
	
	@Autowired
	private CompanyRepository repo;

	/*@GetMapping("/wallcome")
	public String welcome()
	{
		return "<html><body>"
			+ "<h1>WELCOME</h1>"
			+ "</body></html>";
	}*/
	
	@GetMapping("/posts")
	public List<Company> getAllNotes()
	{
		return repo.findAll();
	}
	
	@GetMapping("/com/{id}")
	public Optional<Company> getCompanybyId(@PathVariable(value = "id") int id) {
		
		return repo.findById(id);
	}
	
	@PostMapping("/posts")
	@ResponseStatus(HttpStatus.CREATED)
	public Company addCompany(@RequestBody Company posts) {
		System.out.println("hello");
		return repo.save(posts);
		
	}
	
	@DeleteMapping("/delete/{id}")
    public void deleteStudent(
            @PathVariable(value = "id") int id)
        {
            repo.deleteById(id);
        }
	
	@PutMapping("/add/{id}")
    public ResponseEntity<Object> updateStudent(
            @RequestBody Company posts,
            @PathVariable int id)
        {
      
            Optional<Optional<Company>> postsRepo
                = Optional.ofNullable(repo.findById(id));
      
            if (!postsRepo.isPresent())
                return ResponseEntity
                    .notFound()
                    .build();
      
            posts.setId(id);
      
            repo.save(posts);
      
            return ResponseEntity
                .noContent()
                .build();
        }

}
