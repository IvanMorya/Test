package Test;

public class TestTrend {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 1000; i < 9999; i++) {
            if (i % 5 == 0 && ((i / 1000) % 10) % 2 == 0 && ((i / 100) % 10) % 2 == 0 && ((i / 10) % 10) % 2 == 0 && (i % 10) % 2 == 0);
            a++;
        }
        System.out.println(a);
    }
}
