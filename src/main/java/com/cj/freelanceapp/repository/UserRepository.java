package com.cj.freelanceapp.repository;

import com.cj.freelanceapp.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    /**
     * FIND USER BY EMAIL
     * @param email
     * @return
     */
    User findByEmail(String email);

    /**
     * FIND USER BY PHONE NUMBER
     * @param phoneNumber
     * @return
     */

    User findByPhoneNumber(String phoneNumber);

    /**
     * FIND USERS CONTAINING THE SAME KIND OF NAME
     * @param fullName
     * @return
     */

    List<User> findByFullNameIgnoreCaseContaining(String fullName);

    /**
     * FIND USERS CONTAINING THE SAME KIND OF PHONE NUMBER
     * @param phoneNumber
     * @return
     */

    List<User> findByPhoneNumberIgnoreCaseContaining(String phoneNumber);



    List<User> findByEmailIgnoreCaseContaining(String email);

    @Query("SELECT t FROM User t WHERE " +
            "LOWER(t.fullName) LIKE LOWER(CONCAT('%',:searchTerm, '%'))")
    Page<User> searchByTerm(@Param("searchTerm") String searchTerm, Pageable pageable);
}
