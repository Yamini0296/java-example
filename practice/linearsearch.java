public class LinearSearch{    
public static int linearSearch(int[] arr, int key){    
	int found=0;
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){ 
		found=1;
		break;   
                return i;    
            }  
  
        }   
	if (found==0) 
	{System.out.println("key not found"); }
        return -1;    
    }    
    public static void main(String a[]){    
        int[] a1= {10,20,30,50,70,90};    
        int key = 50;    
    }    
}    