package com.example;

import java.util.Properties;
import java.util.Arrays;

import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.NewTopic;

public class CreateTopic {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.out.println("Enter topic name");
            return;
        }
        // Kafka consumer configuration settings
        String topicName = args[0].toString();
        Properties props = new Properties();

        props.put("bootstrap.servers", "localhost:9092");
        props.put("group.id", "test");
        props.put("enable.auto.commit", "true");
        props.put("auto.commit.interval.ms", "1000");
        props.put("session.timeout.ms", "30000");
        props.put("key.deserializer",
                "org.apache.kafka.common.serialization.StringDeserializer");
        props.put("value.deserializer",
                "org.apache.kafka.common.serialization.StringDeserializer");

        AdminClient adminClient = AdminClient.create(props);
        adminClient.createTopics(Arrays.asList(new NewTopic(topicName, 1, (short) 1)));
    }
}