package com.condenasat.junit5play;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public final class HelloServiceImpl implements HelloService {

  @Autowired
  HelloRepository helloRepository;

  @Override
  public String get() {
    return this.helloRepository.get();
  }

}
