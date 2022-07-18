package net.javagiudes.springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import net.javaguides.springboot.entity.Users;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public abstract class Dto {
	private Users users;

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}
	
	
	
	

}
