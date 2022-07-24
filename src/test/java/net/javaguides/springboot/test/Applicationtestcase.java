package net.javaguides.springboot.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.stream;
import static org.mockito.ArgumentMatchers.anyCollection;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.hibernate.boot.jaxb.mapping.spi.JaxbPostRemove;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.stubbing.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import net.javaguides.springboot.controller.Posts_controller;
import net.javaguides.springboot.controller.users_Contoller;
import net.javaguides.springboot.entity.Posts;
import net.javaguides.springboot.entity.Users;
import net.javaguides.springboot.repository.Posts_Repository;

@SpringBootTest
public class Applicationtestcase {
	
	@Mock
	public Posts_controller posts_controller;
	
	@Autowired
	public Posts posts;
	
  /*  @Test
    public void add()
    {
        Posts post = new Posts(1,"1","sunt aut1","quia et1");
        when(Posts_controller.getAllNotes()).thenAnswer(Answer<post>); 
		assertEquals(1,Posts_controller.getAllNotes().size());
    }*/
    
    @Test
    public void update()
    {
        
    	Posts post = new Posts(1,"1","sunt aut1","quia et1");
        posts_controller.updateStudent(post,1); 
		verify(posts_controller, times(1)).updateStudent(post,1);
    }
    
    @Test
    public void addtest()
    {
        Posts post = new Posts(1,"1","sunt aut1","quia et1");
        posts_controller.addCompany(post); 
        verify(posts_controller, times(1)).addCompany(post);
    }

    
	
    
    
	@Test
	public void getusertest() {
		 

String[] array={"1","sunt aut1","quia et1"}; 
List<String> list=new ArrayList<String>();  
for(String lang:array){  
list.add(lang);  
} 
		
		when(Posts_controller.getAllNotes()).thenReturn(list);
		assertEquals(1,Posts_controller.getAllNotes().size());
		
	}
	
	

	}

