package com.SpringBoot.CodingTest.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Books_Table")
public class Book {
    @Id
    @GeneratedValue
    private int bookId;
    private String title;
    private String authorName;
    private LocalDate publishedYear;
    private String publisher;
    private long isbn;
    private int price;



    }


