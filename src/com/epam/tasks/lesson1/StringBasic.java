package com.epam.tasks.lesson1;

public class StringBasic {

    public static void main(String[] args) {

        int var = 20, i = 0;
        do {
            while (true) {
                if (i++ > var) break;
            }
        } while (i < var--);
        System.out.println(var);


//        List<String> bunnies = new ArrayList<>();
//        bunnies.add("Timmy");
//        bunnies.add("Billy");
//        bunnies.add("Honney");
//        bunnies.add("Himera");
//        System.out.println(bunnies);
//        bunnies.removeIf(s -> s.charAt(0) != 'T');
//        System.out.println(bunnies);

//        StringBuilder alpha = new StringBuilder();
//        for (char current = 'a'; current <= 'z'; current++)
//            alpha.append(current);
//        System.out.println(alpha);

//        StringBuilder sb = new StringBuilder("animals");
//        sb.insert(7, "-");
//        sb.insert(0, "-");
//        sb.insert(4, "-");
//        System.out.println(sb.reverse());
//
//        String str = sb.toString();
//        System.out.println(str);

//        int[][] twoD = new int[3][2];
//        for (int[] inner : twoD) {
//            for (int num : inner) {
//                System.out.println(num + " ");
//            }
//            System.out.println();
//        }

//        List<String> list = new ArrayList<String>();
//        list.add("one");
//        list.add("two");
//        list.add(7);
//        for (String s :
//                list) {
//            System.out.println(s);
//        }

    }

}
