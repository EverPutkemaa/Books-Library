package com.example.Book.BookLibrary.repo;

import com.example.Book.BookLibrary.model.BooksLibrary;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BooksLibraryRepo extends JpaRepository<BooksLibrary, Long> {

    void deleteBooksLibraryById(Long id);

    Optional<BooksLibrary> findBooksLibraryById(Long id);

}
