package com.github.fac30ff.rabbitmq.starter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@ConfigurationProperties(prefix = "rabbbit")
@Data
public class RabbitProperties {
  private List<String> queue;
}
