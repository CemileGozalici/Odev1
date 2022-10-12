package Odev1;

class Cikarma extends Islem {

    private int cikSonuc;

    public Cikarma(int ilkSayi, int ikinciSayi) {
        this.setIlkSayi(ilkSayi);
        this.setIkinciSayi(ikinciSayi);
    }

    @Override
    public int islemHesapla() {
        cikSonuc = getIlkSayi() - getIkinciSayi();
        return cikSonuc;
    }

    @Override
    public String tur() {
        return "Çıkarma";
    }
}
