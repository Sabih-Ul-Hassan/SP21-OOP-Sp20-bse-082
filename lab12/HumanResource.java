package lab12;

import java.util.ArrayList;

public class HumanResource {
//    Association pA[];
    ArrayList<Association> aL= new ArrayList<Association>();
    public  void add(Association p) {
/*            extend();
        pA[pA.length-1]=p;*/
        aL.add(p);
    }
    private   void extend() {
/*        if(pA==null) pA= new Association[1];
        else{
            Association temp[] = new Association[pA.length+1];
            for (int i = 0; i < pA.length; i++) {
                temp[i]=pA[i];
            }
            pA=temp;
        }*/
    }
    public void display() {
        /*for (Association x: pA) {
            if(x!=null) System.out.println(x);
        }*/
    }
    public boolean delete(Association p){
/*        Association temp[] = new Association[pA.length-1];
        boolean deleted=false;
        try{// if no object is deleted; then an exception, index out of bound, will occur.
            for(int i=0,j=0; i< pA.length;i++) {
            if(pA[i].equals(p)){
                deleted=true; continue;
            }
            temp[j]=pA[i];
            j++;
        }}
        catch (Exception ex){;}
        if(deleted) pA=temp;
        return deleted;*/
        return aL.remove(p);
    }

    @Override
    public String toString() {
        /*String toStr = new String();
        for (Association x:   pA) {
            toStr+=x+"\n";
        }
        return toStr;
        */
        return aL.toString();
    }
}

