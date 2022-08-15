package com.cj.freelanceapp.ServiceImp;

import com.cj.freelanceapp.model.Admin;
import com.cj.freelanceapp.repository.AdminRepo;
import com.cj.freelanceapp.repository.UserRepository;
import com.cj.freelanceapp.security.PasswordEncoder;
import com.cj.freelanceapp.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ADMIN SERVICE DEFINITION CLASS
 * ALL ADMIN RELATED SERVICES METHODS OPERATIONS ARE
 * IMPLEMENTED BY IMPLEMETING ADMIN SERVICE INTERFACE
 * HERE
 * AUTHOR MILLION SHARBE
 * DATE JUN 14 , 2022
 *
 */
@Service
public class AdminServiceImp implements AdminService {
	/**
	 * ADMIN REPOSITORY
	 */
    @Autowired
    private AdminRepo adminRepo;
	/**
	 * USER REPOSITORY
	 */
	@Autowired
    private UserRepository userRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	/**
	 *
	 * @param admin SAVE ADMIN RECORD
	 */
	@Override
    public void add_admin(Admin admin) {
		admin.getUser().setPassword(passwordEncoder.bCryptPasswordEncoder().encode(admin.getUser().getPassword()));
        userRepository.save(admin.getUser());
        adminRepo.save(admin);
    }

	/**
	 *
	 * @param id
	 * @return ADMIN RECORD
	 */
	@Override
    public Admin get_admin(long id) {
        return adminRepo.getReferenceById(id);
    }

	/**
	 *
	 * @return ALL ADMIN RECORDS
	 */
	@Override
    public List<Admin> all_admin() {
        return adminRepo.findAll();
    }

	/**
	 *
	 * @param id
	 * @param admin
	 * @return UPDATE ADMIN BY ID
	 */
    @Override
    public Admin update_admin(long id, Admin admin) {
        return adminRepo.save(admin);
    }

	/**
	 *
	 * @param id DELETE ASMIN BY ADMIN
	 */
	@Override
    public void delete_admin(long id) {
        adminRepo.deleteById(id);
    }

	/**
	 * DELETE ALL ADMIN RECORDS
	 */
	@Override
    public void delete_all() {
        adminRepo.deleteAll();
    }

}
