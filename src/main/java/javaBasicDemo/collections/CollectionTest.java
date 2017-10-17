package javaBasicDemo.collections;

import java.util.*;

/**
 * @author JHMI on 2017/8/17.
 */
public class CollectionTest {


    public static void main(String args[]){
        HashMap map = new HashMap();
        map.put("test","test ans");
        map.put("test","test ans11111111");
        map.put(null,"test null");
        map.put("null test",null);

        map.put("null test","123123");
        Iterator iterator = map.entrySet().iterator();
        getValue(iterator);
        Map table = new Hashtable();
        table.put("test table","test ans");
        table.put("test table","test ans11111111");
        table.put("null","test null");
        //table.put(null,"123");
        Iterator tableIterator = table.entrySet().iterator();
        getValue(tableIterator);

        Map synMap = Collections.synchronizedMap(map);
        Iterator syn = synMap.entrySet().iterator();
        getValue(syn);


        /**
         * vector / arraylist������
         */

        Vector vector = new Vector();

        vector.add("123");

        vector.remove("123");
        //1��Vector����ָ����ʼ����Ĵ�С�ͼ�������
        //2��Vector�ķ�����ArrayList90%���ƣ�������������ͬ����
        Vector vector1 = new Vector(20,20);
        //ArrayList����ָ����ʼ����Ĵ�С
        ArrayList arrayList = new ArrayList(20);
        /**
         *
         */
        LinkedList linkedList = new LinkedList();
        linkedList.add("asd");
        linkedList.add(0,"0");
        linkedList.add(1,"1");
        linkedList.add(3,"3");
        System.out.println("----");
        for (Object s: linkedList ) {
            System.out.println(s);
        }

    }

    public static void getValue(Iterator iterator){
        Map.Entry tableEntry;
        System.out.println("---------------------");
        while (iterator.hasNext()){
            tableEntry = (Map.Entry) iterator.next();
            String name = (String) tableEntry.getKey();
            String value = (String) tableEntry.getValue();
            System.out.println(name+"="+value);
        }
    }
    public static void getLinkedValue(Iterator iterator){
        System.out.println("---------------------");
        while (iterator.hasNext()){
            String value = (String) iterator.next();
            System.out.println("="+value);
        }
    }

}
