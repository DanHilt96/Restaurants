import java.sql.Connection;
import java.sql.DriverManager;

public class App {
    public static void main(String[] args) throws Exception {
        new DB("jdbc:sqlite:./db_1.sql");
        Restaurant.init();
        //Restaurant restaurant = new Restaurant("White Barn", "https://images.White_Barn.jpg");
        DB.conn.close();

    }
}
