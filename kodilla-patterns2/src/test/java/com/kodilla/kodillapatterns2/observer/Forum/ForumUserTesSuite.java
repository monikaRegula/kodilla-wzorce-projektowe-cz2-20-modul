package com.kodilla.kodillapatterns2.observer.Forum;

import com.kodilla.kodillapatterns2.observer.forum.ForumTopic;
import com.kodilla.kodillapatterns2.observer.forum.ForumUser;
import com.kodilla.kodillapatterns2.observer.forum.JavaHelpOfrumTopic;
import com.kodilla.kodillapatterns2.observer.forum.JavaToolsForumTopic;
import org.junit.Test;

import static org.junit.Assert.*;

public class ForumUserTesSuite {
    @Test
    public void testUpdate() {
        //givem
        ForumTopic javaHelpForum = new JavaHelpOfrumTopic("HELP");
        ForumTopic javaToolsForum = new JavaToolsForumTopic("TOOLS");
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser ivoneEscobar = new ForumUser("ivone Escobar");
        ForumUser jessiePinkman = new ForumUser("Jessie Pinkman");
        javaHelpForum.registerObserver(johnSmith);
        javaToolsForum.registerObserver(ivoneEscobar);
        javaHelpForum.registerObserver(jessiePinkman);
        javaToolsForum.registerObserver(jessiePinkman);
        //when
        javaHelpForum.addPost("Hi everyone!  HELP");
        javaHelpForum.addPost("Use fmmrfkr...");
        javaToolsForum.addPost("HALP pls");
        javaToolsForum.addPost("frgrg");
        javaToolsForum.addPost("ivjfefkcqf");
        //then
        assertEquals(2, johnSmith.getUpdateCount());
        assertEquals(3, ivoneEscobar.getUpdateCount());
        assertEquals(5,jessiePinkman.getUpdateCount());
    }
}
