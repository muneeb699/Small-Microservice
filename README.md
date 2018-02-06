# Small-Microservice
Small microservice for demostration Purpose.
  * Java
  * Spring Boot
  * Eureka


##   Microservice References and Explanation  ##

- Download the Spring boot Plugin from Eclipse MarketPlace or Download the Spring boot Suite from https://spring.io/tools .

- To build with gradle, these libraries are required:

	

		`compile('org.springframework.cloud:spring-cloud-starter-config')`

		`compile('org.springframework.cloud:spring-cloud-starter-eureka')`

		`compile('org.springframework.cloud:spring-cloud-starter-eureka-server')`

		`compile('org.springframework.boot:spring-boot-starter-web')`

		`compile('org.springframework.boot:spring-boot-starter-web-services')`

		`testCompile('org.springframework.boot:spring-boot-starter-test')``}`
		`dependencyManagement {`
			`imports {`

				`mavenBom "org.springframework.cloud:spring-cloud-dependencies:${springCloudVersion}"`
			`}`
		`}`
	
- First create a simple program e.g Employee-Producer, in which you are getting data from source or created some dummy data. Update application.properties file with(`server.port= #portnumber` and location of eureka server :`eureka.client.serviceUrl.defaultZone = http://localhost:8090/eureka` ). Donot forget to specify the controller to Map the data at some specific location.

- Create a Eureka Server program where eureka registry runs and save all instances of all microservices. Update the application.properties file with (`server.port = portnumber`)(*default port* is `8080`). 

- Create a another microservice to consume other microservice. Create a controller class and by using discovery client, get the instance of unique instance of other microservice. 


**Refrences**

- [http://javainuse.com/spring/spring_eurekaregister](http://javainuse.com/spring/spring_eurekaregister)
- [https://www.youtube.com/watch?v=0NYkrHpXXLc](https://www.youtube.com/watch?v=0NYkrHpXXLc)
