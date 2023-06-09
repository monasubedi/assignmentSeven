public class MyTable {
    Entry[] entries;

    MyTable(){
        entries = new Entry[3];
    }

    private class Entry{
        char c;
        String s;

        Entry(char c, String s){
            this.c = c;
            this.s = s;
        }
        public String toString(){
            return  c + "->" + s;
        }


    }

    public String get(char c){
        String str = null;
       for(Entry e: entries){
           if(e.c == c)  str= e.s;
       }
       return str;
    }

    public void add(char c,String s){

        int chInt = (int)c;
        int address = chInt - 97;
        entries[address] = new Entry(c,s);

    }
    public String toString(){
        String str = "";

        for(Entry e: entries){
            if(e != null){
                str += e.toString() ;
                str += "\n";
            }

        }
        return str;
    }


}
