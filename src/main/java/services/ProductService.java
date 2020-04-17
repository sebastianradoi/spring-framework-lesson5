package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

//	@Transactional //rolls back RuntimeException but not Checked Exception
	@Transactional(rollbackFor = Exception.class)
	public void addOneProduct(String name, double price){
		productRepository.addProduct(name,price);
//		throw new RuntimeException(":(");
	}
}
