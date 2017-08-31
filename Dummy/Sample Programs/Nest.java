class Nest{
   public static void main(String args[]){
	 //Parent try block
     try{
    	//Child try block1
         try{
            System.out.println("1");
            int b =45/5;
            System.out.println(b);
            throw new ArrayIndexOutOfBoundsException("this is too funny");
         }
         catch(ArithmeticException e1){
            System.out.println("2");
         }catch(ArrayIndexOutOfBoundsException aiobe){
             System.out.println(aiobe);
         }finally{
             System.out.println("3");
         }
         //Child try block2
         try{
            System.out.println("4");
            int b =45/0;
            System.out.println(b);
         }
         catch(ArrayIndexOutOfBoundsException e2){
            System.out.println("5");
         }catch(Exception e){
             System.out.println("6");
         }
        System.out.println("7");
        throw new ArrayIndexOutOfBoundsException("this is fully");
    }
    catch(ArithmeticException e3){
    	 System.out.println("9");
         System.out.println("10");
    }
    catch(ArrayIndexOutOfBoundsException e4){
    	System.out.println("11");
         System.out.println("12");
         System.out.println(e4);
    }
    catch(Exception e5){
    	System.out.println("13");
         System.out.println("14");
     }finally{
         System.out.println("15");
     }
     System.out.println("16..");
  }
}