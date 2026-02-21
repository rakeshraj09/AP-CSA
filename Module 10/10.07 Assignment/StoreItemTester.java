/*
Rakesh Raj
5/3/2025
tis code is to use differnet methhods of sorting
*/
public class StoreItemTester {

    public static void print(StoreItem[] items){
        System.out.printf("%-20s %-8s %7s %7s\n", "Name", "Number", "Price", "Amount");
        System.out.println("----------------------------------------------");
        for(StoreItem i: items){
            System.out.println(i.toString());
        }
        System.out.println("\n");
    }
    public static void selectionSortName(StoreItem[] items, int j)
    {
        int i;
        int k;
        int posMax;
        StoreItem temp;
        if(j == 1){
            for ( i = items.length - 1 ; i >= 0 ; i-- )
            {
                posMax = 0;
                for ( k = 0 ; k <= i ; k++ )
                {
                    if ( items[k].getName().compareTo(items[posMax].getName())>0)
                        posMax = k;
                }
                temp = items[ i ];
                items[ i ] = items[posMax ];
                items[ posMax ] = temp;
            }
        }
        else{
            for ( i = items.length - 1 ; i >= 0 ; i-- )
            {
                posMax = 0;
                for ( k = 0 ; k <= i ; k++ )
                {
                    if (items[k].getName().compareTo(items[posMax].getName())<0)
                        posMax = k;
                }
                temp = items[ i ];
                items[ i ] = items[posMax ];
                items[ posMax ] = temp;
            }
        }
        print(items);
    }

    public static void selectionSortNumber(StoreItem[] items, int j)
    {
        int i;
        int k;
        int posMax;
        StoreItem temp;
        if(j ==1){
            for ( i = items.length - 1 ; i >= 0 ; i-- )
            {
                posMax = 0;
                for ( k = 0 ; k <= i ; k++ )
                {
                    if ( items[k].getNumber()<items[posMax].getNumber())
                        posMax = k;
                }
                temp = items[ i ];
                items[ i ] = items[posMax ];
                items[ posMax ] = temp;
            }
        }
        else{
            for ( i = items.length - 1 ; i >= 0 ; i-- )
            {
                posMax = 0;
                for ( k = 0 ; k <= i ; k++ )
                {
                    if (items[k].getNumber()>items[posMax].getNumber())
                        posMax = k;
                }
                temp = items[ i ];
                items[ i ] = items[posMax ];
                items[ posMax ] = temp;  
            }
        }
        print(items);

    }

    public static void insertionSortPrice(StoreItem[] items, int j)
    {
        StoreItem[] dest = new StoreItem[items.length];
        if(j==1){
            for( int i = 0 ; i < items.length ; i++ )
            {
                StoreItem next = items[ i ];
                int insertIndex = 0;
                int k = i;
                while( k > 0 && insertIndex == 0 )
                {
                    if( next.getPrice() > dest[k-1].getPrice())
                    {
                        insertIndex = k;
                    }
                    else
                    {
                        dest[ k ] = dest[ k - 1 ];
                    }
                    k--;
                }

                dest[ insertIndex ] = next;              
                

            }
        }
        else
        {
            for( int i = 0 ; i < items.length ; i++ )
            {
                StoreItem next = items[ i ];
                int insertIndex = 0;
                int k = i;
                while( k > 0 && insertIndex == 0 )
                {
                    if( next.getPrice() < dest[k-1].getPrice() )
                    {
                        insertIndex = k;
                    }
                    else
                    {
                        dest[ k ] = dest[ k - 1 ];
                    }
                    k--;
                }
    
                dest[ insertIndex ] = next;

            } 
        }
        print(dest);
    }

    public static void mergeSort(StoreItem[] a, int low, int high, int j)
    {
        if( low == high )
            return;

        int mid = ( low + high ) / 2;

        mergeSort( a, low, mid, j);     
        mergeSort( a, mid + 1, high, j);  
        merge( a, low, mid, high, j);      
        
    }

