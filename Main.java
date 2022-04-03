import java.util.Scanner;

class Main {
  public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
   
    System.out.println("Wybierz program:");
    System.out.println("1-Sprawdzanie trójkąta");
    System.out.println("2-Testowanie roku");
     System.out.println("3-Silnia");
    
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

      case 2:
        System.out.println("Podaj rok");
        int rok=scan.nextInt();
        if(rok % 4 == 0 && rok % 100 != 0 || rok % 400 == 0){
          System.out.println("Rok "+rok+" jest przestępny");
        }
        else System.out.println("Rok "+rok+" nie jest przestępny");
        break;

      case 3:
        System.out.println("Podaj n");
        int n= scan.nextInt();
        int silnia=1;
        
        for(int i=1;i<n+1;i++){
         silnia=silnia*i;
        }
        System.out.print("wynik: "+silnia);
        break;
    }
  }
}