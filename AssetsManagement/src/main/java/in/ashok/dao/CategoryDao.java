package in.ashok.dao;



import in.ashok.Entity.Category;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CategoryDao extends MongoRepository<Category, Long>{
	
}
