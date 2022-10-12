package Odev1;

public abstract class Islem {

    private int ilkSayi;
    private int ikinciSayi;

    public int getIlkSayi() {
        return ilkSayi;
    }

    public final void setIlkSayi(int ilkSayi) {
        this.ilkSayi = ilkSayi;
    }

    public int getIkinciSayi() {
        return ikinciSayi;
    }

    public final void setIkinciSayi(int ikinciSayi) {
        this.ikinciSayi = ikinciSayi;
    }

    public abstract int islemHesapla();

    public abstract String tur();

    public void sonucYazdir() {
        System.out.println();
        System.out.println(this.tur() + " işleminin sonucu=" + this.islemHesapla());
        System.out.println();
    }
}
