class Human{

    int age ;
    String name;

    void mobilepriceandname(int a,String b){
      
        System.out.println("price is "+a+" name is "+b);

    }

}

class prob1{
   
    public static void main(String[]args){


       Human h=new Human();

       h.age=22;
       h.name="sandy";
    //    System.out.println("name is "+ h.name + " age is "+ h.age );
      h.mobilepriceandname(22,"sandy");

    }

}