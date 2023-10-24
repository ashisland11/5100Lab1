import java.util.ArrayList;

public class ArrayListLab {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Jennie");
        names.add("Lisa");
        names.add("Rose");
        names.add("Jisoo");
        names.add("Andy");
        
        ArrayList<String> switchNames = new ArrayList<>();
        for (String name : names) {
            if (name.length() >= 2) {
                char firstLetter = name.charAt(0);
                char lastLetter = name.charAt(name.length() - 1);
                String middlePart = name.substring(1, name.length() - 1);
                String switchedName = Character.toUpperCase(lastLetter) + middlePart + Character.toLowerCase(firstLetter);
                switchNames.add(switchedName);
            } else {
                switchNames.add(name);
            }
        }

        System.out.println("Names = " + names);
        System.out.println("Names (switched) = " + switchNames);
    }
}
