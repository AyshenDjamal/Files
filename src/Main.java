import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu();


}
   //Menu Methodu
    public static void Menu() {
        System.out.println("1: Hesabınız yoxdur? REGISTER");
        System.out.println("2: Hesabınız var? SIGN IN");
        System.out.println("3: LOG OUT");


        System.out.print("Seçim Et: ");
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();


        switch (number) {
            case "1":
                signUp(sc);
                break;
            case "2":
                signIn(sc);
                break;
            case "3":
                logOut(sc);
                break;
            default:
                System.out.println("------------------------------");
                System.out.println("Düzgün seçim edin!\n");
                Clear();
                Menu();
                break;

        }
    }

    //Clear Method
    public static void Clear(){
        for (int i = 0; i < 3; i++) {
            System.out.println("*********************************");
        }
    }



        //Sign Up Method
        public static void signUp (Scanner sc){
            System.out.println("-----------SIGN UP--------------");
            System.out.print("Enter your name: ");
            String name = sc.next();
            System.out.print("Enter your  last name: ");
            String last_name = sc.next();
            System.out.print("Enter your email: ");
            String email = sc.next();
            System.out.print("Enter your new password: ");
            String password = sc.next();
            try {
                FileWriter writer = new FileWriter("logs.txt");
                writer.write("SIGN UP-Name: " + name + ", Last Name: " + last_name + ", Email: " + email + ", Password: " + password);
                System.out.println("------------------------------");
                System.out.println(name + " "+last_name + ", uğurla qeydiyyatdan keçdiniz!\n");
                writer.close();
            } catch (IOException e) {
                System.err.println("ERROR" + e.getMessage());
                e.printStackTrace();
            }
            Clear();
            Menu();

        }

        // Sign In Method
        public static void signIn (Scanner sc){
            System.out.println("----------SIGN IN----------");
            System.out.print("Enter your email: ");
            String email2 = sc.nextLine();
            System.out.print("Enter your password: ");
            String password2 = sc.nextLine();
            try {
                FileWriter writer = new FileWriter("logs.txt");
                writer.write("SIGN IN-EMAIL: " + email2 + ", PASSWORD: " + password2);
                writer.write("Uğurla sistemə giriş edildi!");
                System.out.println("------------------------------");
                System.out.println("Uğurla sistemə giriş edildi!\n");
                writer.close();
            } catch (IOException e) {
                System.err.println("ERROR" + e.getMessage());
                e.printStackTrace();
            }
            Clear();
            Menu();
        }

        //Log Out Method
        public static void logOut (Scanner sc){
            System.out.println("---------LOG OUT---------------");
            System.out.println("Çıxış etməyinizə əminsinizmi?");
            String choice = sc.nextLine();
            if (choice.equals("Beli")) {
                System.out.println("****************************");
                System.out.println("Ugurla çıxış edildi!");
            } else {
                System.out.println("Hələ də sistemdəsən!\n");
                Clear();
                Menu();
            }

        }
    }


        /*try {

            File file = new File("logs.txt");

            if(file.createNewFile()){
                System.out.println("Yeni File Yaradildi: "+file.getName());
            }else{
                System.out.println("File movcuddur");
            }

        }catch (IOException e){
            System.out.println("ERROR: "+ e.getMessage());
        }*/


        /*try{
            File file = new File("logs.txt");
            Scanner input = new Scanner(file);

            while(sc.hasNextLine()) {
                String data = input.nextLine();
                System.out.println(data);
            }
            sc.close();

        } catch (FileNotFoundException e) {
            System.err.println("ERROR"+e.getMessage());
            e.printStackTrace();
        }*/



