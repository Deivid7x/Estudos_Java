package estudos.jpa.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import estudos.jpa.springdatajpa.model.User;
import estudos.jpa.springdatajpa.repository.UserRepository;


@Component
public class StartApp implements CommandLineRunner{
    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();

        user.setName("Deivid");
        user.setUsername("SrDs");
        user.setPassword("123");

        repository.save(user);
    }
    
}
