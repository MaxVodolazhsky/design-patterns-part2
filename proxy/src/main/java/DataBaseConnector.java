import java.util.HashMap;

public class DataBaseConnector {

    static {
        System.out.println("Подключения к базе данных ...");
    }

    private static final DataBase proxy = new DataBaseProxy(new DataBaseImpl(new HashMap<>()), new HashMap<>());

    public void saveUser(User user) throws InterruptedException {
        proxy.saveUser(user);
    }

    public User getUser(int id) throws InterruptedException {
        return proxy.getUser(id);
    }
}
