# SpringBootCustomerApp
<b>Simple Spring Boot Application includes REST, Controller, JSP/JSTL, uses JPARespositry</b>

<b>This is a simple @SpringBootApplication:</b>

    -uses JpaRepository + com.h2database
    -Contains @RestController for REST uri's
    -Contains @Controller to return ModelAndView to JSP/JSTL
    -Full Customer CRUD application that will run as a JAR
    -run from command:
        mvn spring-boot:run
    -run as jar:
        mvn package
        java -jar target/spring-boot-customer-ms-0.1.0.jar
    -test
        localhost:8080/customer/1
        localhost:8080/customer/page/list
 
