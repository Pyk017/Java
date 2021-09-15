public class Finalize {
    public static void main(String[] args) {

        Finalize obj = new Finalize();

        System.out.println("HashCode of finalize :- " + obj.hashCode());

        obj = null;

        //? Calling the garbage collector using System.gc()
        System.gc();

        System.out.println("End of Garbage Collector !");
    }

    protected void finalize() {
        System.out.println("Calling the finalize() method!");
    }

}
