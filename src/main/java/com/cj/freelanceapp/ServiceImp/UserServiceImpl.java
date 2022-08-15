package com.cj.freelanceapp.ServiceImp;

import com.cj.freelanceapp.dto.UserDTO;
import com.cj.freelanceapp.model.Customer;
import com.cj.freelanceapp.model.Freelancer;
import com.cj.freelanceapp.model.User;
import com.cj.freelanceapp.repository.UserRepository;
import com.cj.freelanceapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private FreelancerServiceImp freelancerServiceImp;
    @Autowired
    private CustomerServiceImp customerServiceImp;
    @Autowired
    private PasswordEncoder bCryptPasswordEncoder;

    @Override
    public User findUserByFullName(String fullName) {
        return null;
    }

    /**
     * FIND USER BY PHONE NUMBER
     * @param phoneNumber
     * @return
     */
    @Override
    public User findUserByPhonenumber(String phoneNumber) {
        return userRepository.findByPhoneNumber(phoneNumber);
    }

    /**
     * FIND USER BY REGISTRATION DATE
     * @param date
     * @return
     */
    @Override
    public List<User> findUserByRegistrationOn(String date) {
        return null;
    }

    /**
     * getting user by email
     *
     * @param email
     * @return
     */
    @Override
    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    /**
     * @param user
     */
    @Override
    public void saveUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        UserDTO userDTO = new UserDTO();
    }

    /**
     * @param pageable
     * @return
     */
    @Override
    public Page<User> listUsers(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    /**
     * @param name
     * @param pageable
     * @return
     */
    @Override
    public Page<User> searchByTerm(String name, Pageable pageable) {
        return userRepository.searchByTerm(name, pageable);
    }

    /**
     * @return
     */
    @Override
    public Boolean removeAll() {
        userRepository.deleteAll();
        return Boolean.TRUE;
    }

    /**
     * @param id
     */
    @Override
    public void removeById(Long id) {
        userRepository.deleteById(id);
    }

    /**
     * @param id
     * @return
     */
    @Override
    public User findById(Long id) {
        return userRepository.findById(id).get();
    }


    /**
     * @param keyword
     * @param criteria
     * @return
     */
    @Override
    public List<User> searchBy(String keyword, String criteria) {
        if ("firstName".equals(criteria)) {
            return userRepository.findByFullNameIgnoreCaseContaining(keyword);
//        } else if ("lastName".equals(criteria)) {
//            return userRepository.findByLastNameIgnoreCaseContaining(keyword);
        } else if ("email".equals(criteria)) {
            return userRepository.findByEmailIgnoreCaseContaining(keyword);
        }
        return new ArrayList<>();

    }

    /**
     * @param email
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return this.findUserByEmail(email);
    }
}
