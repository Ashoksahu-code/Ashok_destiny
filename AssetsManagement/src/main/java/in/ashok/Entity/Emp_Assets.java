package in.ashok.Entity;

import java.util.Arrays;

public class Emp_Assets {
	
	private long id;
	private String name;
	private String asset;
	private String type;
	private String date;
	private String status;
	private String condition;
	
	public Emp_Assets(){
		super();
	}
	
	public Emp_Assets(long id, String name, String asset, String type, String date, String status,
			String condition) {
		super();
		this.id = id;
		this.name = name;
		this.asset = asset;
		this.type = type;
		this.date = date;
		this.status = status;
		this.condition = condition;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String emp_name) {
		emp_name = name;
	}
	public String getAsset() {
		return asset;
	}
	public void setAsset(String asset) {
		this.asset = asset;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	
	@Override
	public String toString() {
		return "Emp_Assets [id=" + id + ", name=" + name + ", asset=" + asset + ", type=" + type + ", date="
				+ date + ", status=" + status + ", condition=" + condition + "]";
	}
	
}
