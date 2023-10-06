
public class Main {
    public static void main(String[] args) {
      int clientaccount = 100;
      int bonusscale = 100;
      int uploadvolume = 1500;
      int bonus;

      if (uploadvolume >= 1000){
          bonus = uploadvolume / bonusscale;
      } else {
          bonus = 0;
      }

      int totalaccount = clientaccount + uploadvolume + bonus;

      System.out.println("Вы пополнили счёт на" + uploadvolume + "рублей" );
      System.out.println("Бонус составил" + bonus + "рублей" );
      System.out.println("ваш баланс" + totalaccount + " рублей ");


    }
}
