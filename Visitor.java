//@author Stan Bozhinov cs349 task5
//=============================================================================================================================================================
public class Visitor
{
   private final StringBuilder _stream = new StringBuilder();

   // ---------------------------------------------------------------------------------------------------------------------------------------------------------
   /**
    * Creates a visitor.
    */
   public Visitor()
   {
   }

   // ---------------------------------------------------------------------------------------------------------------------------------------------------------
   /**
    * Appends a string to the text stream being built.
    * 
    * @param text - the text
    */
   public void append(final String text)
   {
      assert (text != null);

      _stream.append(text);
   }

   // ---------------------------------------------------------------------------------------------------------------------------------------------------------
   /**
    * Gets the text stream being built.
    * 
    * @return the stream
    */
   public StringBuilder getStream()
   {
      return _stream;
   }
}
