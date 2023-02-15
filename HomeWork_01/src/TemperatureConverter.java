public class TemperatureConverter {

    public TemperatureConverter() {
    }

    public static double toF(double T_C) {
        double T_F = (T_C * 9 / 5) + 32;
        return T_F;
    }

    public static double toK(double T_C) {
        double T_K = T_C + 273.15;
        return T_K;
    }

    public static double toR(double T_C) {
        double T_R = T_C * 0.8;
        return T_R;
    }
}
