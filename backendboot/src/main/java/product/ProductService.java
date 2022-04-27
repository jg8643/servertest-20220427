package product;

import java.util.List;

public interface ProductService {
	public List<ProductDTO> productlist();
	public ProductDTO product(int productcode);
	
}
