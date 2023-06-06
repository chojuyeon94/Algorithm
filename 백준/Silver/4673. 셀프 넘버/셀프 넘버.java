public class Main {
    public static void main(String[] args) {

        boolean[] checkConstructor = new boolean[10001];

        for(int i = 1; i < 10001; i++) {

            int n = constructor(i);

            if (n < 10001) checkConstructor[n] = true;
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i < 10001; i++){

            if(!checkConstructor[i]) stringBuilder.append(i).append('\n');



        }
        System.out.println(stringBuilder);
    }


    public static int constructor(int num){

        int sum = num;

        while(num != 0){
            sum += num % 10;
            num = num / 10;
        }

        return sum;

    }

}