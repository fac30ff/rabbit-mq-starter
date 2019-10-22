package com.github.fac30ff.rabbitmq.starter;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

@Data
@RequiredArgsConstructor
public class RabbitListener implements ApplicationListener<ContextRefreshedEvent> {

  private final RabbitProperties properties;

  @Override
  public void onApplicationEvent(final ContextRefreshedEvent event) {
    properties.getQueue().forEach(System.out::println);
    System.out.println("sending event" + event);
  }
}
