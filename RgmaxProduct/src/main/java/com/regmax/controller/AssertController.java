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

import com.regmax.model.Asserts;
import com.regmax.model.Category;
import com.regmax.repo.AssertRepository;

public class AssertController {
	@Autowired
	private AssertRepository assertrepository;
	
	 private static Logger logger= (Logger) LoggerFactory.logger(AssertController.class);

		@PostMapping("/assert")
		public ResponseEntity<Asserts> category(@RequestBody Asserts asserts){
			
			asserts = assertrepository.save(asserts);
			return ResponseEntity.ok(asserts);
		}
		
		@GetMapping("/getAssert")
		public ResponseEntity<List<Asserts>> getCategory(){
			List<Asserts> getListCate = assertrepository.findAll();
			logger.info("get all catetory from categorycontroller");
	       return ResponseEntity.ok(getListCate);
		}
		
		@GetMapping("/findById") //tumhe find by name kar
		public ResponseEntity<Asserts> getCategoryByName(@PathVariable Long id){
			Asserts category = assertrepository.getOne(id);
			logger.info("find by name all sucessful by id ");
			return (ResponseEntity<Asserts>) ResponseEntity.ok(); 
		}
}
