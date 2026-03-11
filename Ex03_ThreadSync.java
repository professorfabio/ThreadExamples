public class Ex03_ThreadSync extends Thread {
   public static int amount = 0;
   public static void main(String[] args) {
       Ex03_ThreadSync thread = new Ex03_ThreadSync();
       thread.start();
       int copyAmount = amount;
       System.out.println("Main: " + copyAmount);
       amount = increment();
       System.out.println("Main: " + amount);
   }
   public void run() {
       System.out.println("2nd Thread: " + amount);
       amount = increment();
       System.out.println("2nd Thread: " + amount);
   }
   public static synchronized int increment(){
       int newAmount = amount;
       try {
           // Pause
           Thread.sleep(500);
       } catch (InterruptedException e) {
           // Handle the case where another thread interrupts the sleep
           System.out.println("Sleep was interrupted: " + e.getMessage());
           Thread.currentThread().interrupt(); // Restore interrupt status
       }
       return newAmount+1;
   }
}
