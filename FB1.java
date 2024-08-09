public class FB1 {
/** Calculate the length of the initial segment of str1 which consists entirely
* of characters in str2.*/

        public static int lengthOfInitialSegment(String str1, String str2) {
            int length = 0;

            for (int i = 0; i < str1.length(); i++) {
                if (str2.indexOf(str1.charAt(i)) != -1) {
                    length++;
                } else {
                    break;
                }
            }

            return length;
        }

        public static void main(String[] args) {
            String str1 = "abcdefg";
            String str2 = "abcxyz";

            int result = lengthOfInitialSegment(str1, str2);
            System.out.println("Length of the initial segment: " + result);
        }
    }

