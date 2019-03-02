
package com.bsptech.task.service;

import com.bsptech.task.dao.UserRepository;
import com.bsptech.task.entities.Authorities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.bsptech.task.entities.User;
import com.bsptech.task.util.LoggedInUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 * @author ruslandadashov
 */
@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userDetailsDao;

    @Transactional(readOnly = true)
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userDetailsDao.findUserByUsername(username);
        if (user != null) {
            Collection<GrantedAuthority> auths = getAuthorityArr(user.getAuthorities());

            LoggedInUser lgU = new LoggedInUser(user, username, user.getPassword(), !user.getBlocked(), auths);

            return lgU;
        } else {
            throw new UsernameNotFoundException("User not found.");
        }
    }

    public static Collection<GrantedAuthority> getAuthorityArr(Collection<Authorities> authorities) {

        List<GrantedAuthority> authoritiesArr = new ArrayList<>();
        Iterator<Authorities> iter = authorities.iterator();
        int i = 0;
        while (iter.hasNext()) {
            Authorities a = iter.next();
            authoritiesArr.add(new SimpleGrantedAuthority(a.getAuthority()));
            i++;
        }

        return authoritiesArr;
    }
}
