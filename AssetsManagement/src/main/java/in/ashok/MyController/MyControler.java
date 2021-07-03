package in.ashok.MyController;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashok.Entity.Category;
import in.ashok.Entity.Emp_Assets;
import in.ashok.Entity.Employees;
import in.ashok.Service.CategoryService;
import in.ashok.Service.EmpAssetService;
import in.ashok.Service.EmployeeService;
import in.ashok.dao.CategoryDao;



@CrossOrigin(origins="http://localhost:3000")
@RestController
@Validated
public class MyControler {
	
	@Autowired
	private EmployeeService es;
	@Autowired
	private CategoryService cs;
	
	
	@GetMapping("/employee")
	public List<Employees> getEmp()
	{
		return this.es.getEmp();	
	}
	
	
	
//	@GetMapping("/Employee/{employeeId}")
//	public Employees getEmp(@PathVariable String employeeId)
//	{
//		return this.es.getEmp(Long.parseLong(employeeId));
//	}
	
	@PostMapping("/employee")
	public Employees addEmp(@RequestBody Employees employee)
	{
		return this.es.addEmp(employee);
	}
  
	@PutMapping("/employee")
	public Employees updateEmp(@RequestBody Employees employee)
	{
		return this.es.updateEmp(employee);
	}
	@DeleteMapping("/employee/{employeeId}")
	public ResponseEntity<HttpStatus> deleteEmp(@PathVariable String employeeId){
		try {
			this.es.deleteEmp(Long.parseLong(employeeId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	//Category Controller
	
	
	@GetMapping("/assets")
	public List<Category> getAsset()
	{
		return this.cs.getAsset();	
	}
		
	@PostMapping("/assets")
	public Category addAsset(@RequestBody Category asset)
	{
		return this.cs.addAsset(asset);
	}
  
	@PutMapping("/assets")
	public Category updateAsset(@RequestBody Category asset)
	{
		return this.cs.updateAsset(asset);
	}
	@DeleteMapping("/assets/{assetId}")
	public ResponseEntity<HttpStatus> deleteAsset(@PathVariable String assetId){
		try {
			this.cs.deleteAsset(Long.parseLong(assetId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	//Employee Assets
	@Autowired
	private EmpAssetService as;
	
	@GetMapping("/Emp_assets")
	public List<Emp_Assets> getEmpAsset()
	{
		return this.as.getEmpAsset();	
	}
	
	@GetMapping("/Emp_assets/{id}")
	public Emp_Assets getEmpAsset(@PathVariable String id)
	{
		return this.as.getEmpAsset(Long.parseLong(id));
	}
		
	@PostMapping("/Emp_assets")
	public Emp_Assets addEmpAsset(@RequestBody Emp_Assets asset)
	{
		return this.as.addEmpAsset(asset);
	}
  
	@PutMapping("/Emp_assets")
	public Emp_Assets updateEmpAsset(@RequestBody Emp_Assets asset)
	{
		return this.as.updateEmpAsset(asset);
	}
	@DeleteMapping("/Emp_assets/{assetId}")
	public ResponseEntity<HttpStatus> deleteEmpAsset(@PathVariable String assetId){
		try {
			this.as.deleteEmpAsset(Long.parseLong(assetId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	 
}
