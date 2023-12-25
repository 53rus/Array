import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[]box = new int[3];
        box[0] = 1;
        box[1] = 2;
        box[2] = 3;
        double[]gate = {1.57, 7.654, 9.986};
        int[]arr = {1, 5, 8, 10, 15};

        System.out.println("Задание 2");

        for (int i =0 ; i < box.length; i++){
            if (i == box.length - 1){
                System.out.println(box[i]);
                break;
            }
            System.out.print(box[i] + ",");
        }

        for (int i = 0; i < gate.length; i++) {
            if (i == gate.length - 1) {
                System.out.println(gate[i]);
                break;
            }
            System.out.print(gate[i] + ",");
        }
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1){
                System.out.println(arr[i]);
                break;
            }
            System.out.print(arr[i] + ",");
        }

        System.out.println("Задание 3");

        for (int i = box.length - 1; i >= 0; i--) {
            if (i==0){
                System.out.println(box[i]);
                break;
            }
            System.out.print(box[i] + ",");
        }

        for (int i = gate.length - 1; i >= 0; i--) {
            if (i==0){
                System.out.println(gate[i]);
                break;
            }
            System.out.print(gate[i] + ",");
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i==0){
                System.out.println(arr[i]);
                break;
            }
            System.out.print(arr[i] + ",");
        }
        System.out.println("Задание 4");
        for (int i = 0; i < box.length; i++){
            if (box[i]%2 != 0){
                box[i] = box[i] + 1;
            }
        }
        System.out.print(Arrays.toString(box));



    }
}