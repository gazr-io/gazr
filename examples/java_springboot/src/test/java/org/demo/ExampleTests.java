package org.demo;

import org.demo.test.categories.FunctionalTests;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;

@Category(FunctionalTests.class)
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
