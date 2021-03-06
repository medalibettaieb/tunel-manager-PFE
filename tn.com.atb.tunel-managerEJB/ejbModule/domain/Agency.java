package domain;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Agency
 *
 */
@Entity

public class Agency implements Serializable {

	
	private Integer id;
	private String name;
	private static final long serialVersionUID = 1L;
	
	private List<Tunel> tunels;

	public Agency() {
		super();
	}   
	@Id    
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@OneToMany(mappedBy="agency")
	public List<Tunel> getTunels() {
		return tunels;
	}
	public void setTunels(List<Tunel> tunels) {
		this.tunels = tunels;
	}
   
}
