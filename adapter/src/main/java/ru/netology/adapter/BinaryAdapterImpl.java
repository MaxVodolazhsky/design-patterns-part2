package ru.netology.adapter;

public class BinaryAdapterImpl implements BinaryAdapter {

    private final BinaryDataSource binaryDataSource;

    public BinaryAdapterImpl(BinaryDataSource binaryDataSource) {
        this.binaryDataSource = binaryDataSource;
    }

    @Override
    public String getDataAsString() {
        return new String(binaryDataSource.getBinaryData());
    }
}
