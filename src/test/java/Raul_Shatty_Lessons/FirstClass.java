package Raul_Shatty_Lessons;

import org.junit.Test;

import java.util.ArrayList;

public class FirstClass {

    public void getData(){
        System.out.println("I am in first method");
    }
    public static void main(String Args[]){
        FirstClass obj1 = new FirstClass();
        //obj1.getData();
        FirstClass obj2 = new FirstClass();
        //obj2.secondMethod();
        SecondClass obj3 = new SecondClass();
        //obj3.secondClass_Method();
        FirstClass ifElse_Obj = new FirstClass();
        ifElse_Obj.ifElse();
    }

    public void secondMethod(){
        System.out.println("Am now in second method");
        String a = "Hello";
        String ab = new String("Hello");
        System.out.println(a==ab);//false
        System.out.println(a.equals(ab)+" last");//true
    }

    public void ifElse(){
        /*
        if (5>3){
            System.out.println("Success");
            System.out.println("Second line");
        }
        else
            System.out.println("Fail");*/
        for (int i=0;i<=3;i++){
            if(i==2){
                System.out.println("2 is displayed");
            }
            else System.out.println("I did not find");
        }
    }

    @Test
    public void String_Immutable(){
        String a = "hello";
        StringBuffer s = new StringBuffer("hello");
        String b = new String("hello");
        String c = "Hello";
        String s1 = new String("hello");
        a.concat(" world");
        s.append(" world");
        System.out.println(a.concat(" "+b));
        System.out.println(a);
        System.out.println(s);
        System.out.println(s.replace(2,6,"a"));
        System.out.println(a.substring(2));
        System.out.println(s.substring(2));
        System.out.println(a.equalsIgnoreCase(b));//true as the contents are the same
        System.out.println(a==b);//false because b is created using string class so its a new and different object all together
        System.out.println(a==c);//false. this is called reference comparison i.e. are these variables refering to the same object or not. Same object if the contents are exactly the same otherwise diff objects
        System.out.println(a.equalsIgnoreCase(c));
    }

    @Test
    public void forLoopExample(){
        int k = 1;
        for(int i=0;i<=4;i++){
            for(int j=1;j<=4-i;j++) {
                System.out.print(k+" ");
                k++;
            }
            System.out.println("");
        }
    }

    @Test
    public void forLoopExamplePyramid(){
        int k = 3;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++) {
                System.out.print(k+" ");
                k=k+3;
            }
            System.out.println("");
        }
    }

    @Test
    public void forLoopExampleReset(){
        for(int i=1;i<=4;i++){
            for(int j=i;j<=i;j++) {
                for(int k=1;k<=i;k++) {
                    System.out.print(k + " ");
                }
                System.out.println("");
            }
        }
    }

    @Test
    public void whileExample(){
        int i=0;
        while(i<=10){
            System.out.print(i);
            i++;
        }
    }

    @Test
    public void doWhileExample(){
        int j=20;
        do
        {
            System.out.println(j);
            j++;
        }while(j<1);
    }

    @Test
    public void minNum(){
        int arr[][] = {{-6,4,0},{3,1,-19},{2,2,-1}};
        int a = arr[0][0];
        for(int i=0; i<3; i++){
            for(int j=0; j<3 ;j++){
                for(int k=1 ;k<=2 ;k++) {
                    if (arr[i][j] <= a)
                        a = arr[i][j];
                }
            }
        }
        System.out.println("The smallest number is "+a);
    }

    @Test
    public void maxNum(){
        int arr[][] = {{-6,24,0},{3,50,9},{2,2,10}};
        int a = arr[0][0];
        for(int i=0; i<3; i++){
            for(int j=0; j<3 ;j++){
                for(int k=1 ;k<=2 ;k++) {
                    if (arr[i][j] >= a)
                        a = arr[i][j];
                }
            }
        }
        System.out.println("The maximum number is "+a);
    }

    @Test
    public void uniqueNum() {
        int array[] = {2, 2, 4};
        ArrayList<Integer> bucket = new ArrayList<Integer>();
        int i;
        int counter = 1;
        //2 is 2 times, 4 is 3 times ...introduce arrayList, fill with only unique numbers to print results
        for (i = 0; i < array.length; i++) {

            for (int k = i + 1; k <= array.length-i; k++) {
                int arraySort = array[i];
                if (arraySort == array[k]) {
                    counter++;

                }
            }
            if (bucket.isEmpty())
                bucket.add(array[i]);
            if (!bucket.contains(array[i]))
                bucket.add(array[i]);
        }

        System.out.println(array[i] + " is " + counter + " times.");
        bucket.clear();
        //counter = 1;


    }
    @Test
    public void arrayList(){
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("Mombe");
        arrList.add("Huku");
        arrList.add("Hwai");
        arrList.add("Mbudzi");
        arrList.add("Matoki");
        arrList.add(("Hangaiwa"));
        arrList.add("Hanga dzemadododo");

        System.out.println("zvipfuyo zvandinazvo pamusha wangu zvinoti "+arrList+".");
        System.out.println(("Asi chipfuyo chandonyanyodisisa chinonzi "+arrList.get(2)));
        System.out.println((arrList.contains("Huku")));
        System.out.println("Uyezve mbudzi dzakadyiwa nemapere saka ndakudzibvisa palist rangu "+arrList.remove("Mbudzi")+" saka ndasarirwa neizvi chete "+arrList);
        System.out.println("Saka ini ndine mhando "+arrList.size()+" dzezvipfuyo.");

    }
}

