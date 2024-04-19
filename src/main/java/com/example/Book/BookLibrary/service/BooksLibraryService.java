package com.example.Book.BookLibrary.service;

import com.example.Book.BookLibrary.exception.UserNotFoundException;
import com.example.Book.BookLibrary.model.BooksLibrary;
import com.example.Book.BookLibrary.repo.BooksLibraryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class BooksLibraryService {

    private final BooksLibraryRepo booksLibraryRepo;
    @Autowired
    public BooksLibraryService(BooksLibraryRepo booksLibraryRepo){
        this.booksLibraryRepo = booksLibraryRepo;
    }

     //adding new booksLibrary
    public BooksLibrary addBook(BooksLibrary booksLibrary){
        return booksLibraryRepo.save(booksLibrary);
    }
    //Finding all booksLibrary
    public List<BooksLibrary> findAllBooksLibrary(){
        return booksLibraryRepo.findAll();
    }
    //Updating booksLibrary
    public BooksLibrary updateBook(BooksLibrary booksLibrary){
        return booksLibraryRepo.save(booksLibrary);

    }
    //Find books by ID
    public BooksLibrary findBooksLibraryById(Long id){
        return booksLibraryRepo.findBooksLibraryById(id).orElseThrow(
                () -> new UserNotFoundException("user by id " + id + " not found! ")
        );
    }

    //Delete books
    public void deleteBooksLibrary(Long id){
        booksLibraryRepo.deleteBooksLibraryById(id);
    }
}
