import java.util.Scanner;

class Main {
  public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
   
    System.out.println("Wybierz program:");
    System.out.println("1-Sprawdzanie trójkąta");
    
    int x=scan.nextInt();
    switch(x){
      case 1:
        int a,b,c;
      System.out.println("Podaj bok A");
        a=scan.nextInt();
        System.out.println("Podaj bok B");
        b=scan.nextInt();
        System.out.println("Podaj bok C");
        c=scan.nextInt();

        if(a+b>c&&a+c>b&&b+c>a) System.out.println("Warunek powstania trójkąta został spełniony");
        else System.out.println("Nie istnieje taki trójkąt");
      break;
    }
  }
}