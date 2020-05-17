package com.metin.spring.boot.lazy.initialization;

import com.metin.spring.boot.lazy.initialization.models.Person;
import com.metin.spring.boot.lazy.initialization.models.Phone;
import com.metin.spring.boot.lazy.initialization.service.PersonService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;


@SpringBootApplication
public class SpringBootLazyInitializationApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringBootLazyInitializationApplication.class, args);
        Person person = applicationContext.getBean("person", Person.class);
        System.out.println(person.getName());

        Phone phone = applicationContext.getBean("phone", Phone.class);
        System.out.println(phone.getModel());

        PersonService personService = applicationContext.getBean("personService", PersonService.class);
        personService.print();
    }

    @Bean
    @Lazy
    public Person person() {
        return new Person("yusuf", "alnıaçık");
    }

    @Bean
    public Phone phone() {
        return new Phone("samsung", "note10");
    }
}
