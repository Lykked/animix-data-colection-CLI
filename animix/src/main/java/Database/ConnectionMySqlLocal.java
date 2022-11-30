package Database;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Eduardo
 */
public class ConnectionMySqlLocal {
    private JdbcTemplate connectionMySql; 
        
    public ConnectionMySqlLocal(){
        BasicDataSource datasourceMySql = new BasicDataSource();
    
        datasourceMySql.setDriverClassName("com.mysql.cj.jdbc.Driver");
        datasourceMySql.setUrl("jdbc:mysql://127.0.0.1:3306/animix");
        datasourceMySql.setUsername("root");
        datasourceMySql.setPassword("urubu100");
        connectionMySql = new JdbcTemplate(datasourceMySql);
    } 

    public JdbcTemplate getConnectionMySql() {
        return connectionMySql;
    }
}
