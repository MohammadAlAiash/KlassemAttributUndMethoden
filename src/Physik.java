public class Physik {

    public static final double gravitationskonstante_g = 9.81;
    public static final double lichtgeschwindigkeit_c = 2.998 * Math.pow(10,8);
    private static int anzahlPhysikObjekte = 0;

    public Physik() {
        this.anzahlPhysikObjekte++;
    }

    public int getAnzahlPhysikObjekte() {
        return anzahlPhysikObjekte;
    }

    public static double geschwindigkeit_v(double strecke_s, double zeit_t){
        return strecke_s/zeit_t;
    }
}
