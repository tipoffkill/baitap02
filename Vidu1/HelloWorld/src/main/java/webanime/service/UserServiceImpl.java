package webanime.service;

import webanime.dao.UserDao;
import webanime.dao.UserDaoImpl;
import webanime.models.User;

public class UserServiceImpl implements UserService {
    private final UserDao userDao = new UserDaoImpl();

    public UserServiceImpl() {}  // có constructor mặc định

    @Override
    public User login(String username, String password) {
        User user = this.get(username);
        if (user != null && password != null && password.equals(user.getPassWord())) {
            return user;
        }
        return null;
    }

    @Override
    public User get(String username) {
        return userDao.get(username);
    }
}
