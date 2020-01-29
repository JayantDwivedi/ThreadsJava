public class Task1 implements Runnable{

    @Override
    public void run()
    {
        for (int i = (int) 'A';i <= (int) 'Z'; i++  )
        {
            System.out.println((char)i);
        }

    }

}