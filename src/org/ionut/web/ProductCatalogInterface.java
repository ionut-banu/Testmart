package org.ionut.web;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.ionut.web.model.Product;

@WebService(name="TestMartCatalog", targetNamespace="http://www.testmart.com")
public interface ProductCatalogInterface {

	@WebMethod(action="fetch_categories", operationName="fetchCategories")
	List<String> getProductCategories();

	@WebMethod
	List<String> getProducts(String category);

	@WebMethod
	boolean addProduct(String category, String product);

	@WebMethod
	@WebResult(name="Product")
	List<Product> getProductsV2(String category);

}