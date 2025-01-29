public class for_each{
    public static void main(String[] args){
        
        int[] arr1 = {1,2,3,4,5,6,7};

        System.out.print("arr1 : ");
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }

        System.out.print("\narr1 : ");
        for(int i=0; i<arr1.length; i++){
            System.out.print((arr1[i]++) + " ");
        }

        System.out.print("\narr1 : ");
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }


        int[] arr2 = {1,2,3,4,5,6,7};

        System.out.print("\n\narr2 : ");
        for(int x : arr2){
            System.out.print(x + " ");
        }

        System.out.print("\narr2 : ");
        for(int x : arr2){
            System.out.print((x++) + " ");
        }

        System.out.print("\narr2 : ");
        for(int x : arr2){
            System.out.print(x + " ");
        }

    }
}