package product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ProductController {

	@Autowired
	ProductServiceImpl service;
		
	@RequestMapping(value="/productlist", method = RequestMethod.GET)
	public ModelAndView productlist() {		
		ModelAndView mv = new ModelAndView();
		List<ProductDTO> list = service.productlist();
		mv.addObject("productlist", list);
		mv.setViewName("product/productlist");
		return mv;
	}
	
	@RequestMapping(value="/product", method = RequestMethod.GET)
	public ModelAndView product(int productcode) {		
		ModelAndView mv = new ModelAndView();
		ProductDTO dto = service.product(productcode);
		mv.addObject("product", dto);
		mv.setViewName("product/product");
		return mv;
	}
		
}
