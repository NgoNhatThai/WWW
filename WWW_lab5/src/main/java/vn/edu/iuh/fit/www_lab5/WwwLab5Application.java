package vn.edu.iuh.fit.www_lab5;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import vn.edu.iuh.fit.www_lab5.backend.enums.Country;
import vn.edu.iuh.fit.www_lab5.backend.models.Address;
import vn.edu.iuh.fit.www_lab5.backend.models.Candidate;
import vn.edu.iuh.fit.www_lab5.backend.repositories.AddressRepository;
import vn.edu.iuh.fit.www_lab5.backend.repositories.CandidateRepository;

import java.time.LocalDate;
import java.util.Random;

@SpringBootApplication
public class WwwLab5Application {

    public static void main(String[] args) {
        SpringApplication.run(WwwLab5Application.class, args);
    }
    @Autowired
    private CandidateRepository candidateRepository;
    @Autowired
    private AddressRepository addressRepository;
    @Bean
    CommandLineRunner initData() {
        return args -> {
            Random rnd = new Random();
            for (int i = 1; i < 200; i++) {
                Address add = new Address(
                        Country.VIETNAM,
                        rnd.nextInt(1, 1000) + "",
                        rnd.nextInt(70000, 80000) + "",
                        "HCM City",
                        "Nguyen Hue"
                        );
                addressRepository.save(add);
                Candidate can = new Candidate(
                        LocalDate.of(1998, rnd.nextInt(1, 13), rnd.nextInt(1, 29)),
                        add,
                        rnd.nextLong(1111111111L, 9999999999L) + "",
                        "email_" + i + "@gmail.com",
                        "Nguyen Van A"
                );
                candidateRepository.save(can);
                System.out.println("Added: " + can);
            }
        };
    }
}
