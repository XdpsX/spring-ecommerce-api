package com.ecommerce.demo.repository;

import com.ecommerce.demo.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Integer> {
}
