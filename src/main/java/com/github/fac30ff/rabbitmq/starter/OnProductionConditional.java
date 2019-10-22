package com.github.fac30ff.rabbitmq.starter;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class OnProductionConditional implements Condition {
  @Override
  public boolean matches(final ConditionContext conditionContext, final AnnotatedTypeMetadata annotatedTypeMetadata) {
    return "prod".equals(conditionContext.getEnvironment().getActiveProfiles());
  }
}
