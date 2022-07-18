package net.javaguides.springboot.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Geo")
public class Geo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="id")
	int id;
	
	@Column(name="lat")
	private long lat;
	@Column(name ="lng")
	private long lng;
	
	@ManyToOne
	@JoinColumn(name="geo2")
	private Address address1;
	
	public Geo() {
		super();
	}

	public Geo(long lat, long lng) {
		super();
		this.lat = lat;
		this.lng = lng;
	}
	
	public int getId() {
		return id;
	}
	public long getLat() {
		return lat;
	}
	public long getLng() {
		return lng;
	}
	public void setId(int id) {
		this.id = id;
	}

}
