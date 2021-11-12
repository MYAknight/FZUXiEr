public class MutiThread {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9,11,12,13,14};
        int[] arr2 = {2, 4, 6, 8, 10};
        Muti M1 = new Muti(arr1, arr2);
        C1 c1 = new C1(M1);
        C2 c2 = new C2(M1);
        c1.start();
        c2.start();
    }

}

class C1 extends Thread {
    Muti M1;
    public C1(Muti M1) {
        this.M1 = M1;
    }

    public void run() {
        M1.second(M1.arr2);
    }
}

class C2 extends Thread {
    Muti M1;

    public C2(Muti M1) {
        this.M1 = M1;
    }

    public void run() {
        M1.first(M1.arr1);
    }
}

class Muti {
int [] arr1;
int [] arr2;
    public Muti(int[] arr1, int[] arr2) {
        this.arr1 = arr1;
        this.arr2 = arr2;
    }

    public synchronized void first(int[]arr1) {
        for (int i = 0; i < arr1.length; i++) {
            this.notify();
            System.out.print(arr1[i]+" ");
            try {
                this.wait(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public synchronized void second(int[]arr2) {
        for (int i = 0; i < arr2.length; i++) {
            this.notify();
            try {
                this.wait(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.print(arr2[i]+" ");
        }
    }
}