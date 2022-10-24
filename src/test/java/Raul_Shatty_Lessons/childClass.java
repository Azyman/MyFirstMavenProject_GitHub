package Raul_Shatty_Lessons;

import org.junit.Test;

public class childClass extends parentClass{
    String name = "Child name";
    public void color(){
        System.out.println("Color method");
        System.out.println(super.name);
    }

    //childClass(){}
    //public childClass(){}
    public static void main(String[] args) {
        childClass obj1 = new childClass();
        obj1.color();
        obj1.engine();
    }

    @Test
    public  void arrayExample(){
        int a[][] = {{9,3,5},{7,4,7}};
        for(int x=0;x<=1;x++){
            for(int y=0;y<=2;y++){
                System.out.print(a[x][y]+"\t");
            }
            System.out.println("");
        }
    }
}


