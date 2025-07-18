package me.dio;

import me.dio.persistence.migration.MigrationStrategy;

import java.sql.SQLException;

import static me.dio.persistence.config.ConnectionConfig.getConnection;



public class Main {

    public static void main(String[] args) throws SQLException {
        try(var connection = getConnection()){
            new MigrationStrategy(connection).executeMigration();
        }
    }
}





