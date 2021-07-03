package in.ashok.Service;

import in.ashok.Entity.Employees;
import java.util.List;

public interface EmployeeService {

	public List<Employees> getEmp();
	//public Employees getEmp(long empId);
	public Employees addEmp(Employees employee);
    public Employees updateEmp(Employees employee);
    public void deleteEmp(long parseLong);
    
    

}
