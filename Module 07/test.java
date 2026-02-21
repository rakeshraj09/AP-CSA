public class test {
public static void sort(String[] arr) {
    for (int pass = arr.length - 1; pass >= 1; pass--) {
        String large = arr[0]; int index = 0;
        for (int k = 0; k <= pass; k++) {
            if ((arr[k].compareTo(large)) > 0) {
                large = arr[k]; index = k;
                } 
            } 
        arr[index] = arr[pass]; arr[pass] = large; 
        for(int i = 0; i < arr.length; i++) {System.out.println(arr[i]);}
        }
    }

public static void main(String[] args) {
    sort(new String[]{"Ann", "Mike", "Walt", "Lisa", "Shari", "Jose", "Mary", "Bill"});
}
}
