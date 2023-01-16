public class Bottle {
    Integer totalCapacity = 10;
    Integer availableLiquid = 8;
    Integer tryDrink=3;
    boolean open = true;
    boolean close = false;
    String openn="Bottle is opened";
    String closed ="Bottle is closed";

    String case1="don't you understand that it's closed?";



    boolean opening(){
        if (availableLiquid>totalCapacity) {
            return open;
        }else{
            return close;
        }
    }

    int howMuchLiquid(){
        return availableLiquid;
    }

    int remainingCapacity(){
        return totalCapacity-availableLiquid;
    }

    String openBottle(){
    return openn;
    }

    String closeBottle(){
        return closed;
    }
    String drinks(){
        return "Remained liters:" + (availableLiquid-tryDrink);
    }




}
