package Raul_Shatty_Lessons;

public class interfaceClass implements testInterface {
    @Override
    public void greenGo() {
        System.out.println("Go gree method");
    }

    @Override
    public void redStop() {
        System.out.println("Red stop method");
    }

    public void yellowWait(){
        System.out.println("Yellow amber method");
    }

    public static void main(String[] args) {
        testInterface obj1 = new interfaceClass();
        interfaceClass obj2 = new interfaceClass();
        interfaceClass obj4 = new interfaceClass() {
            @Override
            public void greenGo() {

            }

            @Override
            public void redStop() {

            }

        };
        testInterface obj3 = new testInterface() {
            @Override
            public void greenGo() {
                System.out.println("Obj3 Go Green");
            }

            @Override
            public void redStop() {

            }

        };

        obj1.greenGo();
        obj2.yellowWait();
        obj3.greenGo();
    }
}
