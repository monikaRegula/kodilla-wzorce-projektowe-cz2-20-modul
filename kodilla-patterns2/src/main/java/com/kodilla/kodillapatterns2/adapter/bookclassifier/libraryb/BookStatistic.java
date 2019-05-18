package com.kodilla.kodillapatterns2.adapter.bookclassifier.libraryb;

import java.util.Map;

public interface BookStatistic {
    int averagePublicationYear(Map<BookSignature,Book> books);
    int medianPublicationYear(Map<BookSignature,Book> books);

}
