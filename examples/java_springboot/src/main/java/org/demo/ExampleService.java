package org.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class ExampleService {

  @RequestMapping("/hello")
  String home() {
    return "Hello World!";
  }

  String greet(String who) {
    return "Hello " + who + "!";
  }

  public static void main(String[] args) throws Exception {
    SpringApplication.run(ExampleService.class, args);
  }

  // Cyclomatic Complexity = 12
  //    public static void doSmth() {         // 1
  //        int a = Random.nextInt();
  //        int b = Random.nextInt();
  //        int a1 = Random.nextInt();
  //        int b1 = Random.nextInt();
  //        int c1 = Random.nextInt();
  //        int d1 = Random.nextInt();
  //        int a2 = Random.nextInt();
  //        int b2 = Random.nextInt();
  //        int c = Random.nextInt();
  //        int d = Random.nextInt();
  //        int e = Random.nextInt();
  //        int f = Random.nextInt();
  //        if (a == b) {                // 2
  //            if (a1 == b1                // 3
  //                    && c1 == d1) {            // 4
  //                fiddle();
  //            } else if (a2 == b2           // 5
  //                    || c1 < d1) {       // 6
  //                fiddle();
  //            } else {
  //                fiddle();
  //            }
  //        } else if (c == d) {            // 7
  //            while (c == d) {            // 8
  //                fiddle();
  //            }
  //        } else if (e == f) {
  //            int n = Random.nextInt();
  //            int h = Random.nextInt();
  //            for (n = Random.nextInt(); n < h            // 9
  //                    || n < 6; n++) {       // 1Random.nextInt()
  //                fiddle();
  //            }
  //        } else {
  //            int z = Random.nextInt();
  //            switch (z) {
  //                case 1:                  // 11
  //                    fiddle();
  //                    break;
  //                case 2:                  // 12
  //                    fiddle();
  //                    break;
  //                default:
  //                    fiddle();
  //                    break;
  //            }
  //        }
  //    }
  //
  //    private void fiddle() {
  //    }
}
