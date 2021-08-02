public class StringFunctions {

    //Return String Reversal
    public String stringReverse(String str)
    {
        char[] arr=str.toCharArray();
        int l=0,r=arr.length-1;
        while(l<r)
        {
            char temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        return new String(arr);
    }

    //Return Length of the String
    public int lengthString(String str)
    {
        return str.length();
    }
}
