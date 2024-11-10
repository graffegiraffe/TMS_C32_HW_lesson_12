package main.java.by.rublevskaya.model.task1;
/*
Task 1
Write a program that the passed string is a hex code for a color description.
For example, when entering the value #8b2323 into the program, the program should return - Yes.
 */
public class HexColorRun {
    public static void main(String[] args) {
        String[] test = {"#8b2323", "#FF69B4", "#FFB6C1", "#25FG34", "25112005"}; // первые три - цвета, остальное ерунда:)
        HexColorValidator hexColorValidator = new HexColorValidator();
        for (String colorCode : test) {
            System.out.println(colorCode + " " + hexColorValidator.isHexColor(colorCode));
        }
    }
}
