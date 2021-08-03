import java.util.*;

public class Test {

    public double getProductAPrice( int count_A){
        double price = (count_A/ 4) * 100;
        price =  price + (count_A%4) * 35;

        return price;
    }

     public double getProductBPrice( int count_B){
         double price = count_B * 65;

        return price;
    }
     public double getProductCPrice( int count_C){
           double price = (count_C/6) * 250;
           price = price + (count_C%6) * 50;

        return price;
    }

    public double getProductDPrice( int count_D){
         double price = count_D * 65;

        return price;

    }



    public static void main(String[] args){

        int count_A = 0;
        int count_B = 0;
        int count_C = 0;
        int count_D = 0;
        Test terminal = new Test();
        Scanner scan = new Scanner(System.in);
        String product = scan.nextLine();

        // Isolate each product code into an array

        char[] productArray = new char[product.length()];
  
        
        for (int i = 0; i < product.length(); i++) {
            productArray[i] = product.charAt(i);
        }


        // Get product count for each product code

        for(char productCode : productArray){

            switch (productCode){

                case 'A':
                    count_A = count_A + 1;
                    break;

                case 'B':
                    count_B = count_B + 1;
                    break;

                case 'C':
                    count_C = count_C + 1;
                    break;

                case 'D':
                    count_D = count_D + 1;
                    break;

                default:
                System.out.println("Error: Unknown product code");

            }
        }

        // Calculate the price for each adding to the total price

    double result = 0;

    // count_A price calculation
        result = result + terminal.getProductAPrice(count_A);

    // count_B price calculation
        result = result + terminal.getProductBPrice(count_B);

    // count_C price calculation
        result = result + terminal.getProductCPrice(count_C);

    // count_D price calculation
        result = result + terminal.getProductDPrice(count_D);   
            
            
    System.out.println("Rs " + result);

    }


    
}
