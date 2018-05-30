//for this lab we only had to provide the method named "findLoopLength"
	
	public static int findLoopLength(LinkedList myList){
        if(myList.isEmpty())
            return 0; 
        Link link = myList.first; 
        int count = 0;
        Link arr[] = new Link[100]; 
        while(link.next != null){
            arr[count] = link; 
            for(int i = 0; i < count; i++) {
                if(arr[i] == link)
                    return count-i; 
            }
            count++; 
            link = link.next;
        }
        return 0; 
   }
}

