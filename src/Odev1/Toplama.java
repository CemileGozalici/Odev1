package Odev1;

public class Toplama extends Islem {

    private int topSonuc;

    Toplama(int ilkSayi, int ikinciSayi) {
        this.setIlkSayi(ilkSayi);
        this.setIkinciSayi(ikinciSayi);
    }

    @Override
    public int islemHesapla() {
        topSonuc = getIlkSayi() + getIkinciSayi();
        return topSonuc;
    }

    @Override
    public String tur() {
        return "Toplama";
    }

}
