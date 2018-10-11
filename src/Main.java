public class Main {

    public static void main(String[] args) {
        Zmogus adolfas = new Zmogus(false, "39009879800", "Adolfas", "Adolfelis", 56, 76, 176, "tamsi");
        Zmogus zose = new Zmogus(true, "39009879809", "Zose", "Genute", 35, 43, 152, "sviesi");
        Zmogus jonasValanciunas = new Zmogus(false, "39205067890", "Jonas", "Valanciunas", 26, 118, 213, "tamsi");
        System.out.print("Pries kara "+adolfas.getVardas() + " svere " + adolfas.getSvoris() + "kg.");
        adolfas.setSvoris(54);
        System.out.println(" Po karo "+adolfas.getVardas() + " svere " + adolfas.getSvoris() + "kg.");
        System.out.print("2017/2018 sezono metu "  + jonasValanciunas.getPavarde() + " svere " + jonasValanciunas.getSvoris() + "kg.");
        jonasValanciunas.setSvoris(115);
        System.out.print(" 2018/2019 sezono metu "  + jonasValanciunas.getVardas() + jonasValanciunas.getPavarde() + " sulyso ir svere " + jonasValanciunas.getSvoris() + "kg.");
    }
}
