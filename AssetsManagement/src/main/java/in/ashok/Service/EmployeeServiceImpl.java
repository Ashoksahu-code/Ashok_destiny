package in.ashok.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import in.ashok.Entity.Employees;
import in.ashok.dao.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDao ed;
	
	List<Employees> list;
//	public EmployeeServiceImpl() {
//		list = new ArrayList<>();
//		list.add(new Employees(1,"Sam","Java Developer"));
//		list.add(new Employees(2,"Amit","Python Developer"));
//		list.add(new Employees(3,"Jenny","Spring Developer"));
//
//	}

	@Override
	public List<Employees> getEmp() {
		return ed.findAll();
	}
	
//	@Override
//	public Employees getEmp(long empId) {
//		return ed.findOne(empId);
//	}
	
	@Override
	public Employees addEmp(Employees employee) {
		//list.add(course);
		ed.save(employee);
		return employee;
	}

	@Override
	public Employees updateEmp(Employees employee) {
		// TODO Auto-generated method stub
//		list.forEach(e ->{
//			if(e.getId() == course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDes(course.getDes());
//			}
//		});
		ed.save(employee);
		return employee;
	}

	@Override
	public void deleteEmp(long id) {
		// TODO Auto-generated method stub
		//list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		ed.deleteById(id);
	}


}
