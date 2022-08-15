package com.cj.freelanceapp.service;


import com.cj.freelanceapp.model.Admin;

import java.util.List;


/**************************************************************************************
 * Description : interface for admin services
 * Created Date: 22 jun, 2022
 * Version     : v1.0.0
 * Author      : Million Sharbe
 *************************************************************************************/

public interface AdminService {
    /**
     * add admin
     * @param admin
     */
    void add_admin(Admin admin);

    /**
     * get admin
     * @param id
     * @return
     */
    Admin get_admin(long id);

    /**
     * get all admin
     * @return
     */
    List<Admin> all_admin();

    /**
     * update admin
     * @param id
     * @param admin
     * @return
     */
    Admin update_admin(long id, Admin admin);

    /**
     * delete admin
     * @param id
     */
    void delete_admin(long id);

    /**
     * delet all admins
     */
    void delete_all();

}
