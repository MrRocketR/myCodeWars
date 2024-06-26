package ranks.Kyu7;

public class SequenceSum {

    public static String showSequence(int value) {

        if (value < 0) {
            return String.format("%s<0", value);
        }
        if (value == 0) {
            return "0=0";
        }
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= value; i++) {
            if (i == value) {
                sum = sum + i;
                sb.append(i);
                break;
            }
            sum = sum + i;
            sb.append(i);
            sb.append("+");

        }
        sb.append(" = ");
        sb.append(sum);
        return sb.toString();
    }

    public static String showSequence2(int value) {

        if (value < 0)
            return value + "<0";

        if (value == 0)
            return "0=0";

        int sum = 0;
        String result = "0";

        for (int i = 1; i <= value; i++) {
            result += "+" + i;
            sum += i;
        }

        return result += " = " + sum;
    }
}