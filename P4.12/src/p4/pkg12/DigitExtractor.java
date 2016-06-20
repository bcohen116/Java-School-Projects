package p4.pkg12;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ben
 */
public class DigitExtractor
{
   /**
      Constructs a digit extractor that gets the digits
      of an integer in reverse order.
      @param anInteger the integer to break up into digits
   */
   public DigitExtractor(int anInteger)
   {
      integer = anInteger;
      result = 0;
   }

   /**
      Returns the next digit to be extracted.
      @return the next digit
   */
   public double nextDigit()
   {
      result = integer % 10;
      integer = integer / 10;
      return result;
   }

   private int integer;
   private int result;
}

