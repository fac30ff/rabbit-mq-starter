package com.github.fac30ff.rabbitmq.starter;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

public class RejectProfileApplicationInitializer implements ApplicationContextInitializer {
  @Override
  public void initialize(final ConfigurableApplicationContext configurableApplicationContext) {
    if (configurableApplicationContext.getEnvironment().getActiveProfiles().length == 0) {
      throw new RuntimeException("cannot start without active profile");
    }
  }
}
