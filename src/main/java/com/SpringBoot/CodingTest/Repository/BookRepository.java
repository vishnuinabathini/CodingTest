package com.SpringBoot.CodingTest.Repository;

import com.SpringBoot.CodingTest.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
