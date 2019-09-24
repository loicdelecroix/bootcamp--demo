# New API (i.e. a REST API)

## Launch the project
Use your favorite IDE, and launch the Spring Boot application threw **Application.java**

## Build Docker image
Docker image is build threw Maven :

```
mvn install dockerfile:build
```

## Accessing the API
You can access the API threw http://localhost:8080/country

## Curl example

```
curl -X GET \
  'http://localhost:8080/country?name=Spain' \
  -H 'Content-Type: application/json' \
  -H 'cache-control: no-cache'
```