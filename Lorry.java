public class Lorry extends GroundTransportation {
    private int numberOfPallets;
    private int trailers;
    
    public Lorry(int numberOfPallets, int trailers, String licensePlate) {
        super(licensePlate);
        this.numberOfPallets = numberOfPallets;
        this.trailers = trailers;
    }
    
    public int getNumberOfPallets() {
        return this.numberOfPallets;
    }
    
    public int getTrailers() {
        return this.trailers;
    }
    
    public void setNumberOfPallets (int numberOfPallets) {
        this.numberOfPallets = numberOfPallets;
    }
    
    public void setTrailers (int trailers) {
        this.trailers = trailers;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(String.format("%15s: %s\n", "NºPaletes", this.numberOfPallets));
        sb.append(String.format("%15s: %s\n", "NºAtrelados", this.trailers));
        return sb.toString();
    }
}