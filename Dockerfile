# syntax=docker/dockerfile:experimental
# Use openjdk 17-jdk-alpine as the base image
FROM gradle:7.5.0-jdk17-alpine
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build test --no-daemon ; exit 0

