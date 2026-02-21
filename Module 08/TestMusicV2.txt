/*
Rakesh Raj
3/12/25
This program is to use binary search to search through an array. 
*/
public class TestMusicV2 {

    public static void print(Music[] songs){
        for(int i=0; i<songs.length; i++){
            System.out.println(songs[i].toString());
        }
    }

    public static void binarySearchArtist(Music[] songs, String toFind )
    {
        int high = songs.length;
        int low = -1;
        int probe;

        while( high - low > 1 )
        {
            probe = ( high + low ) / 2;

            if(songs[probe].getArtist().compareTo(toFind) > 0)
                high = probe;
            else
            {
                low = probe;
                if( songs[probe].getArtist().compareTo(toFind) == 0)
                {
                    break;
                }
            }
        }
        
        if( (low >= 0) && (songs[low].getArtist().compareTo(toFind) == 0 ))
        {
            printArtist(songs, low, toFind);
        }
        else
            System.out.println("Did not find songs by " + toFind);
    }
    public static void printArtist(Music[] songs, int low, String toFind)
    {
        int i;
        int start = low;
        int end = low;

        i = low - 1;
        while((i >= 0) && (songs[i].getArtist().compareTo(toFind) == 0))
        {
            start = i;
            i--;
        }
        i = low + 1;
        while((i < songs.length) && (songs[i].getArtist().compareTo(toFind) == 0))
        {
            end = i;
            i++;
        }
        for(i = start; i <= end; i++)
            System.out.println(songs[i]);
    }
    public static void binarySearchYear(Music[] songs, int toFind )
    {
        int high = songs.length;
        int low = -1;
        int probe;

        while( high - low > 1 )
        {
            probe = ( high + low ) / 2;

            if(songs[probe].getYear()<toFind)
                high = probe;
            else
            {
                low = probe;
                if( songs[probe].getYear()==toFind)
                {
                    break;
                }
            }
        }
        
        if( (low >= 0) && (songs[low].getYear() == toFind ))
        {
            printYear(songs, low, toFind);
        }
        else
            System.out.println("Did not find songs released in " + toFind);
    }
    public static void printYear(Music[] songs, int low, int toFind)
    {
        int i;
        int start = low;
        int end = low;

        i = low - 1;
        while((i >= 0) && (songs[i].getYear()==toFind))
        {
            start = i;
            i--;
        }
        i = low + 1;
        while((i < songs.length) && (songs[i].getYear()==toFind))
        {
            end = i;
            i++;
        }
        for(i = start; i <= end; i++)
            System.out.println(songs[i]);
    }
    public static void binarySearchSong(Music[] songs, String toFind )
    {
        int high = songs.length;
        int low = -1;
        int probe;

        while( high - low > 1 )
        {
            probe = ( high + low ) / 2;

            if(songs[probe].getTitle().compareTo(toFind) > 0)
                high = probe;
            else
            {
                low = probe;
                if( songs[probe].getTitle().compareTo(toFind) == 0)
                {
                    break;
                }
            }
        }
        
        if( (low >= 0) && (songs[low].getTitle().compareTo(toFind) == 0 ))
        {
            printArtist(songs, low, toFind);
        }
        else
            System.out.println("Did not find a song named " + toFind);
    }

    public static void sortYear(Music[] songs)
    {
        int i;
        int k;
        int posMax;
        Music temp;

        for( i = songs.length - 1 ; i >= 0 ; i-- )
        {
            posMax = 0;
            for( k = 0 ; k <= i ; k++ )
            {
                if(songs[k].getYear()<songs[posMax].getYear())
                    posMax = k;
            }

            temp = songs[ i ];
            songs[ i ] = songs[posMax ];
            songs[ posMax ] = temp;
        }
    }
    public static void sortArtist(Music[] songs)
    {
        int i;
        int k;
        int posMax;
        Music temp;

        for( i = songs.length - 1 ; i >= 0 ; i-- )
        {
            posMax = 0;
            for( k = 0 ; k <= i ; k++ )
            {
                if(songs[k].getArtist().compareTo(songs[posMax].getArtist()) > 0 )
                    posMax = k;
            }

            temp = songs[ i ];
            songs[ i ] = songs[posMax ];
            songs[ posMax ] = temp;
        }
    }
    public static void sortSong(Music[] songs)
    {
        int i;
        int k;
        int posMax;
        Music temp;

        for( i = songs.length - 1 ; i >= 0 ; i-- )
        {
            posMax = 0;
            for( k = 0 ; k <= i ; k++ )
            {
                if(songs[k].getTitle().compareTo(songs[posMax].getTitle()) > 0 )
                    posMax = k;
            }

            temp = songs[ i ];
            songs[ i ] = songs[posMax ];
            songs[ posMax ] = temp;
        }
    }


    public static void main(String[] args) {
        Music[] songs = new Music[10];

        songs[0] = new Music("Jungle", 2015,"Drake");
        songs[1] = new Music("Count Me Out", 2022,"Kendrick Lamar");
        songs[2] = new Music("4x4", 2025,"Travis Scott");
        songs[3] = new Music("The Resistance", 2010,"Drake");
        songs[4] = new Music("Feel It", 2024,"dv4d");
        songs[5] = new Music("Best I Ever Had", 2009,"Drake");
        songs[6] = new Music("Party in the USA", 2009,"Miley Cyrus");
        songs[7] = new Music("Blinding Lights", 2020,"The Weeknd");
        songs[8] = new Music("Had Enough", 2022,"Don Toliver");
        songs[9] = new Music("Space Cadet", 2018,"Metro Boomin");
        System.out.println("Original List:");
        print(songs);
        System.out.println("\n");
        
        System.out.println("\n\nSearching for songs by The Weeknd: ");
        sortArtist(songs);
        binarySearchArtist(songs, "The Weeknd");
        System.out.println("\n\nSearching for songs by Future: ");
        sortArtist(songs);
        binarySearchArtist(songs, "Future");
        
        System.out.println("\n\nSearching for songs released in 2009: ");
        sortYear(songs);
        binarySearchYear(songs, 2009); 
        System.out.println("\n\nSearching for songs released in 2007: ");
        sortYear(songs);
        binarySearchYear(songs, 2007); 

        System.out.println("\n\nSearching for the song 4x4: ");
        sortSong(songs);
        binarySearchSong(songs, "4x4");
        System.out.println("\n\nSearching for the song I Wonder: ");
        sortSong(songs);
        binarySearchSong(songs, "I Wonder");
    }

}
