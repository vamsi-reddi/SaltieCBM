package com.saltie.CBM.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.security.web.util.matcher.NegatedRequestMatcher;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig{


    @Bean
    public UserDetailsService userDetailsService(){

//        UserDetails admin = User.withUsername("Vamsi")
//                .password(passwordEncoder().encode("1234"))
//                .roles("ADMIN")
//                .build();
//
//        UserDetails user = User.withUsername("Jhansi")
//                .password(passwordEncoder().encode("1234"))
//                .roles("USER")
//                .build();

//        UserDetails admin= User.withUsername("Vamsi")
//                .password(encoder.encode("vamsi"))
//                .roles("ADMIN")
//                .build();
//
        //return new InMemoryUserDetailsManager(admin, user);
        return new UserInfoUserDetailsService();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return  new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

         http.csrf(cs-> cs.ignoringRequestMatchers(new AntPathRequestMatcher("/**")).disable())
                         .securityMatcher(new AntPathRequestMatcher("/**")).securityMatcher(new NegatedRequestMatcher(new AntPathRequestMatcher("/user/add")))
                 .authorizeHttpRequests(t->t.anyRequest().permitAll());
//                http.authorizeHttpRequests(auth->{
//                    auth.requestMatchers("/**").permitAll();



//                })
//                .formLogin(withDefaults())
//                .httpBasic(withDefaults());
         return http.build();
    }

    @Bean
    public AuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
        authenticationProvider.setUserDetailsService(userDetailsService());
        authenticationProvider.setPasswordEncoder(passwordEncoder());
        return authenticationProvider;
    }



}
