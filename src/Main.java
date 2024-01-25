import java.util.Scanner;

public class Main {
    public static char getCharFromString(String str,int index)
            throws IllegalArgumentException, IndexOutOfBoundsException
    {
        if (index < 0) {
            throw new IllegalArgumentException();
            }
        return str.toCharArray()[index];
        }

    public static void main(String[] args) {

            System.out.println("введите 1-5:\n");
            Scanner scan = new Scanner(System.in);
            int slct = scan.nextInt();
            switch (slct) {
                case 1:
                    Zadanie_1 Z1 = new Zadanie_1();
                    Z1.task1();
                    break;

           case 5:
                    try
                    {
                        System.out.println(getCharFromString("hello",20));
                    }
                    catch (IllegalArgumentException e){
                        System.out.println("Индекс не может быть < 0");
                    }
                    catch (IndexOutOfBoundsException e){
                        System.out.println("Вы вышли за пределы массива");
                    }
                    break;
                default:
                    System.out.println("Такого варианта нет:");
                    scan.close();
    }
}
}