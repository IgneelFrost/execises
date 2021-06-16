public class New2 {
    public static void main(String[] args) {
        int i = 0;
        int numb1 = 0, numb2 = 1;
        int sum = 0;
        while (i < 4_000_000) {
            i = numb1 + numb2;
            numb1 = numb2;
            numb2 = i;
                if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Answer: "+ sum);
    }
}
