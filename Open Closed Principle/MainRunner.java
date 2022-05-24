class MainRunner{
    public static void main(String args[]){
        Add add = new Add();
        int operandOne = 10;
        int operandTwo = 20;
        System.out.println(add.calculate(operandOne, operandTwo));
    }
}