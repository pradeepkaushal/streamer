#!/usr/bin/env bash
gradle fatJar
java -jar build/libs/twitter-streamer-all.jar