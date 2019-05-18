package com.kodilla.kodillapatterns2.observer.Forum.homework;

import com.kodilla.kodillapatterns2.observer.homework.HomeworkQueue;
import com.kodilla.kodillapatterns2.observer.homework.Mentor;
import org.junit.Test;
import static org.junit.Assert.*;

public class HomeworkQueueTestSuite {
    @Test
    public void testUpdate(){
        //given
        HomeworkQueue homeworkQueue = new HomeworkQueue("HOMEWORK");
        Mentor jasonStatham = new Mentor("Jason Statham");
        Mentor vinDiesel = new Mentor("Vin Diesel");

        homeworkQueue.registerObserver(jasonStatham);
        homeworkQueue.registerObserver(vinDiesel);
        //when
        homeworkQueue.addHomework("kill - Cipher");
        homeworkQueue.addHomework("help - Letty");
        homeworkQueue.addHomework("kill - Riley");
        //then
        assertEquals(3,jasonStatham.getUpdateCount(),0);
    }
}
