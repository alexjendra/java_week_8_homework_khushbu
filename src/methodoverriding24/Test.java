package methodoverriding24;

public class Test {
    public static void main(String[] args) {
        SBIBank s = new SBIBank();
        Icici i = new Icici();
        AxisBank a = new AxisBank();
        System.out.println("SBI Rate of Interest : " + s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());
    }
}
