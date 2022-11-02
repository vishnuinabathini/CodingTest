package com.SpringBoot.CodingTest.Service;

import com.SpringBoot.CodingTest.Entity.Book;
import com.SpringBoot.CodingTest.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository repository;
    public String saveBookDetails(Book book){
        repository.save(book);
        return "Book is saved!!!"+book;    }
    public List<Book> saveBooksDetails(List<Book> books){
        return repository.saveAll(books);
    }
    public List<Book> getBookDetails(){
        return repository.findAll();
    }
    public String deleteBookDetails(int bookId){
        repository.deleteById(bookId);
        return "Book Details Removed !!" +bookId;
    }
    public Book updateBookDetails(Book book){
        Book existingBook= repository.findById(book.getBookId()).orElse(null);
        existingBook.setTitle(book.getTitle());
        existingBook.setBookId(book.getBookId());
        existingBook.setPrice(book.getPrice());
        existingBook.setPublisher(book.getPublisher());
        existingBook.setPublishedYear(book.getPublishedYear());
        existingBook.setAuthorName(book.getAuthorName());
        return repository.save(existingBook);
    }
}
