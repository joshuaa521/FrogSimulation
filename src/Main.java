public class Main {
    public static void main(String[] args) {
        FrogSimulation w = new FrogSimulation(-80, 10);
        System.out.println(w.simulate());
        FrogSimulation L = new FrogSimulation(200, 2);
        System.out.println(L.simulate());
        FrogSimulation f = new FrogSimulation(58, 5);
        System.out.println(f.simulate());
        System.out.println(f.runSimulations(1000));
    }
}