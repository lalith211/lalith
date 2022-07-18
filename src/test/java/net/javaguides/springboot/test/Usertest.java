package net.javaguides.springboot.test;

import static org.mockito.Mockito.mockitoSession;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.jni.User;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import net.javaguides.springboot.controller.Posts_controller;
import net.javaguides.springboot.entity.Posts;
import net.javaguides.springboot.entity.Users;

@SpringBootTest
public class Usertest {
	
	@Mock
	private Posts posts;
	
	@Autowired
	private Posts_controller Posts_controller;
	
	@Test
	public void postsgetalltest() {
		
		/*Posts post1= new Posts(1,"sunt aut1","quia et1","1");
		Posts post2= new Posts(2,"sunt aut2","quia et2","2");
		*/
		
		Mockito.when(Posts_controller.getAllNotes()).thenReturn(List<Posts>);
		List<Posts> postl=new ArrayList<>();
		Assert.assertEquals(List<Posts>,post1);
		
	}
	

	
	
	
}
