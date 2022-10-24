package Raul_Shatty_Lessons;

import java.util.ArrayList;

public class thisDemo {
    static int i ;
    static int f ;
    String name;
    String surname;
    static  String village;
    static int a;

    static {//static block for initiallizing static variables
        village = "Madziwa";
        a = 3;
        i = 0;
        f=0;
    }

    public static void anotherExample(){
        System.out.println("Static method");
    }

    public thisDemo(String personName, String personSurname){
        this.name = personName;
        this.surname = personSurname;
        i++;
    }

    public void getData(){
        System.out.println("My name is "+name+" "+surname+" from "+village+" village. I'm number "+i);
    }

    public static void main(String[] args) {

        thisDemo obj1 = new thisDemo("Zilpa","Munyangaro");
        obj1.getData();
        thisDemo obj2 = new thisDemo("Ethel","Munyangaro");
        obj2.getData();
        thisDemo obj3 = new thisDemo("Victoria","Mwomberume");
        obj2.getData();
        thisDemo obj4 = new thisDemo("Tindo","Munanzvu");
        obj2.getData();
        thisDemo obj5 = new thisDemo("Sarah","Munanzvu");
        obj2.getData();
        thisDemo.anotherExample();
        i=4;
        System.out.println(i);
        try{
            //int k=a/f;
           // System.out.println(k);
            int a[] = new int[4];
            a[0] = 2;
            a[2] = 4;
            a[3] = 8;
            a[1] = 16;
            int b[] = {3,5,6,7,8,6,4,67};
            System.out.println("a[3] is "+a[3]);

            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(2);
            //arrayList.add(44,21);
            arrayList.add(0,14);
            arrayList.add(9);
            //System.out.println("arrayList = "+arrayList);
            System.out.println("arrayList index 2 = "+arrayList.get(2));
            System.out.println("Does array list contain 16? "+arrayList.contains(16));
        }
        catch(ArithmeticException exception){
            System.out.println("You cant devide by zero");
        }
        catch (IndexOutOfBoundsException ets){
            System.out.println("Array out of bound");
        }
    }
}
