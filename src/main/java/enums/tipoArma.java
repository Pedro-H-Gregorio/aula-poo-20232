package enums;

public enum tipoArma {
    CORPO_A_CORPO(1,"Corpo a corpo"),
    MAGIA(2,"Arma de magia");

    private int key;
    private String value;
    tipoArma(int key, String value){
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
