package pingwit.lec_7.hm.task_7;

public class BenchmarkMain {
    public static void main(String[] args) {
        String myString = "";
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();

        int count = 666_666;

        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            myString = myString.concat("A");
        }
        long finish = System.currentTimeMillis();
        System.out.println("String " + (finish - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            stringBuilder.append("A");
        }
        finish = System.currentTimeMillis();
        System.out.println("StringBuilder " + (finish - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            stringBuffer.append("A");
        }
        finish = System.currentTimeMillis();
        System.out.println("StringBuffer " + (finish - start));

    }
}
