package in.ashok.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashok.Entity.Category;
import in.ashok.dao.CategoryDao;

@Service
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	private CategoryDao ed;
	
	

	@Override
	public List<Category> getAsset() {
		return ed.findAll();
	}
	
//	@Override
//	public Category getAsset(long id) {
//		return ed.getOne(id);
//	}
	
	@Override
	public Category addAsset(Category asset) {
		
		ed.save(asset);
		return asset;
	}

	@Override
	public Category updateAsset(Category asset) {
		
		ed.save(asset);
		return asset;
	}

	@Override
	public void deleteAsset(long id) {
		// TODO Auto-generated method stub
		//list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		ed.deleteById(id);
	}

}
