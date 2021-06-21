class GfG
{
	boolean isBinary(String str)
	{
	  String s[]=str.trim().split("");
        //System.out.println(str);
	  for(String element: s){
	      if( !element.equals("0") && !element.equals("1")) {
	        //System.out.println("dhe"+element);
	        return false;
	      
	      }
	  }
	  return true;
	}
}
