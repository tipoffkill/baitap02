package webanime.service;

import webanime.dao.UserDao;
import webanime.dao.UserDaoImpl;
import webanime.models.User;

public class UserServiceImpl implements UserService {
    private final UserDao userDao = new UserDaoImpl();

    public UserServiceImpl() {}

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

    @Override
    public void insert(User user) {
        userDao.insert(user);
    }

    @Override
    public boolean register(String username, String password, String email, String fullname, String phone) {
        if (userDao.checkExistUsername(username) || userDao.checkExistEmail(email)) {
            return false;
        }
        long millis = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(millis);
        // roleid mặc định = 3 (user)
        User u = new User();
        u.setEmail(email);
        u.setUserName(username);
        u.setFullName(fullname);
        u.setPassWord(password);
        u.setAvatar(null);
        u.setRoleid(3);
        u.setPhone(phone);
        u.setCreatedDate(date);

        userDao.insert(u);
        return true;
    }

    @Override
    public boolean checkExistEmail(String email) {
        return userDao.checkExistEmail(email);
    }

    @Override
    public boolean checkExistUsername(String username) {
        return userDao.checkExistUsername(username);
    }

    @Override
    public boolean checkExistPhone(String phone) {
        return userDao.checkExistPhone(phone);
    }
}
