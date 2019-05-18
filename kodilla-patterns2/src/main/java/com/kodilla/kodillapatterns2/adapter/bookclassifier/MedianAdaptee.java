package com.kodilla.kodillapatterns2.adapter.bookclassifier;

import com.kodilla.kodillapatterns2.adapter.bookclassifier.libraryb.Book;
import com.kodilla.kodillapatterns2.adapter.bookclassifier.libraryb.BookSignature;
import com.kodilla.kodillapatterns2.adapter.bookclassifier.libraryb.BookStatistic;
import com.kodilla.kodillapatterns2.adapter.bookclassifier.libraryb.Statistics;

import java.util.Map;

public class MedianAdaptee  implements BookStatistic {
    @Override
    public int averagePublicationYear(Map<BookSignature, Book> books) {
        Statistics statistics = new Statistics();
        return statistics.averagePublicationYear(books);
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, Book> books) {
        Statistics statistics = new Statistics();
        return statistics.medianPublicationYear(books);
    }
}
