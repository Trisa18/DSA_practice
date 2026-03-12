public class AppearsTwice {
    public static void main(String[] args) {
        int [] arr={1,5,2,1,3,5,2};
        System.out.println(find(arr));

    }

    static int find(int [] arr){
        int xor=0;
        for (int i = 0; i < arr.length; i++) {
            xor=xor^arr[i];
            System.out.println(xor);

        }
        return xor;

        }
    }


