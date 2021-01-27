package day8;

public class Task1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

//        String string = "";    // 195 мс
//        for (int i = 0; i < 20001; i++) {
//            string += i + " ";
//        }
//        System.out.println(string);

        StringBuilder sb = new StringBuilder();  // 20 мс
        for (int i = 0; i < 20001; i++) {
            sb.append(i + " ");
        }
        System.out.println(sb);

        long finish = System.currentTimeMillis();
        System.out.println(finish - start);
    }
}
