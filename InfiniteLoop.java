public class InfiniteLoop{
    public static void main(String[] args) throws InterruptedException{
      do{
          System.out.println("Hello World!");
          Thread.sleep(5*1000);
      }while(true);
    }
}
