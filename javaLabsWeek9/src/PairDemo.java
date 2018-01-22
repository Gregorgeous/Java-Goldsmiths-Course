public class PairDemo {
    public static void main (String [] args){
        PairG<Integer> pair1 = new PairG<>(3, 4);
        System.out.println(pair1.getFirst());
        System.out.println(pair1.getSecond());
        System.out.println(pair1.swap());
        System.out.println(pair1.getFirst());
        System.out.println(pair1.getSecond());
        PairGTwo<Integer, Double> pair2 = new PairGTwo<Integer, Double>(20, 20.00);
        System.out.println(pair2.getFirst());
        System.out.println(pair2.getSecond());
        System.out.println(pair2.swap());
        System.out.println(pair2.getFirst());
        System.out.println(pair2.getSecond());
    }
}
