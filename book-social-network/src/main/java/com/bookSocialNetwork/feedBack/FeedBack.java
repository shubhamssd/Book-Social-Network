package com.bookSocialNetwork.feedBack;

import com.bookSocialNetwork.book.Book;
import com.bookSocialNetwork.common.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class FeedBack extends BaseEntity {


    private Double note;
    private String comment;

    @ManyToOne()
    @JoinColumn(name = "book_id")
    private Book book;


}
