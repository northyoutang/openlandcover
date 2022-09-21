package com.csu;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;

@SpringBootTest
class OpenlandcoverApplicationTests {

    @Test
    public void test1() {
        Random random = new Random();
        for (int i = 0; i < 99999; i++) {
            System.out.println(random.nextInt(9999));
        }
    }

}
