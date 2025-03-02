package com.quickservemain.bloperation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quickservemain.dtoreponse.BusinessReponse;
import com.quickservemain.dtoreponse.CategoryResponse;
import com.quickservemain.dtorequest.BusinessReq;
import com.quickservemain.dtorequest.CategoryDTO;
import com.quickservemain.entities.Business;
import com.quickservemain.entities.Categories;
import com.quickservemain.repository.CategoriesRepository;

@Service
public class CategoryBl {
	
	@Autowired
	private CategoriesRepository cr;
	
	public CategoryResponse addcategory(CategoryDTO c)
	{
		Categories cg = new Categories();
		cg.setCategoryname(c.getCategoryname());
		cr.save(cg);
		return new  CategoryResponse("success", "category saved", cg, 201);
	}
	
	public List<Categories> showCategories()
	{
		 List<Categories> l = cr.findAll();
		return l;
	}
	
	public CategoryResponse updateCategory(CategoryDTO cd,String categoryid) {
		Categories b = cr.findById(categoryid).get();
		b.setCategoryname(cd.getCategoryname());
		cr.save(b);
		return new CategoryResponse("success","category updated successfully", b, 200);	
	}
	
	public CategoryResponse deleteByCategoryId(String categoryid)
	{
		Optional<Categories> u = cr.findById(categoryid);
		if(u.isPresent())
		{
		cr.deleteById(u.get().getCategoryid());
		return new CategoryResponse("success", "category deleted successfully", u, 200);
		}
		return new CategoryResponse("failed", "failed to delete business", u, 400);
	}

}
