# springboot3-gmaillogin
I added only the necessary things to Build.gradle, so you can add anything else yourself.

 plugins {
    
    id 'org.springframework.boot' version '3.1.4'
   
}

java {

    sourceCompatibility = '17'
    
}


#dependencies {
    implementation 'org.springframework.boot:spring-boot-starter-mustache'

    implementation 'org.springframework.boot:spring-boot-starter-oauth2-client'
    implementation 'org.springframework.boot:spring-boot-starter-security'

    implementation 'org.springframework.boot:spring-boot-starter-web'
    implementation 'org.springframework.boot:spring-boot-starter-data-jpa'

    compileOnly 'org.projectlombok:lombok'
    runtimeOnly 'com.mysql:mysql-connector-j'
    annotationProcessor 'org.projectlombok:lombok'

    testImplementation 'org.springframework.boot:spring-boot-starter-test'
    testImplementation 'org.springframework.security:spring-security-test'
    implementation 'org.springframework.boot:spring-boot-starter-thymeleaf'
}
