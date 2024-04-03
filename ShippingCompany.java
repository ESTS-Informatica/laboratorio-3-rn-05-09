import java.util.ArrayList;
import java.util.HashSet;
public class ShippingCompany extends HashSet<Transport> {
    private String name;
    private ArrayList <Transport> inService;
    
    public ShippingCompany (String name) {
        this.name = name;
        this.inService = new ArrayList<Transport>();
    }
    
    public String getName() {
        return this.name;
    }
    
    public ArrayList<Transport> getInService() {
        return this.inService;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Transport test : inService) {
            sb.append(test.toString());
        }
        return sb.toString();
    }
}