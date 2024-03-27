package methods.coding.understanding_methods;

public class RadarAirCraft {

    private String callSign;
    private int altitudeFL;
    private int rateClimbDescent;
    private int speedKmh;
    private int remainingFuel;

    public RadarAirCraft(String callSign, int altitudeFL, int rateClimbDescent, int speedKmh, int remainingFuel) {
        this.callSign = callSign;
        this.altitudeFL = altitudeFL;
        this.rateClimbDescent = rateClimbDescent;
        this.speedKmh = speedKmh;
        this.remainingFuel = remainingFuel;
    }

    public int calculateRange(int fuelConsumptionLitersPerHour) throws ArithmeticException {
        int flightHours = remainingFuel / fuelConsumptionLitersPerHour;
        fuelConsumptionLitersPerHour = 0;
        return flightHours * speedKmh;
    }

    public void printLabel(RadarLabelOptions displayOptions){
        StringBuilder sb = new StringBuilder(callSign);
        sb.append("FL ").append(altitudeFL);

        if(displayOptions.isShowAltitudeTrendArrow()){
            if(rateClimbDescent > 0){
                sb.append(" up");
            } else if(rateClimbDescent < 0){
                sb.append(" down");
            }
        }

        if(displayOptions.isShowSpeed()){
            sb.append(speedKmh).append(" kmh");
        }

        System.out.println(sb);

        displayOptions.setShowAltitudeTrendArrow(false);
    }
}
