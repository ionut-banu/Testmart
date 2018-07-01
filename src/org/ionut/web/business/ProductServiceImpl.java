package org.ionut.web.business;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl {
	
	List<String> bookList = new ArrayList<>();
	List<String> musicList = new ArrayList<>();
	List<String> movieList = new ArrayList<>();
	
	public ProductServiceImpl() {
		bookList.add("Inferno");
		bookList.add("Joyland");
		bookList.add("The Game of Thrones");
		
		musicList.add("Random Access Memories");
		musicList.add("Night Visions");
		musicList.add("Unorthodox Jukebox");
		
		movieList.add("Oz the Great and Powerful");
		movieList.add("Despicable Me");
		movieList.add("Star Trek Into Darkness");
		
	}

	public List<String> getProductCategories(){
		List<String> categories = new ArrayList<>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		return categories;
	}
	
	public List<String> getProducts(String category){
		switch (category.toLowerCase()) {
		case "books":
			return bookList;
		case "music":
			return musicList;
		case "movies":
			return movieList;
		}
		return null;
	}
}
