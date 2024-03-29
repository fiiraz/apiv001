package com.grokonez.jwtauthentication.repository;

import com.grokonez.jwtauthentication.model.ActiveUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActiveUserRepository extends JpaRepository<ActiveUser, Long> {
    Boolean existsByToken(String token);
    Boolean existsByUsername(String username);
    void deleteActiveUserByUsername(String username);
    void deleteActiveUserByToken(String token);
}
