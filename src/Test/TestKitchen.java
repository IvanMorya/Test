package Test;

import java.util.Arrays;

public class TestKitchen {

    private Object[] source;
    private int variationLength;

    public TestKitchen(Object[] source, int variationLength) {
        this.source = source;
        this.variationLength = variationLength;
    }

    public Object[][] getVariations() {
        int srcLength = source.length;
        int permutations = (int) Math.pow(srcLength, variationLength);

        Object[][] table = new Object[permutations][variationLength];

        for (int i = 0; i < variationLength; i++) {
            int t2 = (int) Math.pow(srcLength, i);
            for (int p1 = 0; p1 < permutations;) {
                for (int al = 0; al < srcLength; al++) {
                    for (int p2 = 0; p2 < t2; p2++) {
                        table[p1][i] = source[al];
                        p1++;
                    }
                }
            }
        }

        return table;
    }

    public static void main(String[] args) {
        TestKitchen gen = new TestKitchen(
                new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11},
                2);

        Object[][] variations = gen.getVariations();

        for (Object[] s : variations) {
            System.out.println(Arrays.toString(s));
        }
    }
//    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        String[] array = {"a", "b", "c", "d", "i", "f", "g", "h", "y", "j", "k"};
//        String line = "";
//        boolean duplicate = false;
//        int length = 1;
//        list = recursionCombinations(list, array, line, duplicate, length);
//        System.out.println(list.size());
//
//    }
//
//    public static List<String> recursionCombinations(List<String> list, String[] array, String line, boolean duplicate, int length) {
//        if (list != null && array != null && line != null) {
//            if (length == 0) {
//                line = line.trim();
//                if (!line.isEmpty()) {
//                    list.add(line.trim());
//                }
//            } else {
//                for (int index = 0; index < array.length; index++) {
//                    String[] nextArray = duplicate ? array : removeElementToArray(array, index);
//                    String nextLine = line.concat(" ").concat(array[index]);
//                    list = recursionCombinations(list, nextArray, nextLine, duplicate, length - 1);
//                }
//            }
//        }
//        return list;
//    }
//
//    static String[] removeElementToArray(String[] array, int index) {
//
//    }
}
