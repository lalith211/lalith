package net.javaguides.springboot.test;

import static org.mockito.Mockito.mockitoSession;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.jni.User;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.client.ExpectedCount;

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
		
		Posts_controller post1= new Posts_controller();
		post1.addCompany("1",1,"sunt aut1","quia et1");
		Assertions.assertFalse(post1.getAllNotes().isEmpty());
		Assertions.assertEquals(1,post1.getAllNotes().size());
		
		
		
		/*Mockito.when(Posts_controller.getAllNotes()).thenReturn(List<Posts>);
		List<Posts> postl=new ArrayList<>();
		Assert.assertEquals(List<Posts>,post1);*/
		
	}
	

	
	
	
}
