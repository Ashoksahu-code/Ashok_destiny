package in.ashok.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import in.ashok.Entity.Emp_Assets;

@Service
public class EmpAssetServiceImpl implements EmpAssetService{

	List<Emp_Assets> list;
	
	public EmpAssetServiceImpl()
	{
		list = new ArrayList<>();
		list.add(new Emp_Assets(2,"Amit","Laptop","Electronics","2 jan 2020","Available","Good"));
		list.add(new Emp_Assets(21,"Samrat","Laptop","Electronics","4 jan 2020","Not Available","Low"));
		list.add(new Emp_Assets(24,"Jenny","Table","Furniture","5 jan 2020","Available","not Good"));
		list.add(new Emp_Assets(32,"Sem","Laptop","Electronics","29 jan 2020","Available","Good"));
	}

	@Override
	public List<Emp_Assets> getEmpAsset() {
		
		return list;
	}

	@Override
	public Emp_Assets getEmpAsset(long empId) {
		
		Emp_Assets a = null;
		for(Emp_Assets c:list) {
			if(c.getId()==empId) {
				a=c;
				break;
			}
		}
		
		return a;
	}

	@Override
	public Emp_Assets addEmpAsset(Emp_Assets emp_asset) {
		list.add(emp_asset);
		return emp_asset;
	}

	@Override
	public Emp_Assets updateEmpAsset(Emp_Assets emp_asset) {
		list.forEach(e->{
			if(e.getId()==emp_asset.getId()) {
				e.setName(emp_asset.getName());
				e.setAsset(emp_asset.getAsset());
				e.setType(emp_asset.getType());
				e.setDate(emp_asset.getDate());
				e.setStatus(emp_asset.getStatus());
				e.setCondition(emp_asset.getCondition());
				
			}
		});
		return emp_asset;
	}

	@Override
	public void deleteEmpAsset(long parseLong) {
		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		
	}
	
	
}
