package Odev1;

class Carpma extends Islem {

    private int carpSonuc;

    public Carpma(int ilkSayi, int ikinciSayi) {
        this.setIlkSayi(ilkSayi);
        this.setIkinciSayi(ikinciSayi);
    }

    @Override
    public int islemHesapla() {
        carpSonuc = getIlkSayi() * getIkinciSayi();
        return carpSonuc;
    }

    @Override
    public String tur() {
        return "Çarpma";
    }
}
