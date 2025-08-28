package webanime.dao;

import webanime.models.User;

public interface UserDao {
    User get(String username);
}
