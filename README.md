# Introduction

KeyCloak integration with REST based on Spring Boot.

# Steps

1. Configure KeyCloak server and change configuration in application.yml accordingly
2. Generate Tokens against myrealm and my-app created on KeyCloak

    curl -ss --data "grant_type=password&client_id=my-app&username=test&password=test" http://192.168.64.2:9080/auth/realms/myrealm/protocol/openid-connect/token

3. Start the application

    mvn clean spring-boot:run

4. Copy the token into below command

    curl -H "Authorization: bearer MYTOKEN" http://localhost:9002/user/hello