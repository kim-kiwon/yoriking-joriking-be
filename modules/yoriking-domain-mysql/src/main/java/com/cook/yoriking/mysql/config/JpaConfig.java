package com.cook.yoriking.mysql.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing // AuditingListener들 동작시킴
public class JpaConfig {
}
