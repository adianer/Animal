public abstract class Animal {
    public String type="";
    public  Animal(){

    }
    public  Animal(String a){
        this.type=a;
    }
    public void capture(){
        System.out.println("锁定目标");
    }
    public  abstract void say();
}
