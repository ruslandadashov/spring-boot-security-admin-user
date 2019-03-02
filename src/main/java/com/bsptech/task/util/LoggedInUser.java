
package com.bsptech.task.util;

import com.bsptech.task.entities.User;
import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
/**
 * @author ruslandadashov
 */

public class LoggedInUser extends org.springframework.security.core.userdetails.User{
  
    private User user;
    
    public LoggedInUser(User user, String username, String password, boolean enabled, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, enabled, enabled, enabled, enabled, authorities);
         this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
