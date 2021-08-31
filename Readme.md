# Spring Boot Flyway Test

## Dependencies

```bash
<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		<dependency>
			<groupId>org.flywaydb</groupId>
			<artifactId>flyway-core</artifactId>
		</dependency>

		<dependency>
			<groupId>org.postgresql</groupId>
			<artifactId>postgresql</artifactId>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>
```

## setup

**1. Clone**

```bash
git clone https://github.com/ExiledSpirit/FlywayTest.git
```

**2. Create PostgreSql database**
```bash
create database artigoManager
```

**3. Change postgreSql database configs at src/main/resources/application.properties**

```bash
spring.datasource.url=<database_url> "example: jdbc:postgresql://localhost:3306/artigoManager"
spring.datasource.username=<username>
spring.datasource.password=<password>

spring.flyway.schemas=<schema_name>
spring.flyway.username=<username>
spring.flyway.password=<password>
```
