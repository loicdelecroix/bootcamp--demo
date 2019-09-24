# Old API (i.e. a SOAP API)

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
curl -X POST \
  http://localhost:8080/ws \
  -H 'Content-Type: text/xml' \
  -H 'cache-control: no-cache' \
  -d '<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:gs="http://spring.io/guides/gs-producing-web-service">
    <soapenv:Header/>
    <soapenv:Body>
        <gs:getCountryRequest>
            <gs:name>Spain</gs:name>
        </gs:getCountryRequest>
    </soapenv:Body>
</soapenv:Envelope>'
```