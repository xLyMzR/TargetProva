import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str_original;
        System.out.println("Insira uma String para inverter: ");
        str_original = sc.nextLine();

        System.out.println(inverterStr(str_original));
    }

    public static String inverterStr(String strOriginal){
        StringBuilder strBuild = new StringBuilder();
        strOriginal = strOriginal.trim();
        for(int i= strOriginal.length()-1; i>0; i--) {
            strBuild.append(strOriginal.charAt(i));
        }
        return  strBuild.toString();
    }

}
