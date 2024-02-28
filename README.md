# Java Kafka Clients Testing
Java sample code to interact with kafka server.

It was initially designed to interact with local kafka server, but you can edit the samples to connect to any other kafka server.

## What code is provided?
- CreateTopic.java
  - used to create a new topic
- SimpleConsumer.java
  - used to consume records from specified topic
- SimpleProducer.java
  - used to produce 10 records on specified topic

## How to test in Visual Studio Code?
If you are using Visual Studio Code, there's a `launch.json` provided on `.vscode` folder to make it easier to run.
You should edit the `"args"` field to match the topic name that you want to use.
By default it's set as: `rider-updates`
![launch.json](/Readme/launch_json.png)

Just open the project folder and Run the desired test code.
Like the following:
![Run java code](/Readme/Run_java_code_vs_code.png)

## Note
Do not forget to download the dependencies needed (**kafka-clients** from **org.apache.kafka**).
![Maven Install](/Readme/maven_install.png)

## Credits
This work was based on the samples provided here: [Apache Kafka - Simple Producer Example](https://www.tutorialspoint.com/apache_kafka/apache_kafka_simple_producer_example.htm)
