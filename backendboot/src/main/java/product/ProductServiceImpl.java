package product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("productservice")
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductDAO dao; 
	
	
	@Override
	public List<ProductDTO> productlist() {
		return dao.productlist();
	}


	@Override
	public ProductDTO product(int productcode) {
		return dao.product(productcode);
	}

	
}
