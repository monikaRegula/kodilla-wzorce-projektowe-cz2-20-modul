package com.kodilla.kodillapatterns2.observer.forum;

public interface Observable {
    void registerObserver(Observer observer);//subskrypcja
    void notifyObserver();//powiadomienia o zmianach
    void removeObserver(Observer observer);//desubskrypcja
}
