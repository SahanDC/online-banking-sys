package org.trb.config;

import org.trb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserService userService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers(
                        "/registration**",
                        "/js/**",
                        "/css/**",
                        "/img/**",
                        "/webjars/**",
                        "/parent-API/**").permitAll()

                .antMatchers("/admin/**").hasRole("ADMIN")


                .antMatchers("/assign/add").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/assign/add-assign").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/assign/edit/**").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/assign/update/**").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/assign/delete-assign/**").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/assign/addList-test").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/assign/addList").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/assign/add-assignList").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/assign/add-assignList/assign-student").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/assign/switch-students").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/assign/switch-set").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/assign/switch-select").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/assign/delete-assign-fromList/**").hasAnyRole("ADMIN", "ACTUATOR")


                .antMatchers("/bank-record/add-record").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/bank-record/update/**").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/bank-record/update/**").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/bank-record/delete-record/**").hasAnyRole("ADMIN", "ACTUATOR")


                .antMatchers("/class/add").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/class/add-class").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/class/edit/**").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/class-update/**").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/class/delete-class/**").hasAnyRole("ADMIN", "ACTUATOR")


                .antMatchers("/concession/add").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/concession/add-concession").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/concession/edit/**").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/concession-update/**").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/concession/delete-concession/**").hasAnyRole("ADMIN", "ACTUATOR")


                .antMatchers("/discountCoupon/add").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/discountCoupon/add-discountCoupon").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/discountCoupon/edit/**").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/discountCoupon-update/**").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/discountCoupon/disable-discountCoupon/**").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/discountCoupon/enable-discountCoupon/**").hasAnyRole("ADMIN", "ACTUATOR")


                .antMatchers("/issue-payment/add").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/issue-payment/add-issue-payment").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/issue-payment/payment/add").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/issue-payment/payment/add-payment").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/issue-payment/delete-issue-payment/**").hasAnyRole("ADMIN", "ACTUATOR")


                .antMatchers("/payment/add").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/payment/add-payment").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/payment/edit/**").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/payment-update/**").hasAnyRole("ADMIN", "ACTUATOR")


                .antMatchers("/receipt/add").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/receipt/add-payments/**").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/receipt/add-receipt").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/receipt/schoolFees/ChangeDiscountFees").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/receipt/generate").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/receipt/generate-receipt").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/receipt/edit/**").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/receipt-update/**").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/receipt/add-payments").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/receipt/add-payment-to-receipt/**").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/receipt/generate-school-fees/**").hasAnyRole("ADMIN", "ACTUATOR")


                .antMatchers("/receipt-type/add").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/receipt-type/add-receipt-type").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/receipt-type/edit/**").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/receipt-type-update/**").hasAnyRole("ADMIN", "ACTUATOR")


                .antMatchers("/student/leave").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/student/leave-byPerson/**").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/student/leave-byClass/**").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/student/add").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/student/add-student").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/student/edit/**").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/student-update/**").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/student/reAdd-student/**").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/student/delete-student/**").hasAnyRole("ADMIN", "ACTUATOR")


                .antMatchers("/teacher/leave-byPerson/**").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/teacher/add").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/teacher/add-teacher").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/teacher/edit/**").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/teacher-update/**").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/teacher/leave-teacher/**").hasAnyRole("ADMIN", "ACTUATOR")
                .antMatchers("/teacher/reAdd-teacher/**").hasAnyRole("ADMIN", "ACTUATOR")



                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
                .logout()
                .invalidateHttpSession(true)
                .clearAuthentication(true)
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                .logoutSuccessUrl("/login?logout")
                .permitAll()
                .and()
                .csrf().disable().cors();
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider auth = new DaoAuthenticationProvider();
        auth.setUserDetailsService(userService);
        auth.setPasswordEncoder(passwordEncoder());
        return auth;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authenticationProvider());
    }
}
