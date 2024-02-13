package com.hcorupe.pagnationjpatest.data;

import com.github.javafaker.Faker;
import com.hcorupe.pagnationjpatest.model.Address;
import com.hcorupe.pagnationjpatest.model.Person;
import com.hcorupe.pagnationjpatest.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.IntStream;

@Component
public class SampleDataLoader implements CommandLineRunner {

    //private Logger logger = LoggerFactory.getLogger(SampleDataLoader.class);
    private final PersonRepository personRepository;
    private final Faker faker;

    public SampleDataLoader(PersonRepository personRepository, Faker faker) {
        this.personRepository = personRepository;
        this.faker = faker;
    }


    @Override
    public void run(String... args) throws Exception {
        /// create 100 rows of people in the database
        List<Person> people = IntStream.rangeClosed(1, 100)
                .mapToObj(i -> new Person(
                        faker.name().firstName(),
                        faker.name().lastName(),
                        faker.phoneNumber().cellPhone(),
                        faker.internet().emailAddress(),
                        new Address(
                                faker.address().streetAddress(),
                                faker.address().city(),
                                faker.address().state(),
                                faker.address().zipCode()
                        )
                        )).toList();

        personRepository.saveAll(people);
    }
}
