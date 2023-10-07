package estudos.jpa.springdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import estudos.jpa.springdatajpa.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
    
}
