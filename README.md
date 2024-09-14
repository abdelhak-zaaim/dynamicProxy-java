# Dynamic Proxy Examples in Java

This repository contains examples and use cases of dynamic proxies in Java. The examples demonstrate how to use dynamic proxies for various purposes such as logging, security, and caching.

## Table of Contents

- [Introduction](#introduction)
- [Examples](#examples)
  - [Basic Dynamic Proxy](#basic-dynamic-proxy)
  - [Logging Proxy](#logging-proxy)
  - [Security Proxy](#security-proxy)
  - [Caching Proxy](#caching-proxy)
- [Setup](#setup)
- [Usage](#usage)
- [License](#license)

## Introduction

Dynamic proxies in Java allow you to create proxy instances at runtime. This can be useful for various purposes such as logging, security checks, and caching. This repository provides examples of how to implement and use dynamic proxies in Java.

## Examples

### Basic Dynamic Proxy

A simple example demonstrating how to create and use a basic dynamic proxy.

### Logging Proxy

An example of a proxy that logs method calls before and after they are invoked.

### Security Proxy

An example of a proxy that performs security checks before invoking methods.

### Caching Proxy

An example of a proxy that caches the results of method calls to improve performance.

## Setup

1. Clone the repository:
    ```sh
    git clone https://github.com/abdelhak-zaaim/dynamicProxy-java.git
    cd dynamicProxy-java
    ```

2. Build the project using Maven:
    ```sh
    mvn clean install
    ```

## Usage

To run the examples, navigate to the respective directories and execute the `Main` class. For example, to run the logging proxy example:

```sh
cd src/main/java/com/zaaim/logging
java Main