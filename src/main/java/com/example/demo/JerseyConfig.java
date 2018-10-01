package com.example.demo;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class JerseyConfig extends ResourceConfig {

  @PostConstruct
  public void init() {
    this.register(BookResource.class);
  }
}
