package operators.coding;

public class LoopingExamples {

    public static void main(String[] args) {

        //while loop
        int daysLeft = 3;
        int daysWorked = 0;
        while(daysLeft > 0){
            System.out.println("work");
            daysLeft--;
            daysWorked++;
        }
        System.out.println(daysWorked);

        int energyPointsLeft = 3;
        int hoursLeft = 3;
        int hoursWorked = 0;
        while(energyPointsLeft > 0 || hoursLeft >= 0){
            energyPointsLeft--;
            hoursLeft--;
            hoursWorked++;
        }
        System.out.println(hoursWorked);

        //do while loop
        int count = 0;
        do {
            count++;
        }while(count<5);
        System.out.println(count);

        //for loop
        int sum = 0;
        for (int i=0; i<=5 ; i++){
            sum += i;
        }
        System.out.println("Sum:"+sum);

        //for each loop
        String[] fruits = new String[2];
        fruits[0] = "apple";
        fruits[1] = "orange";
        for(String f: fruits){
            System.out.println(f);
        }
    }
}
