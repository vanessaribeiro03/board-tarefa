package com.projeto.board_tarefa;

import com.projeto.board_tarefa.persistence.migration.MigrationStrategy;
import com.projeto.board_tarefa.ui.MainMenu;

import java.sql.SQLException;

import static com.projeto.board_tarefa.persistence.config.ConnectionConfig.getConnection;

public class Main {
    public static void main(String[] args) throws SQLException {
        try(var connection = getConnection()){
            new MigrationStrategy(connection).executeMigration();
        }
        new MainMenu().execute();
    }
}
