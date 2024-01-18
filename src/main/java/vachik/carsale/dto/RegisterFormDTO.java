package vachik.carsale.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import vachik.carsale.entity.User;

@Data
public class RegisterFormDTO {
    @NotNull
    private String username;
    @NotNull
    @Size(min = 8)
    private CharSequence password;

    public User toEntity() {
        var user = new User();
        user.setUsername(username);
//        user.setPassword(passwordEncoder.encode(password));
        user.setEnabled(true);
        user.setAuthority("USER");
        user.setAccountNonLocked(true);
        user.setCredentialsNonExpired(true);
        user.setAccountNonExpired(true);

        return user;
    }
}
