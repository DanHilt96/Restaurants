import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CRUDtests {
    @Before
    public void setUp() {
        new DB("jdbc:sqlite::memory:");

    }

    @Test
    public void can_connect_ok() throws SQLException {
        assertTrue(DB.conn instanceof Connection);
    }

    @Test
    public void db_is_provisioned() throws SQLException {
        Statement checkSelect = DB.conn.createStatement();
        checkSelect.execute("SELECT * FROM restaurants;");
    }

    @Test
    public void create() throws SQLException {
       PreparedStatement insert = DB.conn.prepareStatement("INSERT INTO restaurants (name) VALUES (?);");
       insert.setString(1, "Vale Royal");
       insert.executeUpdate();
       Statement getRestaurant = DB.conn.createStatement();
       ResultSet results = getRestaurant.executeQuery("SELECT * FROM restaurants;");
       while(results.next()) {
           assertEquals(results.getString(2), "Vale Royal");
       }
    }

    @After
    public void teardown() throws SQLException {
        DB.conn.close();
    }
}
