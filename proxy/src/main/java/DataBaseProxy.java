import java.util.Map;

public class DataBaseProxy implements DataBase {

    private final DataBaseImpl dataBase;
    private final Map<Integer, User> cache;

    public DataBaseProxy(DataBaseImpl dataBase, Map<Integer, User> cache) {
        this.dataBase = dataBase;
        this.cache = cache;
    }

    @Override
    public void saveUser(User user) throws InterruptedException {
        dataBase.saveUser(user);
    }

    @Override
    public User getUser(int id) throws InterruptedException {
        User user = cache.get(id);
        if(user == null) {
            User userFromDB = dataBase.getUser(id);
            if(userFromDB == null) {
                throw new RuntimeException(String.format("Юзера под id = %d не существует", id));
            }
            cache.put(id, userFromDB);
            return userFromDB;
        }
        return user;
    }
}
