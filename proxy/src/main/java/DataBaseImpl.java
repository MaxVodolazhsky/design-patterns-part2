import java.util.Map;

public class DataBaseImpl implements DataBase {

    private final Map<Integer, User> dataBase;

    public DataBaseImpl(Map<Integer, User> dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void saveUser(User user) throws InterruptedException {
        int id = user.getId();
        System.out.printf("Сохраняю юзера под id = %d ...\n", id);
        Thread.sleep(1000L);
        dataBase.put(id, user);
        System.out.println("Сохранил юзера!");
    }

    @Override
    public User getUser(int id) throws InterruptedException {
        System.out.printf("Достаю юзера под id = %d ...\n", id);
        Thread.sleep(3000);

        return dataBase.get(id);
    }
}
