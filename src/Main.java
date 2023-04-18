import com.java.domaine.User;
import com.java.models.Dao.Dao;
import com.java.models.Dao.imp.UserDao;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        UserDao userDao = new UserDao();
        User userone = new User(1, "Otman2", "otmanfakri2@gmail.com");
        User usertow = new User(2, "Otman3", "otmanfakri3@gmail.com");
        User userthree = new User(3, "Otman4", "otmanfakri3@gmail.com");

        System.out.println("save:");

        userDao.save(userone);
        userDao.save(usertow);
        userDao.save(userthree);

        for (User user : userDao.getAll()) {
            System.out.println(user);
        }
        System.out.println("update:");

        userDao.update(userone,new User(1,"xxx","xxx@xxx.com"));
        for (User user : userDao.getAll()) {
            System.out.println(user);
        }

        System.out.println("Delete:");
        userDao.delete(userone.getUserID());
        for (User user : userDao.getAll()) {
            System.out.println(user);
        }
        System.out.println("Find :");
        System.out.println("User 1:" + userDao.getByID(usertow.getUserID()));

    }


}