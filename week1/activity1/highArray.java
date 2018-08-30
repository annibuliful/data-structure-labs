package activity1;

// highArray.java
// demonstrates array class with high-level interface
// to run this program: C>java HighArrayApp
////////////////////////////////////////////////////////////////
class HighArray
   {
   private long[] a;                 // ref to array a
   private int nElems;               // number of data items
   //-----------------------------------------------------------
   public HighArray(int max)         // constructor
      {
      a = new long[max];                 // create the array
      nElems = 0;                        // no items yet
      }
   //-----------------------------------------------------------
   public boolean find(long searchKey)
      {                              // find specified value
      int j;
      for(j=0; j<nElems; j++)            // for each element,
         if(a[j] == searchKey)           // found item?
            break;                       // exit loop before end
      if(j == nElems)                    // gone to end?
         return false;                   // yes, can't find it
      else
         return true;                    // no, found it
      }  // end find()
   //-----------------------------------------------------------
   public void insert(long value)    // put element into array
      {
      a[nElems] = value;             // insert it
      nElems++;                      // increment size
      }
   
   //-----------------------------------------------------------
   public boolean delete(long value)
      {
      int j;
      for(j=0; j<nElems; j++)        // look for it
         if( value == a[j] )
            break;
      if(j==nElems)                  // can't find it
         return false;
      else                           // found it
         {
         for(int k=j; k<nElems; k++) // move higher ones down
            a[k] = a[k+1];
         nElems--;                   // decrement size
         return true;
         }
      }  // end delete()
   //-----------------------------------------------------------
   public void display()             // displays array contents
      {
      for(int j=0; j<nElems; j++)       // for each element,
         System.out.print(a[j] + " ");  // display it
      System.out.println("");
      }
   //-----------------------------------------------------------
   }  // end class HighArray
////////////////////////////////////////////////////////////////
class HighArrayApp
   {
   public static void main(String[] args)
      {
	   HighArray newArray = new HighArray(50);
		
		newArray.insert(2);
		newArray.insert(8);
		newArray.insert(7);
		newArray.insert(24);
		newArray.insert(625);
		System.out.println("List of the array");
		newArray.display();
		boolean findTwentyFour = newArray.find(24);
		if(findTwentyFour == true) {
			System.out.println("Founded 24");
		}else if(findTwentyFour == false) {
			System.out.println("Not founded 24");
		}
		newArray.delete(24);
		System.out.println("List of the array");
		newArray.display();
		boolean findTwentyFourAgain = newArray.find(24);
		if(findTwentyFourAgain == true) {
			System.out.println("Founded 24");
		}else if(findTwentyFourAgain == false) {
			System.out.println("Not founded 24");
		}
		newArray.delete(625);
		newArray.insert(576);
		System.out.println("List of the array");
		newArray.display();
		
		
		// You can do your work here!
      }  // end main()
   }  // end class HighArrayApp
