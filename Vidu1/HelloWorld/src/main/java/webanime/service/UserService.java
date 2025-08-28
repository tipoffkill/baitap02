package webanime.service;

import webanime.models.User;

public interface UserService {
    User login(String username, String password);
    User get(String username);
}
