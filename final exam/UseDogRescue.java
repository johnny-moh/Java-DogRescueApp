import java.util.*;
public class UseDogRescue
{
static DogRescue dog;
public static void main(String[] args)
{

int x = 0 , i = 0 , j = 0, z = 0;
int dogEntered = 0;
int selectedItem;
double vetPlus = 0;
double vetAvg = 0;
double foodPlus = 0;
double foodAvg = 0;
String name;


Scanner input = new Scanner(System.in);
DogList dogList = new DogList();


System.out.println("*************************************" + "\n" + "*********** Dog Rescue Manu *********** \n *************************************");

do
{

System.out.println(" 1.Add a Dog \n 2.Display Dogs \n 3.Display AVG Costs \n 4.Quit");
System.out.println("Select a Menu Item >>");
 selectedItem = input.nextInt();
if( selectedItem== 1){
dog = new DogRescue();
input.nextLine();

   
   System.out.println("Enter Dog's Name: ");
   name = input.nextLine();
      if(name.length() == 0)
   {
    System.out.println("name field should not be empty");
    break;
   }
   else
   {
   dog.setName(name);
   }
   System.out.println("Enter Vet's Cost: ");
   dog.setVetCost(input.nextDouble());
   System.out.println("Enter Food's Cost: ");
   dog.setFoodCost(input.nextDouble());
   dogList.setDog(dogEntered,dog);
   dogEntered++;


}
else if(selectedItem == 2)
{

try{
   System.out.println("*************** Dogs ***************");
for(i =0; i< 5; i++)
{
  System.out.println(dogList.getDog(i).getName());
}
}catch(Exception e){}
System.out.println("**************************");
x = 4;

}
else if(selectedItem == 3){
try{
for(j = 0; j< 5; j++)
{
   vetPlus = vetPlus + dogList.getDog(j).getVetCost();
   foodPlus = foodPlus + dogList.getDog(j).getFoodCost();
}
}catch(Exception e){}
   vetAvg = vetPlus/ j-1;
   foodAvg = foodPlus/j-1;
   System.out.println("*************** Average Costs ***************");
   System.out.println(" there are " + j +" dogs" + "\n Avg Vet Cost: " + vetAvg + "\n Avg Food Cost: " + foodAvg);
   System.out.println("**************************");
   x = 4;
}
else if(selectedItem == 4){
x = 4;
}

}
while(x != 4);


}
}