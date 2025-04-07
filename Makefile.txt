# Makefile

# Default target to run tests
.PHONY: all test clean build deploy

# Build the project using Maven
build:
    mvn clean install

# Run the tests
test:
    mvn test

# Clean the project
clean:
    mvn clean

# Custom deploy target (optional)
deploy:
    echo "Deploying application..."
