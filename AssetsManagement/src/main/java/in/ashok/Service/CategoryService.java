package in.ashok.Service;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import in.ashok.Entity.Category;

@Document(collection="AssetData")
public interface CategoryService {
	
	public List<Category> getAsset();
	//public Category getAsset(long parseLong);
	public Category addAsset(Category asset);
    public Category updateAsset(Category asset);
    public void deleteAsset(long parseLong);

}
