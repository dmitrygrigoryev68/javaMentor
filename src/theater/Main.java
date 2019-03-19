package theater;

public class Main {

    public static void main(String[] args) {

        String[] roles = {
                "Городничий", "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String[] textLines = {
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

        for (int i = 0; i < roles.length; i++) {

            System.out.println(printTextPerRole(roles, textLines));
        }
    }

    static String printTextPerRole(String[] roles, String[] textLines) {

        StringBuilder[] tempStringBuildArr = new StringBuilder[roles.length];

        for (int i = 0; i < roles.length; i++) {
            tempStringBuildArr[i] = new StringBuilder(roles[i] + ":\n");
        }

        for (int i = 0; i < textLines.length; i++) {
            for (int j = 0; j < roles.length; j++) {
                if (textLines[i].startsWith(roles[j] + ":")) {
                    tempStringBuildArr[j].append(textLines[i].replaceFirst(roles[j] +
                            ":", (i + 1) + ")") + "\n");
                    break;
                }
            }
        }

        StringBuilder resStringBuild = new StringBuilder("");
        for (StringBuilder r : tempStringBuildArr) {
            resStringBuild.append(r + "\n");
        }

        return resStringBuild.toString();

    }
}