package com.condenasat.junit5play;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

  public static void main(final String[] args) {
    SpringApplication.run(Application.class, args);
  }

  // @Bean
  // public CommandLineRunner commandLineRunner(final ApplicationContext ctx) {
  // return args -> {
  // // final String[] beanNames = ctx.getBeanDefinitionNames();
  // // Arrays.sort(beanNames);
  // // for (final String beanName : beanNames) {
  // // System.out.println(beanName);
  // // }
  // };
  // }

}
