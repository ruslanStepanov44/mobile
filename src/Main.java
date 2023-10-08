
public class Main {
    public static void main(String[] args) {
      int clientAccount = 100;
      int bonusScale = 100;
      int uploadVolume = 1500;
      int bonus;

      if (uploadVolume >= 1000){
          bonus = uploadVolume / bonusScale;
      } else {
          bonus = 0;
      }

      int totalAccount = clientAccount + uploadVolume + bonus;

      System.out.println(" Вы пополнили счёт на " + uploadVolume + " рублей " );
      System.out.println(" Бонус составил " + bonus + " рублей " );
      System.out.println(" Ваш баланс " + totalAccount + " рублей ");


    }
}
