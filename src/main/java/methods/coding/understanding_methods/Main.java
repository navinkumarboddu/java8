package methods.coding.understanding_methods;

public class Main {

    public static void main(String[] args) {
        RadarAirCraft radarAirCraft = new RadarAirCraft("RO123",280,20,895, 20000);

        int fuelConsumptionLitersPerHour = 2000;
        int ro123Range = radarAirCraft.calculateRange(fuelConsumptionLitersPerHour);

        System.out.println("Range is : " + ro123Range + " km");
        System.out.println(fuelConsumptionLitersPerHour);

        RadarLabelOptions options = new RadarLabelOptions(true, false);

        System.out.println();
        radarAirCraft.printLabel(options);
        System.out.println(options.isShowAltitudeTrendArrow());
        System.out.println(options.isShowSpeed());
    }
}
