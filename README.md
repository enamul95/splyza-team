# splyza-team

# Tech stack
 - Jdk 11
 - spring boot 2.7.3
 - idea intellij
 - apache tomcat
 - connect database (any)
 - packing .jar
 - 100% java
 
# Architecture
 - Presentation Layer
 - Business Layer
 - Persistence Layer
 - Database Layer
 - Use Application .ynl with(dev, prod).  dev for connecting myslq & prod connecting to H2-databse
 - The client makes the HTTP requests (POST or GET).
 - All cores policy allowed

# User open-source libraries     
- spring-boot-starter-web
- JPA
- H2
- mysql
- hibernate
- dev-tools

# Run Service
- clone or donwlod project to intellij idea or eclipse, or sts-sute & run
- By default is connection to 8081 port but you can change by application.yml files
- No need any databse if you use in-memory databse of H2-databse & just run
- Or download jar from the link : https://drive.google.com/drive/folders/1lVmlVvsNRpC4Ph3lPk8LnMV04_V8y6KZ?usp=sharing
- Execute command to run jsut --> java -jar splyza-team-0.0.1-SNAPSHOT.jar
- open browser and exectue url for showing h2-conse--> http://localhost:8081/h2-console
- Check jdbc url & connection--> jdbc:h2:mem:testdb
- connect from android & ios project
- I have provided some screen shots in splyza-team of google drive. Please check
- enjoy

# Share screenshots
 - Please check some screenshots splyza-team folder from the like https://drive.google.com/drive/folders/1lVmlVvsNRpC4Ph3lPk8LnMV04_V8y6KZ?usp=sharing


