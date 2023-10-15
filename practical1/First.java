package practical1;

public class First {
    public static void main(String[] args){
        int maArray[] = {3, 5, 7, 12};
        int sum = 0;
        for (int i = 0; i < maArray.length; i++){
            sum = sum + maArray[i];
        }
        System.out.println(sum);
        System.out.println(sum / maArray.length);
    }
}
