package com.spring.ecommerce;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CheckHTTPResponse {
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate testrestTemplate;

    @Test
    public void shouldPassIfStringMatches(){
        assertEquals("Hello World from Spring Boot", testrestTemplate.getForObject("http://localhost:"+port+ "/",String.class ));
    }
}
