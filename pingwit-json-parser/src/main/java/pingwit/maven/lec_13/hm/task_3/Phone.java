package pingwit.maven.lec_13.hm.task_3;

public record Phone(String producer, String nomination, Integer price) {
    public Phone {
    }

    @Override
    public String producer() {
        return producer;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", nomination='" + nomination + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
