package com.cj.freelanceapp.security;


import com.cj.freelanceapp.ServiceImp.UserServiceImpl;
import com.cj.freelanceapp.exception.EthioFreelancingApplicationException;
import com.cj.freelanceapp.helpers.ROLE;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.session.HttpSessionEventPublisher;


/**
 * CONFIGURATION FOR THE APPLICATION
 * ANNOTATION
 */
@Configuration
/**
 * ENABLE WEB SECURITY ANNOTATION
 */
@EnableWebSecurity
/**
 * ALL ARGUMENT CONSTRUCTOR
 */
@AllArgsConstructor
public class EFASecurity extends WebSecurityConfigurerAdapter
/**
 * APPLICATION SECURITY CLASS
 * ALL SECURITY FEATURES ARE IMPLEMENTED IN HERE
 * Author Million Sharbe
 * Application security with spring security core
 * Securing all rest end points with and  roles
 * date july 13 , 2022
 */
{
    /**
     * User details service object creation
     */
    @Autowired
    public final UserServiceImpl userDetailsService;
    /**
     * injecting password encoder object
     */
    @Autowired
    public final PasswordEncoder passwordEncoder;
    /**
     * SUCCESSFUL LOGIN HANDLER INJECTION
     */
    @Autowired
    public final SuccessfullLoginHandler successfullLoginHandler;

    /**
     * securing all requests with spring security core
     *
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                /**
                 * permit all those end point for everyone
                 */
                .authorizeRequests()
                .antMatchers("/console/**", "/", "/signup", "/register", "/about", "/resources/**").permitAll()
                /**
                 * those end points should be authenticated
                 * not accessable without login
                 */
                .antMatchers("/customer/home", "customer/freelancers", "/customer/myjobs", "/customer/jobapplication", "/customer/postjob",
                        "/freelancerhome", "/skills", "/jobs/**", "/jobapplications/**", "/page/**",
                        "/profile", "/contactus/**").authenticated()
                /**
                 * authority's  for all rest end points
                 */

                /**
                 * customer authority's
                 */
//                .antMatchers("/customerhome/**", "/customer/**", "/jobapplications/**", "/jobs/**").hasAuthority(ROLE.CUSTOMER.name())
                /**
                 * freelancer authority's
                 */
//                .antMatchers("/freelancerhome/**", "/freelancer/jobs/**", "/jobs/**").hasAuthority(ROLE.FREELANCER.name())
                /**
                 * admin authority's
                 */
                .antMatchers("/getAllUser/**", "/removeAll/**").hasAuthority(ROLE.ADMIN.name())
                .antMatchers("/getAllUser/**", "/removeAll/**").hasAuthority(ROLE.ADMIN.name())
                .antMatchers("/removeAll/**", "/addNewUser/**", "/save/**", "/delete/**").hasAuthority(ROLE.ADMIN.name())
                .anyRequest().permitAll()
                .and()
                /**
                 * login page url
                 */
                .formLogin().loginPage("/login")
                .successHandler(successfullLoginHandler)
                /**
                 * default success page for customer
                 */
//                .defaultSuccessUrl("/customer/home")
//                /**
//                 * default success page for freelancer
//                 */
//                .defaultSuccessUrl("/freelancer/home")
                /**
                 * login parameter email
                 */
                .usernameParameter("email")
                /**
                 * login parameter password
                 */
                .passwordParameter("password")
                .and()
                /**
                 * logout success page for all users
                 */
                .logout().logoutSuccessUrl("/login")
                .and()
                /**
                 * access denied page
                 */
                .exceptionHandling().accessDeniedPage("/403")
                .and()
                /**
                 * cross site request forgery
                 */
                .csrf();
        /**
         * session management
         */
        http.sessionManagement()
                /**
                 * max session time period
                 */
                .maximumSessions(1)
                /**
                 * max session time period prevents login
                 */
                .maxSessionsPreventsLogin(true)
                /**
                 * expired url
                 */
                .expiredUrl("/login?error=You are already logged in from somewhere");
    }

    /**
     * @param auth
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        /**
         *  configuring authentication manager with dao Authentication Provider
         */
        auth.authenticationProvider(daoAuthenticationProvider());
    }

    /**
     * DaoAuthenticationProvider with userDetailsService and
     * Password Encoder
     *
     * @return Dao Authentication Provider
     */
    @Bean
    public DaoAuthenticationProvider daoAuthenticationProvider() {
        /**
         * DAO AUTHENTICATION PROVIDER INJECTION OBJECT
         */
        DaoAuthenticationProvider daoAuthenticationProvider =
                new DaoAuthenticationProvider();
        /**
         * SET PASSWORD ENCODER BY INJECTING
         */
        daoAuthenticationProvider.setPasswordEncoder(passwordEncoder.bCryptPasswordEncoder());
        /**
         * SET USER SERVICE DETAILS USER DATA ACCESS OBJECT
         */
        daoAuthenticationProvider.setUserDetailsService(userDetailsService);
        /**
         * RETURN DAO AUTHENTICATION PROVIDER
         */
        return daoAuthenticationProvider;
    }

    /**
     * Servlet Session Bean
     *
     * @return Http Session Event Publisher
     */
    @Bean
    public ServletListenerRegistrationBean<HttpSessionEventPublisher> httpSessionEventPublisher() {
        return new ServletListenerRegistrationBean<HttpSessionEventPublisher>(new HttpSessionEventPublisher());
    }

    /**
     * exclude this end points from any access
     * configuring the web resources
     *
     * @param web
     * @throws EthioFreelancingApplicationException
     */
    @Override
    public void configure(WebSecurity web) throws EthioFreelancingApplicationException {
        /**
         * SECURE ALL FOLDERS REGISTERED UNDER THIS
         */
        web.ignoring().antMatchers("/resources/**", "/static/**", "/assets/**",
                "/fonts/**", "/img/**", "/scss/**", "/Doc/**", "/css/**", "/js/**", "/images/**");
    }

}
