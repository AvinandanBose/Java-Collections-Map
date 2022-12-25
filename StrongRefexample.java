
class ex{
    public void finalize(){
        System.out.println("Finalize method called");
    }
}
 class example {
    public static void main(String[] args) {
        ex obj = new ex();
        obj.finalize();
        obj = null;
        System.gc();//Garbage Collector
        obj.finalize();//will not call finalize method
    }
    
    
}
