package localhost.ejemplobootCamp.ejemplobootcamp.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="spring_users")
public class SpringUsers {

	@Id
	@Column(name="id")
	private Integer id;
	@Column(name="name")
	private String name;
	@Column(name="birthdate")
	private String birthdate;
	
	public SpringUsers(){}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
}
