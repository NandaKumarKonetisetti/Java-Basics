class mathematics {
    int number1;
    int number2;
    public mathematics( int number2, int number1){
        this.number1=number1; // Here this.number1 refers to instance variable and number1 refeers to local variable
        this.number2=number2; // if the instance and local variables has same name at that time we can use "this" keywoed to differentiate instance and local variables

    }

}
 class keyths {
    public static void main (String [] args) {
       
        mathematics ma = new mathematics(7,2);
        System.out.println(ma.number1);
        System.out.println(ma.number2);
    }
    
}