package ru.netology.adapter;

public class Demo {

    public static void main(String[] args) {
        BinaryDataSource binaryDataSource = new BinaryDataSourceImpl();

        BinaryAdapterImpl binaryAdapter = new BinaryAdapterImpl(binaryDataSource);

        System.out.println(binaryAdapter.getDataAsString());
    }
}
