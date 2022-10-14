public interface DataBase {

    void saveUser(User user) throws InterruptedException;

    User getUser(int id) throws InterruptedException;
}
