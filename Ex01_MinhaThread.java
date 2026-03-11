public class Ex01_MinhaThread extends Thread{
    public Ex01_MinhaThread (String nome){
        super(nome);
    }
    @Override
    public void run(){
        System.out.println("Início: " + getName());
        for(int i=0; i<5; i++){
            System.out.println(i + "-" + getName());
        }
        System.out.println("Fim: " + getName());
    }
    public static void main(String[] args){
        Ex01_MinhaThread thread1 = new Ex01_MinhaThread("MinhaThread");
        Ex01_MinhaThread thread2 = new Ex01_MinhaThread("MinhaThread2");
        thread1.start();
        thread2.start();
    }
}
