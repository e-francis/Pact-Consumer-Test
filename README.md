# Pact Consumer Test

## Introduction
Pact Consumer Test is a project that facilitates contract testing for RESTful APIs using the Pact framework. Contract testing is a technique used in software development to ensure that the interactions between different systems or components are in accordance with agreed-upon contracts or specifications. The Pact framework provides a simple and effective way to write and execute contract tests for APIs.

This project provides a sample implementation of a consumer (client) for contract testing using Pact. It allows you to define the expected interactions with a provider (server) API and automatically generates the corresponding Pact contract files, which can be used to validate the interactions with the provider.

## Features
- Contract testing for RESTful APIs using the Pact framework.
- Easy setup and configuration for defining consumer interactions and generating Pact contract files.
- Support for different programming languages and frameworks.
- Detailed logging and reporting for test results.
- Supports Pact Broker for versioning and publishing Pact contract files.

## Requirements
To use Pact Consumer Test, you will need the following:

- A RESTful API provider that you want to test.
- A test framework or library for your programming language or framework of choice.
- Pact library for your programming language or framework (e.g., Pact-JVM, Pact-Ruby, Pact-JS, etc.).
- Pact Broker (optional) for versioning and publishing your Pact contract files (e.g., Pactflow, Pact Broker API, etc.).

## Getting Started
To start using Pact Consumer Test, follow these steps:

1. Clone the repository from GitHub: `git clone https://github.com/e-francis/Pact-Consumer-Test.git`.
2. Install the dependencies required for your programming language or framework. Refer to the documentation of the Pact library for your chosen language or framework for installation instructions.
3. Configure the Pact Consumer Test settings, such as the provider name, API endpoint, and Pact Broker details (if used). Update the configuration file according to your requirements.
4. Define the expected interactions with the provider API in the test files. These interactions will be used to generate the Pact contract files.
5. Execute the tests using your preferred test runner or framework. The tests will send requests to the provider API and verify the responses against the expected interactions.
6. Review the test results and generated Pact contract files. If the tests pass, the Pact contract files will be generated in the specified output directory. If the tests fail, investigate and fix the issues before re-running the tests.
7. Publish the generated Pact contract files to a Pact Broker (optional) for versioning and sharing with providers (servers) of your API. This step is recommended if you have multiple consumers that need to validate their interactions with the provider.

## Configuration
Pact Consumer Test provides a configuration file (`pom.xml`) that you can update to configure various settings for your consumer tests.

## Writing Tests
Pact Consumer Test uses JUnit5 framework or library for writing the tests.
