package com.quickservemain.bloperation;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.quickservemain.dtorequest.SubcategoryDto;
import com.quickservemain.entities.Categories;
import com.quickservemain.entities.SubCategories;
import com.quickservemain.repository.CategoriesRepository;
import com.quickservemain.repository.SubCategoriesRepository;


@Service
public class SubcategoryBl {
	
	@Autowired
	private SubCategoriesRepository scr;
	
	@Autowired
	private CategoriesRepository crepo;
	
	public SubCategories addSubcategory(String categoryid,SubcategoryDto sc) 
	{
		System.out.println(categoryid);
		System.out.println(sc.getSubcategoryname());
		 Optional<Categories> c = crepo.findById(categoryid);
//		 Categories c1=c.get();
//		 System.out.println(c1);
		 if(c.isPresent())
		 {
			 SubCategories s = new SubCategories();
			 Categories c1=c.get();
			 s.setCategoryid(c1);
			 s.setSubcategoryname(sc.getSubcategoryname());
			 return scr.save(s);
		 }
		 return null;
	}

}
