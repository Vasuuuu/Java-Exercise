class Ping extends Thread{
    public void run(){
    try{
    for(int i=0;i<=5;i++){
        sleep(1000);
        System.out.println("Ping : "+i);
    }
    System.out.println("Exit from Ping.");
    }catch(Exception e){
        
    }
    }
}
class Pong extends Thread{
    public void run(){
    try{
    for(int i=0;i<=5;i++){
        sleep(1000);
        System.out.println("Pong : "+i);
    }
    System.out.println("Exit from Pong.");
    }catch(Exception e){
        
    }
    }
}
class MultithreadPingPong{
    public static void main(String[] args){
        new Ping().start();
        new Pong().start();
    }
}





