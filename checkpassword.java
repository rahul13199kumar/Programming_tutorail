package passwordchecker;

class GFG {

    static boolean checkPasword(String pass) {

        int coutDigit = 0;
        int countLetter = 0;
        if (pass.length() >= 8) {
            for (int i = 0; i < pass.length(); i++) {

                if (!Character.isLetter(pass.charAt(i)) && !Character.isDigit(pass.charAt(i))) {
                    return false;
                }
                if (Character.isLetter(pass.charAt(i))) {
                    countLetter++;
                }
                if (Character.isDigit(pass.charAt(i))) {
                    coutDigit++;
                }
            }
        }
        int A = 60;   //0111100
        int B = 13;  //    1101
        System.out.println(A & B);

        if (coutDigit > 2 && countLetter > 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        String s = "123456789";
        if (checkPasword(s) == true) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }

//        Scanner s = new Scanner(System.in);
//        //input 10 int
//        int[] numb = new int[10];
//        
//        int sum = 0;
//        System.out.println("Input 10 numbers;");
//
//        for (int i = 0; i < 10; i++) {
//            numb[i] = s.nextInt();
//        }
//
//        for (int i = 0; i < 10; i++) {
//            sum = sum + numb[i];
//        }
//        System.out.println("Sum =" + sum);
//  
    }
}

