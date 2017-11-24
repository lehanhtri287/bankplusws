package com.example.storews.DAO;

import com.example.storews.connection.MyPool;
import org.apache.commons.pool.ObjectPool;

import java.sql.Connection;

public class Test {
    public static void main(String[] args) {
        ObjectPool pool = MyPool.getInstance();

        try {
            Connection connection = (Connection) pool.borrowObject();
            System.out.println(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
