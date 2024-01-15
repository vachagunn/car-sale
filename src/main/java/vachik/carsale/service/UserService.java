package vachik.carsale.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import vachik.carsale.repository.UserRepository;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService implements UserDetailsService {
    private final UserRepository userRepository;
    // Получение опций объекта User (+ проверка на то, есть ли такой пользователей с переданным username)
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        var optionalUser = userRepository.findByUsername(username);

        if (optionalUser.isPresent()) {
            log.info("{}", optionalUser.get());
            return optionalUser.get();
        } else {
            throw new UsernameNotFoundException(username);
        }
    }
}
