import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] monday = {"699 873 5734 | 2bQ1W9", "252 582 6634 | uE7h8Y", "576 979 1873 | xq9FNr", "576 979 1873 | xq9FNr"};
        String[] mondayLessons = {"Биология", "Защита Украины", "Физика", "Физика"};
        String[] tuesday = {"852 361 9153 | 4uLinX", "873 252 9989 | XYCbr9", "523  403 2616 | 2SteFq", "705 855 4520 | 3VUgCE"};
        String[] tuesdayLessons = {"История Украины", "Физ-ра", "Зарубежная Литература", "Украинская Литература"};
        String[] wednesday = {"907 846 1000 | BYuFZ7", "428 666 0817 | SAxch8", "730 006 6521 | Uhjn1W", "929 781 1306 | без кода"};
        String[] wednesdayLessons = {"География", "Информатика", "Математика", "Английский Язык"};
        String[] thursday = {"523  403 2616 | 2SteFq", "210 923 1684 | 6GNiHA", "705 855 4520 | 3VUgCE", "705 855 4520 | 3VUgCE", "428 666 0817 | SAxch8"};
        String[] thursdayLessons = {"Зарубежная Литература", "Всемировая История", "Украинский Язык", "Украинская Литература", "Информатика"};
        String[] friday = {"929 781 1306 | без кода", "210 923 1684 | 6GNiHA", "699 873 5734 | 2bQ1W9", "907 846 1000 | BYuFZ7", "766 4394 3770 | 707965"};
        String[] fridayLessons = {"Английский Язык", "Всемировая История", "Биология", "География", "Химия"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите день недели: ");
        String dayOfTheWeek = scanner.nextLine();
        if(dayOfTheWeek.equalsIgnoreCase("понедельник")) {
            for (int j = 0; j < monday.length; j++) {
                if (j == (monday.length - 1)) {
                    System.out.println("--" + mondayLessons[j] + " : " + monday[j]);
                    break;
                }
                System.out.println("--" + mondayLessons[j] + " : " + monday[j] + "\n");
            }
        } else if (dayOfTheWeek.equalsIgnoreCase("вторник")) {
            for (int j = 0; j < tuesday.length; j++) {
                if (j == (tuesday.length - 1)) {
                    System.out.println("--" + tuesdayLessons[j] + " : " + tuesday[j]);
                    break;
                }
                System.out.println("--" + tuesdayLessons[j] + " : " + tuesday[j] + "\n");
            }
        } else if (dayOfTheWeek.equalsIgnoreCase("среда")) {
            for (int j = 0; j < wednesday.length; j++) {
                if (j == (wednesday.length - 1)) {
                    System.out.println("--" + wednesdayLessons[j] + " : " + wednesday[j]);
                    break;
                }
                System.out.println("--" + wednesdayLessons[j] + " : " + wednesday[j] + "\n");
            }
        } else if (dayOfTheWeek.equalsIgnoreCase("четверг")) {
            for (int j = 0; j < thursday.length; j++) {
                if (j == (thursday.length - 1)) {
                    System.out.println("--" + thursdayLessons[j] + " : " + thursday[j]);
                    break;
                }
                System.out.println("--" + thursdayLessons[j] + " : " + thursday[j] + "\n");
            }
        } else if (dayOfTheWeek.equalsIgnoreCase("пятница")) {
            for (int j = 0; j < friday.length; j++) {
                if (j == (friday.length - 1)) {
                    System.out.println("--" + fridayLessons[j] + " : " + thursday[j]);
                    break;
                }
                System.out.println("--" + fridayLessons[j] + " : " + friday[j] + "\n");
            }
        }
    }
}