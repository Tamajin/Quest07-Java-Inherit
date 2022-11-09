public class Hangar {

    public static void main(String[] args) {
        Car tesla = new Car("Tesla", 0);
        Boat vogueMerry = new Boat("Vogue Merry", 0);

        System.out.println(tesla.doStuff() + " ou pas...");
        System.out.println(vogueMerry.doStuff() + " en recherchant le One Piece");
    }
}