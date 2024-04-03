public class AirTransportation extends Transport {
    private String name;
    private int numberOfContainers;
    private static final double honorary = 4;
    
    public AirTransportation (String name, int numberOfContainers) {
        this.name = name;
        this.numberOfContainers = numberOfContainers;
        setFees(honorary);
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getNumberOfContainers() {
        return this.numberOfContainers;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setNumberOfContainers(int numberOfContainers) {
        if (numberOfContainers >= 0) {
            this.numberOfContainers = numberOfContainers;
        }
    }
    
    @Override
    public double getPriceWithFees() {
        return getPrice() * (1.0 + (getFees() * 0.01));
    }
    
    @Override
    public String getTransportType() {
        return "Transporte Aereo";
    }
    
    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(String.format("%15s: %s\n", "Nome", this.name));
        sb.append(String.format("%15s: %s\n", "NºContentores", this.numberOfContainers));
        return sb.toString();
    }
}