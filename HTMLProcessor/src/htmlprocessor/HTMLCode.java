/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package htmlprocessor;

/**
 *
 * @author 151146
 */
public class HTMLCode 
{
  // precondition:  text is a segment of HTML text which may
  //                contain complete HTML tags; a tag is any
  //                substring starting with < and ending with
  //                the closest >
  // postcondition: returns the first HTML tag found in text
  //                (including the < and > brackets) or null
  //                if no tags are found
    public static String findFirstTag(String text)
    {
        if (text.contains("<") && text.contains(">"))
        {
            int i = text.indexOf("<");
            int i2 = text.indexOf(">", i);
            return text.substring(i, i2 + 1);
        }
        else
            return null;
    }
  // precondition:  str is a non-empty string
  // postcondition: if str is found in text, its first
  //                occurrence is removed from text and
  //                the new string is returned; otherwise
  //                the original string text is returned
  public static String remove(String text, String str)
  {
      if (text.contains(str))
      {
          String s1 = text.replaceAll(str, "");
          return s1;
      }
      else
          return text;
  }
  // precondition:  text is a segment of HTML text which may
  //                contain complete HTML tags
  // postcondition: if all HTML tags in text come in matching
  //                opening-closing pairs, then all the tags are
  //                removed from text and the new text string
  //                is returned; if text has no tags, the
  //                original string text is returned;
  //                throws an IllegalArgumentException if the
  //                tags do not match
  public static String removeAllTags(String text)
  {   
      if (!text.contains("<") || !text.contains(">") || !text.contains("</"))
      {
          return text;
      }
      else
      {              
          int i = 0;
          String newString = text;
          while (newString.contains("<") && newString.contains(">"))  
          {
              String tag1 = HTMLCode.findFirstTag(newString.substring(i));
              if (newString.contains("</" + tag1.substring(1)))
              {
                  newString = HTMLCode.remove(newString, tag1);
                  newString = HTMLCode.remove(newString, "</" + tag1.substring(1));
              }
              else
                  throw new IllegalArgumentException();
          }
          return newString;
      }
  }
}