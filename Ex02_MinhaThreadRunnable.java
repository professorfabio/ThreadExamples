public class Ex02_MinhaThreadRunnable implements Runnable{
    private String nome;
    public Ex02_MinhaThreadRunnable (String nome){
        this.nome = nome;
    }
    @Override
    public void run(){
        System.out.println("Início: " + this.nome);
        for(int i=0; i<5; i++){
            System.out.println(i + " - " + this.nome);
        }
        System.out.println("Fim: " + this.nome);
    }
    public static void main(String[] args){
        Ex02_MinhaThreadRunnable runnable1 = new Ex02_MinhaThreadRunnable("MinhaThread1");
        Ex02_MinhaThreadRunnable runnable2 = new Ex02_MinhaThreadRunnable("MinhaThread2");
        Thread thread1 = new Thread(runnable1, runnable2.nome);
        Thread thread2 = new Thread(runnable2, runnable2.nome);
        thread1.start();
        thread2.start();
    }
}