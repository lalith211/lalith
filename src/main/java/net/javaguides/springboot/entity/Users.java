package net.javaguides.springboot.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import net.javaguides.springboot.entity.Address;
import net.javaguides.springboot.entity.Geo;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.web.bind.annotation.GetMapping;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.NoArgsConstructor;

@Entity
@Table(name="users")
public class Users {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	int id;
	
	@Column(name ="email")
	private String email;
	
	@Column(name ="name")
	private String name;
	
	@Column(name ="username")
	private String username;

	/*@OneToMany(targetEntity = Address.class,cascade = CascadeType.ALL)
	@JoinColumn(name="user",referencedColumnName = "id")
	private List<Address> addll=new ArrayList<>();*/
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name= "ad_id")
	private Address addll;
	
	


	public Users() {
		super();
	}
	
	
	public Users(String email, String name, String username) {
		super();
		this.email = email;
		this.name = name;
		this.username = username;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}


	public Address getAddll() {
		return addll;
	}


	public void setAddll(Address addll) {
		this.addll = addll;
	}
	
	public void Address(Address addll) {
		this.addll = addll;
	}
	



}

