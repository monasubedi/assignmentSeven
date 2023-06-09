package AssignementTwo;

public class Main {
    public static void main(String[]args){
        Computer c1 = new Computer("Apple","Core i5",8,1.6);
        Computer c2 = new Computer("Apple","Core i7",16,1.7);
        Computer c3 = new Computer("Apple","Core i7", 64,2.5);

        boolean isEqualOne = c1.equals(c2);
        boolean isEqualTwo = c2.equals(c3);

        System.out.println("Is computer one and computer two equal " + isEqualOne);
        System.out.println("Is Computer two and computer three equal " + isEqualTwo);

        System.out.println("Computer One " + c1.toString());
        System.out.println("Computer Two " + c2.toString());
        System.out.println("Computer Three " + c3.toString());

        System.out.println(c1.hashCode() == c2.hashCode());
        System.out.println(c2.hashCode() == c2.hashCode());

    }






}
