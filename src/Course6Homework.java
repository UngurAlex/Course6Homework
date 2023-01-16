import java.sql.SQLOutput;

public class Course6Homework {
    public static void main(String[] args) {
        //1)
        Person myPerson = new Person(" Andrew ", 20, " is married");
        System.out.println(myPerson.getNameAgeMarried());

        System.out.println("-------++++-----");

        //2)
        Person onePerson = new Person(" Paul ", 25, " blabla ");
        System.out.println(onePerson.getNameAgeMarried());

        Person secondPerson = new Person(" John ", 30, " cricri ");
        System.out.println(secondPerson.getNameAgeMarried());

        Person thirdPerson = new Person(" Sara ", 18, " uau ");
        System.out.println(thirdPerson.getNameAgeMarried());

        System.out.println("-------++++-----");

        //3)
        Product oneProduct = new Product(" Apple ", " 20$ ", 1, "fruits", true, true);

        System.out.println(oneProduct.getNamePriceQuantityCategory());
        if (oneProduct.quantity > 0) {
            System.out.println(oneProduct.hasStock);
        }

        if (oneProduct.category.equals("fruits")) {
            System.out.println(oneProduct.isCategory);
        }

        System.out.println("-------++++-----");

        //4)

        //5)-Sper sa fie bine ce am facut, m-a prins exercitiul acesta putin :)
        Bottle myBottle = new Bottle();
        System.out.println(myBottle.opening());
        System.out.println(myBottle.howMuchLiquid());
        System.out.println(myBottle.remainingCapacity());
        System.out.println(myBottle.openBottle());
        System.out.println(myBottle.closeBottle());
        System.out.println(myBottle.drinks());

        if (myBottle.closeBottle().equals("Bottle is closed")) {
            System.out.println("don't you understand that it's closed?");
        }

        if (myBottle.tryDrink > myBottle.remainingCapacity()) {
            System.out.println("there is not so much drink that you want to drink");
        }

        if(myBottle.openBottle().equals("Bottle is opened")){
            System.out.println("it was opened, don't you understand?");
        }

    }
}
