# Spring Boot multi-module demo

### Overview
This project shows how Spring Boot can be used to create a common (component) library
that can be shared and 'wired' into Spring Boot applications (One and Two).

This project also shows how Spring Boot can be used to run integration tests, including common integration tests
across both applications 

## Project structure (modules):
- demo-common-lib
  - A library containing common Spring components
- demo-one-app
  - A Spring Boot Application that depends on common components
- demo-two-app
   - A Spring Boot Application that depends on common components
- demo-integration-tests
   - An integration test module that uses Spring Boot to test modules
   - Depends on both demo-one-app and demo-two-app, Spring Boot applications One and Two respectively
    
## Comments
- We make use of the property `spring.config.name` to specify a unique property configuration name
so that the common integration tests module, which includes both applications contains
  unique property file names on the class path
