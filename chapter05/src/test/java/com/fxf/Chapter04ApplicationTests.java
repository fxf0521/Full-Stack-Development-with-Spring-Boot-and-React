package com.fxf;

import com.fxf.web.CarController;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class Chapter04ApplicationTests {
    @Autowired
    private CarController controller;

    @Test
    @DisplayName("First example test case")
    void contextLoads() {
        assertThat(controller).isNotNull();
    }

}
