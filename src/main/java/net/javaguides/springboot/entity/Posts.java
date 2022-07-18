package net.javaguides.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Comment;

@Entity
@Table(name ="posts")
public class Posts {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	@Column(name="body")
	String body;
	@Column(name="title")
	String title;
	@Column(name ="userid")
	String userid;
	
	public Posts() {
		
	}

	public Posts(int id, String body, String title, String userid) {
		super();
		this.body = body;
		this.title = title;
		this.userid = userid;
	}
	
	public int getId() {
		return id;
	}
	public String getBody() {
		return body;
	}
	public String getTitle() {
		return title;
	}
	public String getUserid() {
		return userid;
	}
	public void setId(int id) {
		this.id = id;
	}

}
