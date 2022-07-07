package com.example.orchestra.entities;
/*

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UserPrincipal implements UserDetails {

    private final User userEntity;
    private final Long id;

    public UserPrincipal(User userEntity){
        this.userEntity = userEntity;
        this.id = userEntity.getId();
    }


    @Override
    @Transactional(readOnly = true)
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
        //Extract list of roles (ROLE_name)
        this.userEntity.getAuthorities().forEach(r -> {
            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority("ROLE_" + r.getName());
            authorities.add(grantedAuthority);
            // Extract list of permissions
        });

        return authorities;
    }

    @JsonIgnore
    public Long getId() {
        return id;
    }

    @Override
    public String getPassword() {
        return this.userEntity.getPassword();
    }

    @Override
    public String getUsername() {
        return this.userEntity.getUserName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

//    public static UserEntity getCurrentUserEntity(){
//        UserPrincipal loginUser = (UserPrincipal) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        return new UserEntity(loginUser.getId());
//    }

}
*/
