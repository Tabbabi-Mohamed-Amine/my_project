import java.util.Scanner;

public class exercice8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Veuillez saisir une phrase :");
        String ch = s.nextLine();

        String original = ch;  // نحتفظ بنسخة أصلية من الجملة
        String printed = "";   // لتخزين الكلمات التي تمت طباعتها
        int index;
        String word, word2;

        while (ch.indexOf(" ") != -1) {
            // استخراج أول كلمة
            word = ch.substring(0, ch.indexOf(" "));

            // تجاهل الكلمة إن كانت قد طبعت سابقاً
            if (printed.indexOf(word) == -1) {
                word2 = original;
                index = 0;

                // حساب عدد مرات التكرار
                while (word2.indexOf(word) != -1) {
                    index++;
                    word2 = word2.substring(word2.indexOf(word) + word.length());
                }

                System.out.println(word + " : " + index);
                printed += word + " "; // نضيفها إلى قائمة الكلمات المطبوعة
            }

            // حذف الكلمة الأولى + المسافة
            ch = ch.substring(ch.indexOf(" ") + 1);
        }

        // آخر كلمة بعد آخر مسافة
        if (!ch.equals("") && printed.indexOf(ch) == -1) {
            word = ch;
            word2 = original;
            index = 0;
            while (word2.indexOf(word) != -1) {
                index++;
                word2 = word2.substring(word2.indexOf(word) + word.length());
            }
            System.out.println(word + " : " + index);
        }

        s.close();
    }
}
