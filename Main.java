public class Main {
    public static void main(String[] args) {
       int[] countBulls = new int[10];
        int[] countCows = new int[20];
        int[] countCalves = new int[200];

        for (int i = 0; i < countBulls.length; i++) {
            countBulls[i]=i;
            for (int j = 0; j < countCows.length ; j++) {
                countCows[j]=j;
                for (int k = 0; k < countCalves.length; k++) {
                    countCalves[k]=k;
                    if(countBulls[i] + countCows[j] + countCalves[k] == 100 && 20*countBulls[i] + 10*countCows[j] + countCalves[k] == 200){
                        System.out.println("Bulls:" + i + " Cows:" + j + " Calves:" +
                                "" + k);
                    }
                }

            }

        }
    }
}
