package Odev1;

class Bolme extends Islem {

    private int bolSonuc;

    Bolme(int ilkSayi, int ikinciSayi) {
        this.setIlkSayi(ilkSayi);
        this.setIkinciSayi(ikinciSayi);
    }

    @Override
    public int islemHesapla() {
        try {
            bolSonuc = getIlkSayi() / getIkinciSayi();
        } catch (Exception e) {
            System.out.println("Hata sıfıra bölme işlemi gerçekleşemez!!!");
        }
        return bolSonuc;
    }

    @Override
    public String tur() {
        return "Bölme";
    }
}
