public class Main {
    public static void main(String[] args) {

        System.out.println(Physik.geschwindigkeit_v(5.2,0.6)+ "m/s");
        System.out.println(Physik.gravitationskonstante_g);
        System.out.println(Physik.lichtgeschwindigkeit_c);

        Physik erstePhysikObjekt = new Physik();
        Physik zweitePhysikObjekt = new Physik();
        Physik drittePhysikObjekt = new Physik();

        System.out.println(erstePhysikObjekt.getAnzahlPhysikObjekte());
        System.out.println(zweitePhysikObjekt.getAnzahlPhysikObjekte());
        System.out.println(drittePhysikObjekt.getAnzahlPhysikObjekte());
    }
}