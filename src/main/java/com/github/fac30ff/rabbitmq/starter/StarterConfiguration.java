package com.github.fac30ff.rabbitmq.starter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(RabbitProperties.class)
public class StarterConfiguration {
  @Bean
  @ConditionalOnProduction
  @ConditionalOnProperty("rabbbit.queue")
  @ConditionalOnMissingBean(ApplicationListener.class)
  public RabbitListener rabbitListener(final RabbitProperties props){
    return new RabbitListener(props);
  }
}
