package org.demo;

import org.demo.test.categories.UnitTests;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;

@Category(UnitTests.class)
public class HelloUnitTest {


  @Test
  public void testGreeting() throws Exception {
    final ExampleService service = new ExampleService();
    final String greet = service.greet("toto");
    assertEquals("Hello toto!", greet);
  }
}
