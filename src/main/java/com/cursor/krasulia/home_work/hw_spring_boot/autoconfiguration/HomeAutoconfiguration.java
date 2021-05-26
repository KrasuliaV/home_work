package com.cursor.krasulia.home_work.hw_spring_boot.autoconfiguration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Configuration
//@ConditionalOnClass(ConfigurationEnabler.class)
@ConditionalOnClass(name = "com.cursor.krasulia.home_work.hw_spring_boot.myconfiguration.ConfigurationEnabler")
@ConditionalOnProperty(prefix = "custom.configuration", name = "enabled", havingValue = "true")
public class HomeAutoconfiguration {

    @Bean
    public void homeConfigurationBean() {
        System.out.printf("%s %sWas created home configuration%s%n",
                LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss:ms")),
                "\033[1;92m",
                "\033[0m");
    }
}
