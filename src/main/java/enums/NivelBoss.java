package enums;

public enum NivelBoss {
    FACIL(1,3),
    MEDIO(2,5),
    DIFICIL(3,7);

    private int key;
    private int forca;

    NivelBoss(int key, int forca){
        this.key = key;
        this.forca = forca;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getForca() {
        return forca;
    }
}
