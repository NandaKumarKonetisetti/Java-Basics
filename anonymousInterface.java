interface India {
    void findlocation(); // we are declaring the method inside an interface then by default it is an abstract class 

}





public class anonymousInterface {
    public static void main(String args[]){
    India obj = new India()
                    {
                        public void findlocation(){
                            System.out.println("I am in India");
                        }


                  };
                obj.findlocation();
    
    }
    
}