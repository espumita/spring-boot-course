package com.boot;

import com.boot.controller.HomeController;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class AppTest {

    @Test
    public void someTest() throws Exception {
        HomeController homeController = new HomeController();

        String content = homeController.home();

        assertThat(content, is("Hi from home"));
    }
}
