public class HelloPartial {

    public void main(String[] args) {
        System.out.println("Make prints in different methods to simulate partial commits.");
        methodA();
    }

    private void methodA(){
        System.out.println("methodA");
    }

    private void methodB(){
        System.out.println("methodB");
    }

    private void methodC(){
        System.out.println("methodC");
    }

}
