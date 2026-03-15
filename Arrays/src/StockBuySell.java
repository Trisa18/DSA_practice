public class StockBuySell {
    public static void main(String[] args) {
        int [] arr={7,1,5,3,6,4};

        System.out.println(findProfit(arr));
        System.out.println(calcProfit(arr));


        int [] arr2={7,6,4,3,1};
        System.out.println(calcProfit(arr2));
        System.out.println(calcProfit(arr2));


    }
    static int findProfit(int [] arr){
        int maxprofit=0;
        for (int i = 0; i < arr.length ;i++) {
            for (int j = i+1; j < arr.length; j++) {
                int profit=arr[j]-arr[i];
                if(profit>maxprofit)maxprofit=profit;
            }

        }
        return maxprofit;


    }

    static int calcProfit(int [] arr){
        int min=Integer.MAX_VALUE;
        int max=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<min) min=arr[i];
            int profit=arr[i]-min;
            if(profit>max)max=profit;

        }
        return max;
    }

}
