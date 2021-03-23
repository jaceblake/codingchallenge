Um die Projekt bilden zu können, müssen maven und Java installiert sein

Maven 3.6 und Java 11 bitte zuerst installieren.

Projekt bauen mit Maven.

`mvn clean install`

Anwendung starten mit Maven

`mvn spring-boot:run`

Danach kann man REST Anfrage senden. 

Anfrage 1 Search Food Items:

GET http://localhost:8080/vilua-codingchallenge/v1/search-food-items/?query=pasta


Anfrage 2 Get Food Item:

GET http://localhost:8080/vilua-codingchallenge/v1/search-food/?id=285243
