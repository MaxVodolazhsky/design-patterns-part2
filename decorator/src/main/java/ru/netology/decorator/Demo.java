package ru.netology.decorator;

public class Demo {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nВасилий Васильев,100000\nПетр Петров,912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("C:\\Users\\ugawr\\IdeaProjects\\design-patterns-part-2\\decorator\\src\\main\\resources\\out\\OutputDemo.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("C:\\Users\\ugawr\\IdeaProjects\\design-patterns-part-2\\decorator\\src\\main\\resources\\out\\OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
