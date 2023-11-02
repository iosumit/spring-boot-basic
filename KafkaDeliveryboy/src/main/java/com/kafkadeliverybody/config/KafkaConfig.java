package com.kafkadeliverybody.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;

public class KafkaConfig {

    @Bean
    public NewTopic topic() {
        System.out.println("Topic build");
        return TopicBuilder
                .name(AppConstants.LOCATION_TOPIC_NAME)
                // .partitions(0)
                // .replicas(0)
                .build();
    }
}
