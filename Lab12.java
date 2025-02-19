class Lab12 { 

   
    public static void main(String as []){ 
     
    double d=9.9; 
    int arr1[]=new int[d];   
    System.out.println(arr1.length); 
     
    float f=5.5F; 
    int arr2[]=new int[f];   
    System.out.println(arr2.length); 
     
    long x=99L; 
    int arr3[]=new int[x];   
    System.out.println(arr3.length); 
     
    } 
    }

    // error because the array size should be an integer value.
    // error: incompatible types: possible lossy conversion from double to int