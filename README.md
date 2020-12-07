# rxia-test-v8-extension


 # go to quarkus-rxia-parent<br/>
 mvn install<br/>
 mvn clean test<br/>

 make sure org.acme:quarkus-rxia:1.0-SNAPSHOT.jar installed in your local<br/>

 # Then go to greeting-app<br/>

 ./mvnw quarkus:remove-extension -Dextensions="org.acme:quarkus-rxia:1.0-SNAPSHOT"<br/>
 ./mvnw quarkus:add-extension -Dextensions="org.acme:quarkus-rxia:1.0-SNAPSHOT"<br/>
 start the server<br/>
 mvn clean compile quarkus:dev<br/>

# Test url 
 go to another terminal <br/>
 curl -X POST http://localhost:8080/persons     -H 'content-type: application/json'     -H 'accept: application/json'     -d '{"person": {"name":"John Quark", "age": 20}}'<br/>

# response
{"id":"e823b713-1096-4e4f-969b-1948afaba61d","person":{"name":"John Quark","age":20,"adult":true}}<br/>
