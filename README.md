# About the project
This is a simple REST API which exposes 5 GET endpoints which take text data as a request parameter.
- /api/is-word    
[returns true/false if string is a single word]
- /api/is-number  
[returns true/false if string is a number]
- /api/is-lower   
[returns true/false if string is a lowercase word]
- /api/is-upper   
[returns true/false if string is an uppercase word]
- /api/statistics   
[returns json with statistics containg flags above and number of occurrences of certain character types]

## Tech stack
- Spring Boot 2.5.5
- Java 11

## Building the project
Clone the project and use Maven to build the app.
```
$ mvn clean install
```

## Examples of use
After you deploy the application you can send requests as follows:

Request #1:
```
GET http://localhost:8080/api/is-word?data=eXAMPLE12$
```
Response #1:
```
HTTP 200 OK
false
```
Request #2:
```
GET http://localhost:8080/api/statistics?data=eXAMPLE12$
```
Response #2:
```
HTTP 200 OK
{
    "isWord": false,
    "isNumber": false,
    "isLower": false,
    "isUpper": false,
    "characterCount": 10,
    "letterCount": 7,
    "digitCount": 2,
    "lowercaseLetterCount": 1,
    "uppercaseLetterCount": 6,
    "whitespaceCount": 0,
    "specialCharactersCount": 1
}
```

where eXAMPLE12$ is any textual data
