package com.condenasat.junit5play;

import org.springframework.stereotype.Repository;

@Repository
public final class HelloRepositoryImpl implements HelloRepository {

  @Override
  public String get() {
    return "Hello JUnit 5";
  }

}
