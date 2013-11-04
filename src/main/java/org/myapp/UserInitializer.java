package org.myapp;

import javax.inject.Inject;
import javax.inject.Named;

import org.myapp.model.User;
import org.myapp.repository.UserRepository;
/**
 * Created by naor on 10/21/13.
 */
@Named("userInitializer")
public class UserInitializer {

    @Inject
    @Named("userRepository")
    private UserRepository userRepository;


    public void init() {
        //load up some users...
        userRepository.save(new User("Alice", "Cooper"));
        userRepository.save(new User("Bob", "Dylan"));
        userRepository.save(new User("Bob", "Marley"));
        userRepository.save(new User("Chuck", "Berry"));
        userRepository.save(new User("David", "Bowie"));
        userRepository.save(new User("Elvis", "Costello"));
        userRepository.save(new User("Frank", "Zappa"));
        userRepository.save(new User("George", "Harrison"));
        userRepository.save(new User("Ian", "Gillan"));
        userRepository.save(new User("Jimi", "Hendrix"));
        userRepository.save(new User("Jimmy", "Page"));
        userRepository.save(new User("John", "Lennon"));
        userRepository.save(new User("Lou", "Reed"));
        userRepository.save(new User("Paul", "Simon"));
        userRepository.save(new User("Ray", "Charles"));
        userRepository.save(new User("Steve", "Miller"));
        userRepository.save(new User("Stevie", "Wonder"));
        userRepository.save(new User("Tim", "Curry"));
        userRepository.save(new User("Tom", "Petty"));
        userRepository.save(new User("Tom", "Waits"));
    }
}
