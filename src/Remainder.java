
class Remainder {

	public static void main(String[] args) {
		int twenty = 20;
        int seven = 7;

        int modulus = twenty % seven; //6
        int quotient = twenty / seven; //2.6

        System.out.println(modulus); //Correct
        System.out.println(quotient); //Incorrect

        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 40L;
        char c = 0176;
        float f = 2.0f;
        double d = 100.0;
        String st = " ";

        byte sum = (byte) (b + s); //30
        short sum2 = (short) (s + i); //50
        int sum3 = (int) (i + l); //70L
        int sum4  = c + b; //~10
        int sum5 = i + b + s + c; //60~
        long sum6 = l + i; //70L
        float sum7 = (float) (f + d); //102.d
        double sum8 = b + s + i + l + f + d; //202.0d
        String concat = st + c; //"~"
        String concat2 = st + l; //"40L"
        double concat3 = i + d; //130.0d

        //predict will it compile? if so, what is the answer
        //add casts to make it all compile

        System.out.println(sum); //Correct 
        System.out.println(sum2); //Correct
        System.out.println(sum3); //Correct
        System.out.println(sum4); //Incorrect
        System.out.println(sum5); //Incorrect                 
        System.out.println(sum6); //Correct                
        System.out.println(sum7); //Correct
        System.out.println(sum8); //Correct
        System.out.println(concat); //Correct
        System.out.println(concat2); //Correct
        System.out.println(concat3); //Correct
	}

}
