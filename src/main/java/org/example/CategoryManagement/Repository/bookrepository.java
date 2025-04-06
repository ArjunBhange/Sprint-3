package org.example.CategoryManagement.Repository;

import org.example.CategoryManagement.Entity.book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface bookrepository extends JpaRepository <book,Long>{
}
