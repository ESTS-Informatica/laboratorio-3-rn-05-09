public class GroundTransportation extends Transport {
    private String licensePlate;
    private static final double honorary = 0.03;
    
    public GroundTransportation (String licensePlate) {
        this.licensePlate = licensePlate;
    }
    
    public String getLicensePlate() {
        return this.licensePlate;
    }
    
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
}