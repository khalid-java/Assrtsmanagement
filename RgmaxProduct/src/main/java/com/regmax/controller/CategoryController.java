package com.regmax.controller;

import java.util.List;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.regmax.model.Category;
import com.regmax.repo.CategoryRepository;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
     private static Logger logger= (Logger) LoggerFactory.logger(CategoryController.class);

	@PostMapping("/cate")
	public ResponseEntity<Category> category(@RequestBody Category category){
		
		Category categor = categoryRepository.save(category);
		return ResponseEntity.ok(categor);
	}
	
	@GetMapping("/getCate")
	public ResponseEntity<List<Category>> getCategory(){
		List<Category> getListCate = categoryRepository.findAll();
		logger.info("get all catetory from categorycontroller");
       return ResponseEntity.ok(getListCate);
	}
	
	@GetMapping("/findById") //tumhe find by name kar
	public ResponseEntity<Category> getCategoryByName(@PathVariable Long id){
		Category category = categoryRepository.getOne(id);
		logger.info("find by name all sucessful by id ");
		return (ResponseEntity<Category>) ResponseEntity.ok(); 
	}
	
}
