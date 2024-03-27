package methods.coding.understanding_methods;

public class RadarLabelOptions {

        private boolean showAltitudeTrendArrow;
        private boolean showSpeed;

    public RadarLabelOptions(boolean showAltitudeTrendArrow, boolean showSpeed) {
        this.showAltitudeTrendArrow = showAltitudeTrendArrow;
        this.showSpeed = showSpeed;
    }

    public boolean isShowAltitudeTrendArrow() {
        return showAltitudeTrendArrow;
    }

    public void setShowAltitudeTrendArrow(boolean showAltitudeTrendArrow) {
        this.showAltitudeTrendArrow = showAltitudeTrendArrow;
    }

    public boolean isShowSpeed() {
        return showSpeed;
    }

    public void setShowSpeed(boolean showSpeed) {
        this.showSpeed = showSpeed;
    }


}
