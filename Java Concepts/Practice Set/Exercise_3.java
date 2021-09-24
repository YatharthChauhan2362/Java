// This Program was Created By Yatharth Chauhan

// 1. Write a Java program to convert a string to lowercase.
// 2. Write a Java program to replace spaces with underscores.
// 3. Write a Java program to fill in a letter template which looks like below:
//    letter = "Dear <|name|>, Thanks a lot"
//    Replace <|name|> with a string (some name)
// 4. Write a Java program to detect double and triple spaces in a string.
// 5. Write a program to format the following letter using escape sequence characters.
//    Letter = "Dear Yatharth, This Java Course is nice. Thanks"

public class Exercise_3 {
    public static void main(String[] args) {

        // Problem 1
        String name = "Riya Chauhan";
        name = name.toLowerCase();
        System.out.println("\nAns1");
        System.out.println(name);

        // Problem 2
        String text = "To My Friend";
        text = text.replace(" ", "_");
        System.out.println("\nAns2");
        System.out.println(text);

        // Problem 3
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Yatharth");
        System.out.println("\nAns3");
        System.out.println(letter);

        // Problem 4
        String myString = "This string contains double and  triple spaces";
        System.out.println("\nAns4");
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        // Problem 5
        String myLetter = "Dear Yatharth, This Java Course is Nice. Thanks!";
        System.out.println("\nAns5");
        System.out.println(myLetter);

    }
}
