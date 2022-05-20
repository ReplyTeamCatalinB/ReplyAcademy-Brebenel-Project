package eu.reply.academy.exer.radar;

public class RadarAircraft {

    private String callSign;
    private int altitudeFl;
    private int rateClimbDescent;
    private int speedKmh;
    private int remainingFuel;

    public RadarAircraft(String callSign, int altitudeFl, int rateClimbDescent, int speedKmh, int remainingFuel) {
        this.callSign = callSign;
        this.altitudeFl = altitudeFl;
        this.rateClimbDescent = rateClimbDescent;
        this.speedKmh = speedKmh;
        this.remainingFuel = remainingFuel;
    }

    public int calculateRange(int consumptionLitersPerHour) {
        int flightHours = remainingFuel / consumptionLitersPerHour;

        return flightHours * speedKmh;
    }

    public void printLabel(RadarLabelOptions displayOptions) {
        StringBuilder sb =  new StringBuilder();
        sb.append(System.lineSeparator());
        sb.append("FL ").append(altitudeFl);

        if (displayOptions.isShowAltitudeTrendArrow()) {
            if (rateClimbDescent > 0){
                sb.append(" ▲");
            }else if (rateClimbDescent < 0) {
                sb.append(" ▼");
            }
        }

        if (displayOptions.isShowSpeed()) {
            sb.append(System.lineSeparator());
            sb.append(speedKmh).append(" Kmh");
        }

        System.out.println(sb);

        displayOptions.setShowAltitudeTrendArrow(false);
        displayOptions.setShowSpeed(true);










    }
}
