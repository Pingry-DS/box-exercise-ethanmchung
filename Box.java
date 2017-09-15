// The <T> is a generic type
public class Box <T>
{

  private T contents;
  private boolean isFull;

  // Make a new empty box
  public Box()
  {
	super();
	this.isFull = false;
  }

  // Make a new box pre-filled with contents
  public Box(T contents)
  {
  	super();
  	this.isFull = true;
  	this.contents = contents;
  }

  /**
   * Check the contents of the box
   * @return whatever is in the box
   */
  public T getContents()
  {
  	return contents;
  }

  /**
   * Tell whether the box is full or not
   * @return whether box is full
   */
  public boolean isFull()
  {
  	return isFull;
  }

  /**
   * Empty out the box, and give back whatever was in it
   * @return the contents of the box
   */
  public T empty()
  {
  	T junk = contents;
  	contents = null;
  	isFull = false;
  	return junk;
  }
 
  /** 
   * Returns a String of info about the box
   * @return the String of the contents
   */ 
  public String toString()
  {
  	if (isFull)
  		return contents.toString();
  	else
  		return "The box is not full";
  }
  
  /**
   * method adds an item to the box
   * @param contents to be added to the box 
   * @return if the item was successfully added
   */
  public boolean addItem(T contents)
  {
	  if(!isFull)
	  {
		  this.contents = contents;
		  isFull = true;
		  return true;
	  }
	  return false;
  }

  /**
   * main method which initializes boxes to be used when testing the previous methods
   * @param args  Command line arguments
   */
  public static void main(String[] args)
  {

    // Make two boxes
    Box<String> stringBox = new Box<String>();
    // start the second box with contents inside
    Box<Integer> intBox   = new Box<Integer>(10);

    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);

	//test addItem method
    stringBox.addItem("compsci");
	
    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);

   	//"peek" method?
    // View contents
    System.out.println("The boxes contain: " + stringBox.getContents() + ", " + intBox.getContents());

    // Empty boxes
	stringBox.empty();
    intBox.empty();


    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);
  }
}
