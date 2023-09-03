public class SplitText {

    public static void main(String[] args) {
        String text = "Snow on the ground. Snow on the tree. Snow on the house. Snow on me!";
        System.out.println(splitTextIntoWords(text));
    }
    public static String splitTextIntoWords(String text) {
        //TODO: Сделать новый текст с помощью sBuilder и потом только замениить все на \n
        StringBuilder sBuilder = new StringBuilder();
        String regex = "[^a-zA-Z]";
        String nt = text.replaceAll(regex," ");
        String newText = "";
        String trim = nt.trim() + " ";
        int start = 0;
        while (start <= trim.lastIndexOf(" ")) {
            int end = trim.indexOf(" ", start);
            String word = trim.substring(start, end);
            if (word.equals("")){
                start = end + 1;
            } else {
                sBuilder.append(" " + word);
                start = end + 1;
            }
        }
        newText = sBuilder.toString().trim();
        return newText.replaceAll(regex,"\n");
    }
}
