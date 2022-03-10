import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestRestaurant {

    @Test
    public void restaurant_been_made() {
        
        Restaurant restaurant = new Restaurant("ValeRoyal", "https://ValeRoyal.jpg");
        assertEquals(restaurant.getRestaurantName(), "ValeRoyal");
        

    }

    
}
