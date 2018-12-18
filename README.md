# Introduction

KeyCloak integration with REST based on Spring Boot.

# Steps

1. Change configuration in application.yml according to the keycloak service (normally for each new application a new realm and client needs to be configured, (2) url will change according to the realm and client app configured)

2. Generate Tokens against myrealm and my-app created on KeyCloak

    curl -ss --data "grant_type=password&client_id=my-app&username=test&password=test" http://192.168.64.2:9080/auth/realms/myrealm/protocol/openid-connect/token

3. Start the application

    mvn clean spring-boot:run

4. Copy the token into below command

    curl -H "Authorization: bearer MYTOKEN" http://localhost:9002/user/hello
