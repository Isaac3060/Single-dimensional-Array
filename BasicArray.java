//A class that prints a list of arrays, adds the list and prints the maximum value in the list
public class BasicArray {

    
    public static void main(String[] args) {
  
        double[]myList = {1.2, 2.3, 3.4, 4.5, 5.6, 6.7, 7.8, 8.9};
        printValues(myList);
        sumValues(myList);
        maxValue(myList);
        
    }
    
    private static void printValues(double[]myList){
        
        for(int i=0;i<myList.length;i++){
            System.out.println(myList[i]);
        }
     
    }
    
    private static void sumValues(double[]myList){
        double sum=0;
        for(int i=0; i<myList.length; i++){
        
            sum+=myList[i];
     
    }
        System.out.println("The sum of the array is " +sum);
    }
    
    private static void maxValue(double[]myList){
        double max =0;
        for(double value:myList){
            if(value>max){
                max=value;
            }
            
            
        }
        
        System.out.println("The maximum value is " +max);
        
    }
            
}
