package net.javaguides.springboot.entity;

import java.util.ArrayList;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import net.javaguides.springboot.entity.Users;
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

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

import antlr.collections.List;
import net.javaguides.springboot.entity.Users;

@Entity
@Table(name="Address")
public class Address {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	int id;
	
	@Column(name="street")
	private String street;
	
	@Column(name="suite")
	private String suite;
	
	
	@Column(name="city")
	private  String city;
	
	@Column(name ="zipcode")
	private int zipcode;
	
	@ManyToOne
	@JoinColumn(name="user_it")
	private Users user;
	
	@OneToMany(targetEntity = Geo.class,cascade= CascadeType.ALL)
	@JoinColumn(name="address1",referencedColumnName = "id")
	private java.util.List<Geo> geo1=new ArrayList<>();
	
	
	





	public Address(String street, String suite, String city, int zipcode, Users user, java.util.List<Geo> geo1) {
		super();
		this.street = street;
		this.suite = suite;
		this.city = city;
		this.zipcode = zipcode;
		this.user = user;
		this.geo1 = geo1;
	}




	public Address(java.util.List<Geo> geo1) {
		super();
		this.geo1 = geo1;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getStreet() {
		return street;
	}




	public void setStreet(String street) {
		this.street = street;
	}




	public String getSuite() {
		return suite;
	}




	public void setSuite(String suite) {
		this.suite = suite;
	}




	public String getCity() {
		return city;
	}




	public void setCity(String city) {
		this.city = city;
	}




	public int getZipcode() {
		return zipcode;
	}




	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}







	public Address() {
		super(); 
	}



	
}
