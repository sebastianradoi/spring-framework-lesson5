package repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
	private int id;
	private String name;
	private double price;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void addProduct(String name,double price){
		String sql = "INSERT INTO product VALUES (NULL,?,?)";
		jdbcTemplate.update(sql,name,price);
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
