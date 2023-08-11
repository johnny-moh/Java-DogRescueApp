public class DogList 
{

 private DogRescue[] dog = new DogRescue[5];
 
  public void setDog(int x,DogRescue d)
 {
     dog[x] = d;
  }
  
  public DogRescue getDog(int y)
 {
 return dog[y];
  }

}