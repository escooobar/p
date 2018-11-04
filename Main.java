import java.util.Scanner;

public class Main {

    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

      human human=new human();

        System.out.print("IMIE: ");
        human.setName(sc.nextLine());

        System.out.print("NAZWISKO: ");
        human.setSurname(sc.nextLine());

        System.out.print("KOLOR OCZU: ");
        human.setEyes(sc.nextLine());

        System.out.print("WIEK: ");
        human.setAge(sc.nextInt());

        System.out.print("PODAJ SWÓJ WZROST W CM: ");
        human.setGrowth(sc.nextInt());

        System.out.println("Nazywasz się "+human.getName()+" "+ human.getSurname()+ " masz lat " + human.getAge() + " i " + human.getGrowth() + " cm wzrostu " + " ,kolor oczu  " + human.getEyes());
    }
}