
package in.ashok.dao;

//import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;

import in.ashok.Entity.Employees;


public interface EmployeeDao extends MongoRepository<Employees, Long>{
	//Employees findById(String id);
   

}
