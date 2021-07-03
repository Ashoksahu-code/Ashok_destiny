package in.ashok.Service;

import java.util.List;

import in.ashok.Entity.Emp_Assets;



public interface EmpAssetService {

	public List<Emp_Assets> getEmpAsset();
	public Emp_Assets getEmpAsset(long empId);
	public Emp_Assets addEmpAsset(Emp_Assets emp_asset);
    public Emp_Assets updateEmpAsset(Emp_Assets emp_asset);
    public void deleteEmpAsset(long parseLong);
}
