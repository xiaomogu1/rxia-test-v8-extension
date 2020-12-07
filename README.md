# rxia-test-v8-extension


go to quarkus-rxia-parent
mvn install
mvn clean test

make sure org.acme:quarkus-rxia:1.0-SNAPSHOT.jar installed in your local

Then go to greeting-app

./mvnw quarkus:remove-extension -Dextensions="org.acme:quarkus-rxia:1.0-SNAPSHOT"
./mvnw quarkus:add-extension -Dextensions="org.acme:quarkus-rxia:1.0-SNAPSHOT"

mvn clean compile quarkus:dev

Test url 
curl -X POST http://localhost:8080/persons     -H 'content-type: application/json'     -H 'accept: application/json'     -d '{"person": {"name":"John Quark", "age": 20}}'
