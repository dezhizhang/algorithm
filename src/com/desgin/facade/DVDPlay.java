package src.com.desgin.facade;

public class DVDPlay {
  private static DVDPlay instance = new DVDPlay();

  public static DVDPlay getInstance() {
    return  instance;
  }

  public void on() {
    System.out.println("dvd on");
  }

  public void  off() {
    System.out.println("dvd off");
  }

  public void play() {
    System.out.println("dvd is playing");
  }

  public void pause() {
    System.out.println("dvd pause...");
  }



}
