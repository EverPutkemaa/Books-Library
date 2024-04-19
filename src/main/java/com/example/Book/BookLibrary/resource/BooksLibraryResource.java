package com.example.Book.BookLibrary.resource;

import com.example.Book.BookLibrary.model.BooksLibrary;
import com.example.Book.BookLibrary.service.BooksLibraryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books-library")
public class BooksLibraryResource {

    private final BooksLibraryService booksLibraryService;

    public BooksLibraryResource(BooksLibraryService booksLibraryService){
        this.booksLibraryService = booksLibraryService;
    }

    //Read all booksLibrary
    @GetMapping("/all")
    public ResponseEntity<List<BooksLibrary>> getAllBooksLibrary(){
        List<BooksLibrary> booksLibrary = booksLibraryService.findAllBooksLibrary();
        return new ResponseEntity<>(booksLibrary, HttpStatus.OK);
    }


    //Find booksLibrary by id
    @GetMapping("find/{id}")
      public ResponseEntity<BooksLibrary> getBooksLibraryById(@PathVariable("id") Long id){
        BooksLibrary booksLibrary = booksLibraryService.findBooksLibraryById(id);
        return new ResponseEntity<>(booksLibrary, HttpStatus.OK);
    }
    //add new booksLibrary
    @PostMapping("/add")
    public ResponseEntity<BooksLibrary> addBooksLibrary(@RequestBody BooksLibrary booksLibrary){
        BooksLibrary newBooksLibrary = booksLibraryService.addBook(booksLibrary);
        return new  ResponseEntity<>(newBooksLibrary, HttpStatus.CREATED);
    }
    //Update BooksLibrary
    @PutMapping("/update")
    public ResponseEntity<BooksLibrary>  updateBooksLibrary(@RequestBody BooksLibrary booksLibrary){
        BooksLibrary newBooksLibrary = booksLibraryService.updateBook(booksLibrary);
        return new  ResponseEntity<>(newBooksLibrary, HttpStatus.OK);
    }
    //Delete BooksLibrary

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteBooksLibrary(@PathVariable("id")Long id){
        booksLibraryService.deleteBooksLibrary(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}














