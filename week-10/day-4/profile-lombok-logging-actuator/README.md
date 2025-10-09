
Profile + Lombok + Logging + Actuator demo
----------------------------------------

How to run:

1. Build with Maven:
   mvn clean package

2. Run with dev profile (default):
   mvn spring-boot:run -Dspring-boot.run.profiles=dev
   or
   java -jar target/profile-lombok-logging-actuator-1.0.0.jar --spring.profiles.active=dev

3. Run with prod profile:
   mvn spring-boot:run -Dspring-boot.run.profiles=prod

Actuator endpoints (when app is running):
  - /actuator/health
  - /actuator/info
  - /actuator/env
  - /actuator/metrics
  - /actuator/loggers

Notes:
  - Lombok is used (annotations Data, NoArgsConstructor, AllArgsConstructor). Add Lombok plugin to your IDE.
  - Dev profile logs to console; Prod profile writes to logs/app.log.
