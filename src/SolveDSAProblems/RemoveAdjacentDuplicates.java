package SolveDSAProblems;

public class RemoveAdjacentDuplicates {
    public static void main(String[] args) {
        String input = "azxxzy";
        String output = removeAdjacentDuplicates(input);
        System.out.println("Input : " + input);
        System.out.println("Output: " + output);
        String input1 = "caaabbbaac";
        String output1 = removeAdjacentDuplicates(input1);
        System.out.println("Input1 : " + input1);
        System.out.println("Output1: " + output1);

    }

    private static String removeAdjacentDuplicates(String input) {
        StringBuilder result = new StringBuilder();
        if(input == null || input.length() <= 1){
            return input;
        }
        int i =0;
        while(i < input.length()) {
            if (i < input.length() - 1 && input.charAt(i) == input.charAt(i + 1)) {
                char duplicate = input.charAt(i);
                while(i <input.length() && duplicate == input.charAt(i)){
                    i++;
                }

            } else {
                result.append(input.charAt(i));
                i++;
            }
        }
        String cleaned =  result.toString();
        if(cleaned.length() == input.length()){
            return cleaned;
        }else {
            return removeAdjacentDuplicates(cleaned);
        }
    }
}
