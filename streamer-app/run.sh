#!/usr/bin/env bash

gradle clean build install
java -jar build/libs/twitter-stream-0.1.0.jar

#java -Dspring.config.location=target/application.properties -jar target/myproject-0.0.1-SNAPSHOT.jar