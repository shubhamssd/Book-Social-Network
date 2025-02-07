package com.bookSocialNetwork.feedBack;

import com.bookSocialNetwork.book.Book;
import org.springframework.stereotype.Service;

@Service
public class FeedbackMapper {
    public FeedBack toFeedback(FeedbackRequest request) {
        return FeedBack.builder()
                .note(request.note())
                .comment(request.comment())
                .book(Book.builder()
                        .id(request.bookId())
                        .shareable(false)
                        .archived(false)
                        .build()
                )
                .build();
    }

     public FeedbackResponse toFeedbackResponse(FeedBack feedback, Integer id) {
        return FeedbackResponse.builder()
                .note(feedback.getNote())
                .comment(feedback.getComment())
                .ownFeedback(Objects.equals(feedback.getCreatedBy(), id))
                .build();
    }
}
