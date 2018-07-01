package org.ionut.web;

import java.util.List;

import javax.jws.WebService;

import org.ionut.web.business.ProductServiceImpl;
import org.ionut.web.model.Product;

@WebService(endpointInterface="org.ionut.web.ProductCatalogInterface", portName="TestMartCatalogPort", serviceName="TestMartCatalogService")
public class ProductCatalog implements ProductCatalogInterface {
	
	ProductServiceImpl productService = new ProductServiceImpl();

	/* (non-Javadoc)
	 * @see org.ionut.web.ProductCatalogInterface#getProductCategories()
	 */
	@Override
	public List<String> getProductCategories(){
		return productService.getProductCategories();
	}
	
	/* (non-Javadoc)
	 * @see org.ionut.web.ProductCatalogInterface#getProducts(java.lang.String)
	 */
	@Override
	public List<String> getProducts(String category){
		return productService.getProducts(category);
	}
	
	/* (non-Javadoc)
	 * @see org.ionut.web.ProductCatalogInterface#addProduct(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean addProduct(String category, String product) {
		return productService.addProduct(category, product);
	}
	
	/* (non-Javadoc)
	 * @see org.ionut.web.ProductCatalogInterface#getProductsV2(java.lang.String)
	 */
	@Override
	public List<Product> getProductsV2(String category){
		return productService.getProductsV2(category);
	}
}
