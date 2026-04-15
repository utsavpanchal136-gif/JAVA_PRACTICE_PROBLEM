class Table {
    synchronized void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
            try {
                Thread.sleep(300);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println();
    }
}

class Table5 extends Thread {
    Table t;

    Table5(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}

class Table7 extends Thread {
    Table t;

    Table7(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(7);
    }
}

public class P_25 {
    public static void main(String[] args) {
        Table obj = new Table();

        Table5 t1 = new Table5(obj);
        Table7 t2 = new Table7(obj);

        t1.start();
        t2.start();
    }
}
