package com.alenon.connection.pool;

public interface Connection extends AutoCloseable {
    void connect();
    void close();
}
