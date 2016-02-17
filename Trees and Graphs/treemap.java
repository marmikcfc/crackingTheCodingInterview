Collection c = treeMap.values();

    //obtain an Iterator for Collection
    Iterator itr = c.iterator();

    //iterate through TreeMap values iterator
    while(itr.hasNext())
      System.out.println(itr.next());