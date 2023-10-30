package methodoverriding24;
//creating child class
public class SBIBank extends Bank {
    @Override
    public int getRateOfInterest() {
        return 8;
    }
}
