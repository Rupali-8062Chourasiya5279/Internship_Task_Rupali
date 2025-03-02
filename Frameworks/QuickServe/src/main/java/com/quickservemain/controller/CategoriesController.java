package com.quickservemain.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quickservemain.bloperation.CategoryBl;
import com.quickservemain.bloperation.SubcategoryBl;
import com.quickservemain.dtoreponse.BusinessReponse;
import com.quickservemain.dtoreponse.CategoryResponse;
import com.quickservemain.dtoreponse.SubcategoryResponse;
import com.quickservemain.dtorequest.BusinessReq;
import com.quickservemain.dtorequest.CategoryDTO;
import com.quickservemain.dtorequest.SubcategoryDto;
import com.quickservemain.entities.Business;
import com.quickservemain.entities.Categories;
import com.quickservemain.entities.SubCategories;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class CategoriesController {
	
	@Autowired
	private CategoryBl cbl;
	@Autowired
	private SubcategoryBl sbl;
	
	@PostMapping("/categories")
	public ResponseEntity<?> addCategories( @Valid @RequestBody CategoryDTO c)
	{
		CategoryResponse br = cbl.addcategory(c);
		return ResponseEntity.status(HttpStatus.OK).body(br);
	}
	
	@GetMapping("/categories")
	public ResponseEntity<?> showCategories()
	{
		List<Categories> l = cbl.showCategories();
		if(l!=null)
		{
			return ResponseEntity.status(HttpStatus.FOUND).body(new CategoryResponse("success","watching business successfully", l, 200));
		}
		else
		return ResponseEntity.status(HttpStatus.FOUND).body(new CategoryResponse("failed","failed to fetch", l, 400));
	}
	
	@PutMapping("/categories/{categoryid}")
	public ResponseEntity<?> updateById(@RequestBody CategoryDTO cd,@PathVariable String categoryid)
	{
		 CategoryResponse c = cbl.updateCategory(cd,categoryid);
		 return ResponseEntity.status(HttpStatus.OK).body(c);
	}
	
	@DeleteMapping("/categories/{categoryid}")
	public ResponseEntity<?> deleteCategory(@PathVariable String categoryid)
	{
		CategoryResponse br = cbl.deleteByCategoryId(categoryid);
		return ResponseEntity.status(HttpStatus.OK).body(br);
		
	}
	
	@PostMapping("/categories/{categoryid}/subcategories")
	public ResponseEntity<?> addSubcategory(@PathVariable String categoryid,@RequestBody SubcategoryDto sc)
	{
		System.out.println(categoryid);
		System.out.println(sc.getSubcategoryname());
		 SubCategories s = sbl.addSubcategory(categoryid,sc);
		 return ResponseEntity.status(HttpStatus.OK).body(new SubcategoryResponse("success", "subcategory saved successfully", s, 200));
	}

}
