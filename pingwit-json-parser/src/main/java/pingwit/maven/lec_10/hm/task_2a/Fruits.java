package pingwit.maven.lec_10.hm.task_2a;

public enum Fruits {
    ORANGE("orange"),
    BANANA("banana"),
    KIWI("kiwi"),
    LIME("lime"),
    WATERMELON("watermelon");

    private String fruitsType;

    Fruits(String fruitsType) {
        this.fruitsType = fruitsType;
    }

    public String getFruitsType() {
        return fruitsType;
    }

    public void setFruitsType(String fruitsType) {
        this.fruitsType = fruitsType;
    }
}
