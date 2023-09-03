import java.util.Scanner;

public class PhoneCleanerRegex {

    public static void main(String[] args) {
        String regex = "[^0-9]";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                scanner.close();
                break;
            }
            String newInput = input.replaceAll(regex, "");
            if(newInput.length() <= 10 && newInput.length() >= 9){
                System.out.println( 7 + newInput);
            } else if(newInput.length() > 11 || newInput.length() < 10 || newInput.charAt(0) == '9'){
                System.out.println("Неверный формат номера");
            } else if(newInput.charAt(0) == '8'){
                newInput = newInput.replaceFirst("[0-9]{1}", "7");
                System.out.println(newInput);
            } else {
                System.out.println(newInput);
            }
        }
    }
}