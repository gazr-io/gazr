package org.demo;

import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;

public class ExampleTests {

  private final WebTestClient client = WebTestClient.bindToController(new ExampleService()).build();

  @Test
  public void testCount() throws Exception {
    this.client
        .get()
        .uri("/hello")
        .accept(MediaType.ALL)
        .exchange()
        .expectStatus()
        .isOk()
        .expectBody(String.class)
        .isEqualTo("Hello World!");
  }
}
