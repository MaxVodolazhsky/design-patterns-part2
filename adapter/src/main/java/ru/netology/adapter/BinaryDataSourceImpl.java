package ru.netology.adapter;

import java.nio.charset.StandardCharsets;

public class BinaryDataSourceImpl implements BinaryDataSource{
    @Override
    public byte[] getBinaryData() {
        return "hello".getBytes(StandardCharsets.UTF_8);
    }
}
