package com.bookSocialNetwork.book;

import jakarta.persistence.EntityNotFoundException;
import com.bookSocialNetwork.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService {

  private final BookRepository bookRepository;

  private final BookMapper bookMapper;
    public Integer save(BookRequest request, Authentication connectedUser) {
       User user = ((User) connectedUser.getPrincipal());
       Book book = bookMapper.toBook(request);
       book.setOwner(user);
       return bookRepository.save(book).getId();
    }

   public BookResponse findById(Integer bookId) {
        return bookRepository.findById(bookId)
                .map(bookMapper::toBookResponse)
                .orElseThrow(() -> new EntityNotFoundException("No book found with the ID::" + bookId));
    }

  
}
