public class Nextgreaterbinary {
    public static void main(String args[]) {
        String p = "01101";
        char[] B = p.toCharArray();

        int n = B.length;
        boolean found = false;

        for (int i = n - 2; i >= 0; i--) {
            if (B[i] == '0' && B[i + 1] == '1') {
                char temp = B[i];
                B[i] = B[i + 1];
                B[i + 1] = temp;
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Next greater binary number: " + new String(B));
        } else {
            System.out.println("No greater binary number possible");
        }
    }
}
