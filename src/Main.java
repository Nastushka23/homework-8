public class Main {
    public static void main(String[] args){
        task1();
        task2();



    }
    private static void task1(){
        System.out.println("Задача 1");
        int [] number=new int [12];
        number[0]=1;
        number[1]=2;
        number[2]=3;
        for(int i=0; i<number.length; i++){
            System.out.println(number[i]);
        }
        double [] weight=new double[]{1.57,7.654, 9.986,0,0,0,0,0,0};
        for ( int j=0; j< weight.length; j++) {
            System.out.println(weight[j]);
        }


        int [] basket= new int[]{12,15,25};
        for (int c=0;c<basket.length; c++){
            System.out.println (basket[c]);
        }

    }
    private static void task2(){
        System.out.println("Задача 2");
        int [] number=new int [12];
        number[0]=1;
        number[1]=2;
        number[2]=3;
        for(int i=0; i<number.length;i++){
            if(i==number.length-1);
            System.out.print(number[i]+" ");
        }
        System.out.println();





    }

}