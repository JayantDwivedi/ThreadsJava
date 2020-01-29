public class Main extends Thread {
    public static void main(String[] args) {

         Runnable Task1 = new Thread();
         Runnable Task2 = new Thread();

         Thread t1 = new Thread();
         Thread t2 = new Thread();

         System.out.println(t1.getState());
         System.out.println(t2.getState());

         t1.start();
         System.out.println(t1.isAlive());
         t2.start();

         try
         {
             Thread.sleep(5000);
         }
         catch (InterruptedException ie )
         {
             ie.printStackTrace();
         }


        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        System.out.println(t1.getState());
        System.out.println(t2.getState());

    }
}
