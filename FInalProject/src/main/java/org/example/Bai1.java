package org.example;

public class Bai1 {
    public static void main(String[] args) {
        String s = "Abcs12321421@$$%#@#@#@%%^#%$%&^$";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isNormal(c)){

                result.append(c);
            }
        }
        String result2= result.toString();
        System.out.println(result2);


    }
    static boolean isNormal(char c){
        if (Character.isLetter(c) || Character.isDigit(c)){

            return true;
        }
        return false;
    }
}
