package Theater;

public class Main {

    public static void main(String[] args) {

    }


    private  String printTextPerRole(String[] roles, String[] textLines) {
        //String resultString = "", temp1 = "";
        StringBuilder resultString = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        int count = 0;
        for (int i = 0; i < roles.length; i++) {
            resultString.append(roles[i]);
            resultString.append(":\n");

            for (int j = 0; j < textLines.length; j++) {
                if (textLines[j].equals("0"))
                    continue;
                else {
                    //читаю автора
                    while (textLines[j].charAt(count) != ':') {
                        temp.append(textLines[j].charAt(count));
                        count++;
                    }
                    //если нужный автор
                    if (roles[i].equals(temp.toString())) {
                        count = count + 2;
                        resultString.append(j + 1);
                        resultString.append(") ");
                        for (; count < textLines[j].length(); count++) {
                            resultString.append(textLines[j].charAt(count));
                        }
                        resultString.append("\n");
                        textLines[j] = "0";

                    }
                    temp.setLength(0);
                    count = 0;

                }
            }
            resultString.append("\n");

        }
        return resultString.toString();

    }
}