public class Main{
    public static void main(String[] args){

        MathParam.operand = 64;
        MathUtil.sqrt();

        System.out.println("Square root: " + MathParam.result);
    }

}


// tight cupling --> tight coupling is BAD
class MathParam{
    public static double operand;
    public static double result;
}

class MathUtil{     // MathUtil directly depends on MathParams.

    public static void sqrt(){
        MathParam.result = Math.sqrt(MathParam.operand);
    }

}