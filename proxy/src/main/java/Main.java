public class Main {

    public static void main(String[] args) throws InterruptedException {
        User max = new User(1, "Максим");
        User maria = new User(2, "Мария");
        User daria = new User(3, "Дарья");

        DataBaseConnector connector = new DataBaseConnector();

        connector.saveUser(max);
        connector.saveUser(maria);
        connector.saveUser(daria);

        long now = System.currentTimeMillis();
        connector.getUser(1);
        long after = System.currentTimeMillis();
        System.out.println("\nДлительность запроса без кэша = " + (after - now));

        System.out.println("----------------------------------------------------");

        long nowWithCache = System.currentTimeMillis();
        connector.getUser(1);
        long afterWithCache = System.currentTimeMillis();
        System.out.println("Длительность запроса без кэша = " + (afterWithCache - nowWithCache));
    }
}
