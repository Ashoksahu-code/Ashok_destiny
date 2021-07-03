package in.ashok.Entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="EmploteeData")
public class Employees {

	
	private long  id;
	private String E_Name;
	private String desingnation;
	
	
	
	public Employees() {
		super();
	}
	
	public Employees(long id, String e_Name, String desingnation) {
		super();
		this.id = id;
		E_Name = e_Name;
		this.desingnation = desingnation;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getE_Name() {
		return E_Name;
	}
	public void setE_Name(String e_Name) {
		E_Name = e_Name;
	}
	public String getDesingnation() {
		return desingnation;
	}
	public void setDesingnation(String desingnation) {
		this.desingnation = desingnation;
	}
	
	@Override
	public String toString() {
		return "Employees [id=" + id + ", E_Name=" + E_Name + ", desingnation=" + desingnation + "]";
	}
	
}
