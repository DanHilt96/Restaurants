import java.util.ArrayList;


public class Menu {
    
    public ArrayList <Item> item;
    public String title;

    public Menu (String title) {    
        this.title = title;
        this.item = new ArrayList<Item>();

        
    }

    public String getMenu() {
        return title;
    }

    public ArrayList<Item> getItem() {
        return this.item;
    }

    
    

}
