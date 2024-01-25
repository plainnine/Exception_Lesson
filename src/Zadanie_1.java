import java.util.Scanner;

//Пользователь вводит с клавиатуры в строку набор символов от 0-9.
//Необходимо преобразовать строку в число целого типа.
//Предусмотреть случай выхода за границы диапазона, определяемого типом int. Используйте механизм исключений.
public class Zadanie_1 {
    public static char getCharFromString(String str,int index)
            throws IllegalArgumentException, IndexOutOfBoundsException
    {
        if (index < 0) {
            throw new IllegalArgumentException();
        }
        return str.toCharArray()[index];
    }
  public void task1()  {
      System.out.println("введите набор символов от 0-9:\n");
      Scanner scan = new Scanner(System.in);

      String str1 = scan.nextLine();


      try
      {
          System.out.println(getCharFromString("hello",20));
      }
      catch (IllegalArgumentException e)
      {
          System.out.println("Индекс не может быть < 0");
      }
      catch (IndexOutOfBoundsException e)
      {
          System.out.println("Вы вышли за пределы массива");
      }
  }
}
