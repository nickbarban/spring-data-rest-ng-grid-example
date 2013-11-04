package org.myapp.repository;

import org.myapp.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.repository.annotation.RestResource;

/**
 * Created by naor on 10/21/13.
 */
@RestResource(path = "users", rel = "users")
public interface UserRepository extends PagingAndSortingRepository<User, Long> {}


