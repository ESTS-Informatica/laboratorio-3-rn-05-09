public class GroundTransportation extends Transport {
    private String licensePlate;
    private static final double honorary = 3;
    
    public GroundTransportation (String licensePlate) {
        this.licensePlate = licensePlate;
        setFees(honorary);
    }
    
    public String getLicensePlate() {
        return this.licensePlate;
    }
    
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
    
    @Override    
    public double getPriceWithFees() {
        return getPrice() * (1.0 + (getFees() * 0.01));
    }
    
    @Override
    public String getTransportType() {
        return "Transporte Terrestre";
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(String.format("%15s: %s\n", "Matricula", this.licensePlate));
        return sb.toString();
    }
}