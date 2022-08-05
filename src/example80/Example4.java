package example80;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 14.07.2022_18:44
 */
public class Example4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kun: ");
        int day = scanner.nextInt();
        System.out.print("Oy: ");
        int counter = 0, month = scanner.nextInt();
        if (day < 1 || day > 32) {
            System.out.println("Bunday sana yo'q");
        } else if (month < 1 || month > 12) {
            System.out.println("Bunday oy yo'q");
        } else {
            switch (month) {
                case 1 -> {
                    if (day <= 30) {
                        day++;
                        LocalDate sana1=LocalDate.of (0,month,day);
                        DateTimeFormatter sana2= DateTimeFormatter.ofPattern ("MM.dd");
                        System.out.println (sana2.format (sana1));
                    }
                    else if (day == 31) {
                        day = 1;
                        month+=1;
                        LocalDate sana1=LocalDate.of (0,month,day);
                        DateTimeFormatter sana2= DateTimeFormatter.ofPattern ("MM.dd");
                        System.out.println (sana2.format (sana1));
                    }
                }
                case 2 -> {
                    if (day <= 27) {
                        day++;
                        LocalDate sana1=LocalDate.of (0,month,day);
                        DateTimeFormatter sana2= DateTimeFormatter.ofPattern ("MM.dd");
                        System.out.println (sana2.format (sana1));
                    }
                    else if (day <= 28) {
                        day = 1;
                        month+=1;
                        LocalDate sana1=LocalDate.of (0,month,day);
                        DateTimeFormatter sana2= DateTimeFormatter.ofPattern ("MM.dd");
                        System.out.println (sana2.format (sana1));
                    }else {
                        System.out.println ("Bunday sana yoq" );
                    }
                }
                case 3 -> {
                    if (day <= 30) {
                        day++;
                        LocalDate sana1=LocalDate.of (0,month,day);
                        DateTimeFormatter sana2= DateTimeFormatter.ofPattern ("MM.dd");
                        System.out.println (sana2.format (sana1));
                    }
                    else if (day <= 31) {
                        day = 1;
                        month+=1;
                        LocalDate sana1=LocalDate.of (0,month,day);
                        DateTimeFormatter sana2= DateTimeFormatter.ofPattern ("MM.dd");
                        System.out.println (sana2.format (sana1));
                    }
                }
                case 4 -> {
                    if (day < 30) {
                        day++;
                        LocalDate sana1=LocalDate.of (0,month,day);
                        DateTimeFormatter sana2= DateTimeFormatter.ofPattern ("MM.dd");
                        System.out.println (sana2.format (sana1));
                    }
                    else if (day <= 31) {
                        day = 1;
                        month+=1;
                        LocalDate sana1=LocalDate.of (0,month,day);
                        DateTimeFormatter sana2= DateTimeFormatter.ofPattern ("MM.dd");
                        System.out.println (sana2.format (sana1));
                    }
                }
                case 5 -> {
                    if (day <= 30) {
                        day++;
                        LocalDate sana1=LocalDate.of (0,month,day);
                        DateTimeFormatter sana2= DateTimeFormatter.ofPattern ("MM.dd");
                        System.out.println (sana2.format (sana1));
                    }else if (day <= 31) {
                        day = 1;
                        month+=1;
                        LocalDate sana1=LocalDate.of (0,month,day);
                        DateTimeFormatter sana2= DateTimeFormatter.ofPattern ("MM.dd");
                        System.out.println (sana2.format (sana1));
                    }
                }
                case 6 -> {
                    if (day <= 29) {
                        day++;
                        LocalDate sana1=LocalDate.of (0,month,day);
                        DateTimeFormatter sana2= DateTimeFormatter.ofPattern ("MM.dd");
                        System.out.println (sana2.format (sana1));
                    }else if (day <= 30) {
                        day = 1;
                        month+=1;
                        LocalDate sana1=LocalDate.of (0,month,day);
                        DateTimeFormatter sana2= DateTimeFormatter.ofPattern ("MM.dd");
                        System.out.println (sana2.format (sana1));
                    }
                }
                case 7 -> {
                    if (day <= 30) {
                        day++;
                        LocalDate sana1=LocalDate.of (0,month,day);
                        DateTimeFormatter sana2= DateTimeFormatter.ofPattern ("MM.dd");
                        System.out.println (sana2.format (sana1));
                    }else if (day <= 31) {
                        day = 1;
                        month+=1;
                        LocalDate sana1=LocalDate.of (0,month,day);
                        DateTimeFormatter sana2= DateTimeFormatter.ofPattern ("MM.dd");
                        System.out.println (sana2.format (sana1));
                    }
                }
                case 8 -> {
                    if (day <= 30) {
                        day++;
                        LocalDate sana1=LocalDate.of (0,month,day);
                        DateTimeFormatter sana2= DateTimeFormatter.ofPattern ("MM.dd");
                        System.out.println (sana2.format (sana1));
                    }else if (day <= 31) {
                        day = 1;
                        month+=1;
                        LocalDate sana1=LocalDate.of (0,month,day);
                        DateTimeFormatter sana2= DateTimeFormatter.ofPattern ("MM.dd");
                        System.out.println (sana2.format (sana1));
                    }
                }
                case 9 -> {
                    if (day <= 29) {
                        day++;
                        LocalDate sana1=LocalDate.of (0,month,day);
                        DateTimeFormatter sana2= DateTimeFormatter.ofPattern ("MM.dd");
                        System.out.println (sana2.format (sana1));
                    }else if (day <= 30) {
                        day = 1;
                        month+=1;
                        LocalDate sana1=LocalDate.of (0,month,day);
                        DateTimeFormatter sana2= DateTimeFormatter.ofPattern ("MM.dd");
                        System.out.println (sana2.format (sana1));
                    }
                }
                case 10 -> {
                    if (day <= 30) {
                        day++;
                        LocalDate sana1=LocalDate.of (0,month,day);
                        DateTimeFormatter sana2= DateTimeFormatter.ofPattern ("MM.dd");
                        System.out.println (sana2.format (sana1));
                    }else if (day <= 31) {
                        day = 1;
                        month+=1;
                        LocalDate sana1=LocalDate.of (0,month,day);
                        DateTimeFormatter sana2= DateTimeFormatter.ofPattern ("MM.dd");
                        System.out.println (sana2.format (sana1));
                    }
                }
                case 11 -> {
                    if (day <= 29) {
                        day++;
                        LocalDate sana1=LocalDate.of (0,month,day);
                        DateTimeFormatter sana2= DateTimeFormatter.ofPattern ("MM.dd");
                        System.out.println (sana2.format (sana1));
                    }else if (day <= 30) {
                        day = 1;
                        month+=1;
                        LocalDate sana1=LocalDate.of (0,month,day);
                        DateTimeFormatter sana2= DateTimeFormatter.ofPattern ("MM.dd");
                        System.out.println (sana2.format (sana1));
                    }
                }
                case 12 -> {
                    if (day <= 30) {
                        day++;
                        LocalDate sana1=LocalDate.of (0,month,day);
                        DateTimeFormatter sana2= DateTimeFormatter.ofPattern ("MM.dd");
                        System.out.println (sana2.format (sana1));
                    }else if (day <= 31) {
                        day= 1;
                        month=1;
                        LocalDate sana1=LocalDate.of (0,month,day);
                        DateTimeFormatter sana2= DateTimeFormatter.ofPattern ("MM.dd");
                        System.out.println (sana2.format (sana1));
                    }
                }
            }
        }
    }

}
