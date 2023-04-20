package code;

public class main{
    public static void main(String[] args){
        System.out.println("hello");
        int abc=123;

        int xyz=456;
        
        System.out.println("Changing this line from my side");
        
        for(int i=0; i<abc; i++){
            System.out.println(abc);
        }
        binarySearch bs=new binarySearch();
        bs.searchEle=1;
        System.out.println("Finding serach ele b/w 0 and 10");
        System.out.println(bs.binaryserachfn(0, 10));
    }
}


class binarySearch{
    public int searchEle=0;
    public int binaryserachfn(int low,int high){
        int mid=(low+high)/2;
        if(searchEle==mid){
            System.out.println("Found search ele"+searchEle);
            return searchEle;
        }
        if(searchEle <mid)
        {   
            System.out.println("Calling with mid-1");
            return binaryserachfn(low, mid-1);
        }else{
            System.out.println("calling with mid+1");
            return binaryserachfn(mid+1, high);
        }

      
    }
}