/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.login.tood.java.swing;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author ToodTech
 */
public class ConexaoSqlServer {

    private JdbcTemplate conexaoDoBanco;

    public ConexaoSqlServer() {
        BasicDataSource dataSource = new BasicDataSource();
        
//        SQL SERVER
        dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        dataSource.setUrl("jdbc:sqlserver://svr-toodtech.database.windows.net:1433;database=DatabaseTood;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;");
        dataSource.setUsername("admin-toodtech");
        dataSource.setPassword("#Gfgrupo1");

        this.conexaoDoBanco = new JdbcTemplate(dataSource);
    }

    public JdbcTemplate getConexaoDoBanco() {
        return conexaoDoBanco;
    }
}
