package com.quickservemain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quickservemain.entities.Categories;

public interface CategoriesRepository extends JpaRepository<Categories, String> {

}
