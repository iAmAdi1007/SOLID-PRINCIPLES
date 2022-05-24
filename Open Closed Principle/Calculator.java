// class Calculator{

//     /*Suppose we have this class and we need to add the functionality of multiplication, so what we ideally do is add another case, but that violates the Open Closed Principle.

//     What we should ideally do is create an Interface as Calculator and write an abstract method calculate. Now classes implementing this method would ideally have to define the unimplemented methods which would satisfy that the entitity is "Open for Extension but closed for modification"


//     */
//     public double calculate(int operandOne, int operandTwo, char operator) {
//         switch(operator){
//             case '+' : return operandOne + operandTwo;
//             case '-' : return operandOne - operandTwo;
//             case '/' : return operandTwo == 0 ? 0 : (operandOne / operandTwo);
//             default : return 0;
//         }
//     }  
// }



// CORRECT IMPLEMENTATION

public interface Calculator{
    public double calculate(int operandOne, int operandTwo);
}
