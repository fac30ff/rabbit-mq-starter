package com.github.fac30ff.rabbitmq.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;

public class ProfilesEPP implements EnvironmentPostProcessor {
  @Override
  public void postProcessEnvironment(final ConfigurableEnvironment environment, final SpringApplication application) {
    environment.addActiveProfile("rabbitIsHere");
  }
}