    public static void merge( StoreItem[] items, int low, int mid, int high, int z)
    {
        StoreItem[] temp = new StoreItem[ high - low + 1 ];
        int i = low, j = mid + 1, n = 0;

        while( i <= mid || j <= high )
        {
            if( i > mid )
            {
                temp[ n ] = items[ j ];
                j++;
            }
            else if( j > high )
            {
                temp[ n ] = items[ i ];
                i++;
            }
            else if( items[ i ].getAmount() < items[ j ].getAmount())
            {
                temp[ n ] = items[ i ];
                i++;
            }
            else
            {
                temp[ n ] = items[ j ];
                j++;
            }
            n++;
        }
        for( int k = low ; k <= high ; k++ )
            items[ k ] = temp[ k - low ];
    }

    public static void mergeInv( StoreItem[] items, int low, int mid, int high, int z)
    {
        StoreItem[] temp = new StoreItem[ high - low + 1 ];
        int i = low, j = mid + 1, n = 0;

        while( i <= mid || j <= high )
        {
            if( i > mid )
            {
                temp[ n ] = items[ j ];
                j++;
            }
            else if( j > high )
            {
                temp[ n ] = items[ i ];
                i++;
            }
            else if( items[ i ].getAmount() > items[ j ].getAmount())
            {
                temp[ n ] = items[ i ];
                i++;
            }
            else
            {
                temp[ n ] = items[ j ];
                j++;
            }
            n++;
        }
        for( int k = low ; k <= high ; k++ )
            items[ k ] = temp[ k -low ];
    }

    public static void mergeSortInv(StoreItem[] a, int low, int high, int j)
    {
        if( low == high )
            return;

        int mid = ( low + high ) / 2;

        mergeSortInv( a, low, mid, j);     
        mergeSortInv( a, mid + 1, high, j);  
        mergeInv( a, low, mid, high, j);      
    }

    public static void main(String[] args) {
        StoreItem[] items = new StoreItem[10];
        items[0]=(new StoreItem("Gallon Milk", 1342, 5.99, 14));
        items[1]=(new StoreItem("Dozen Eggs", 4527, 4.99, 43));
        items[2]=(new StoreItem("Ice Cream", 4358, 5.99, 21));
        items[3]=(new StoreItem("Vanilla Yogurt", 6074, 1.99, 43));
        items[4]=(new StoreItem("Cheddar Cheese", 3124, 3.99, 73));
        items[5]=(new StoreItem("Pizza", 4583, 7.99, 21));
        items[6]=(new StoreItem("Butter", 2450, 3.99, 37));
        items[7]=(new StoreItem("Bread", 7678, 0.99, 54));
        items[8]=(new StoreItem("Orange Juice", 1235, 2.99, 76));
        items[9]=(new StoreItem("Cake", 5789, 15.99, 5));
        
        print(items);
        mergeSort(items, 0, items.length-1, 0);
        System.out.println("\n     <<<< After Merge Sorting >>>>");
        System.out.println("<<<< by amount in stock in ascending order >>>>\n");
        for(int i = 0; i < items.length; i++)
            System.out.println(items[i] );

        mergeSortInv(items, 0, items.length-1, 1);

        System.out.println("\n     <<<< After Merge Sorting >>>>");
        System.out.println("<<<< by amount in stock in descending order >>>>\n");
        for(int i = 0; i < items.length; i++)
            System.out.println(items[i] );


        System.out.println("\n     <<<< After Selection Sorting >>>>");
        System.out.println("<<<< by product name in descending order >>>>\n");
        selectionSortName(items, 0);

        System.out.println("\n     <<<< After Selection Sorting >>>>");
        System.out.println("<<<< by product name in ascending order >>>>\n");
        selectionSortName(items, 1);

        System.out.println("\n     <<<< After Selection Sorting >>>>");
        System.out.println("<<<< by product number in stock in acsending order >>>>\n");
        selectionSortNumber(items, 0);

        System.out.println("\n     <<<< After Selection Sorting >>>>");
        System.out.println("<<<< by product number in stock in descending order >>>>\n");
        selectionSortNumber(items, 1);

        System.out.println("\n     <<<< After Insertion Sorting >>>>");
        System.out.println("<<<< by price in descending order >>>>\n");
        insertionSortPrice(items, 0);

        System.out.println("\n     <<<< After Insertion Sorting >>>>");
        System.out.println("<<<< by price in ascending order >>>>\n");
        insertionSortPrice(items, 1);
    }
}
