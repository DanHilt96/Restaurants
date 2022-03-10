import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestMenu {
 
    
    @Test
    public void menu_has_title() {
        Menu starters = new Menu("Starters");
        starters.getItem().add(new Item("BBQ Ribs", 9.99));
        assertEquals(starters.title, "Starters");
        
    }
}
