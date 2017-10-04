package mustafaergan.bootexample;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class ExampleEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	String name;
	
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
