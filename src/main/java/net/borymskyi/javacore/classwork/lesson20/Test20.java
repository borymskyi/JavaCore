/*
    Урок 20. Всё о классе ArrayList.
    - Создание ArrayList
    - ArrayList methods
    - iterators
    - Object
 */
package main.java.net.borymskyi.javacore.classwork.lesson20;

import java.lang.reflect.Array;
import java.util.*;

public class Test20 {
    public static void main(String[] args) {
//        ArrayList<String> str = new ArrayList<String>();
////        ArrayList<String> str0 = new ArrayList<String>(str);
////        System.out.println(str == str0);    // ссылаются на разные экземпляры.
////        System.out.println(str0.equals(str));
//
////        str.add("test0");
////        System.out.println(str.size());
////        System.out.println(str);
//
//        // методы ArrayList
//        // .add(index, DataType) | .add(DataType) (бекает boolean)
//        str.add("Test");
//        System.out.println(str + " size: " + str.size());
//        str.add("Test2");
//        System.out.println(str + " size: " + str.size());
//        str.add(0, "Test3");
//        System.out.println(str + " size: " + str.size());
//        boolean b0 = str.add("Test4");
//        System.out.println(b0);
//
//        // .get(index) | бекает datatype
//        System.out.println(str.get(0));
//        for (int i = 0; i < str.size(); i++) {
//            System.out.print(str.get(i) + " ");
//        }
//        System.out.println();
//        for (String i : str) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//
//        // .set(index, DataType) | заменяет по индексу, бекает DataType который изменили.
//        String str10 = str.set(0, "Dmytrii");
//        System.out.println(str.get(0));
//        System.out.println(str10);
//        System.out.println();
//        ArrayList<StringBuilder> list = new ArrayList<StringBuilder>();
//        StringBuilder sb0 = new StringBuilder("test0");
//        StringBuilder sb1 = new StringBuilder("test1");
//        list.add(sb0);
//        list.add(sb1);
//        for (int i = 0; i < list.size(); i++) {
//            list.get(i).append("append:)");
//        }
//        System.out.println(list);
//        System.out.println(sb0);
//        System.out.println();
//
//        // .remove(Object element) -> бекает boolean | .remove(index) -> бекает DataType
//        ArrayList<String> list2 = new ArrayList<String>();
//        String str20 = "test0";
//        String str21 = "test1";
//        list2.add(str20);
//        list2.add(str21);
//        for (String i : list2) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        System.out.println(list2.size());
////        String str23 = list2.remove(0);
////        System.out.println(list2.size());
////        for (String i : list2) {
////            System.out.print(i + " ");
////        }
////        System.out.println("\n" + str23);
//        list2.remove("test1");
//        System.out.println(list2);
//        list2.add("test3");
//        boolean b1 = list2.remove("test0");
//        System.out.println(b1);
//        System.out.println(list2);

        // .addAll(ArrayList aL) -> boolean | addAll(index, ArrayList aL) -> boolean
//        ArrayList<String> list5 = new ArrayList<String>();
//        String str5 = new String("first_0");
//        String str6 = new String("first_1");
//        list5.add(str5);
//        list5.add(str6);
//        System.out.println("list5: " + list5);
//        ArrayList<String> list6 = new ArrayList<String>();
//        String str7 = new String("second_0");
//        String str8 = new String("second_1");
//        list6.add(str7);
//        list6.add(str8);
//        System.out.println("list6: " + list6);
//        ArrayList<String> list7 = new ArrayList<String>();
//        String str9 = new String("global_0");
//        String str10 = new String("global_1");
//        list7.add(str9);
//        list7.add(str10);
//        System.out.println("list7: " + list7);
//        list7.addAll(list5);
//        list7.addAll(list6);
////        list7.addAll(1, list6);
//        System.out.println(list7);
//        list5.set(0, "set");
//        System.out.println("list5: " + list5);
//        System.out.println("list7: " + list7);

        // .clear() -> void
//        list7.clear();
//        System.out.println(list7);

        // .indexOf(Objet element) -> int
//        int x = list7.indexOf("global_1");
//        System.out.println(x);

        // .lastIndexOf(Object element) -> int
//        String str20 = new String("global_1");
//        list7.add(str20);
//        int x = list7.lastIndexOf("global_1");
//        System.out.println(x);

        // .size() -> int
//        System.out.println(list7.size());

        // .isEmpty() -> boolean
//        list7.clear();
//        System.out.println(list7.isEmpty());
//        ArrayList<String> list8 = new ArrayList<String>();
//        System.out.println(list8.isEmpty());

        // .contains(Object element) -> boolean
//        System.out.println(list7.contains("global_0"));

        // .toString() -> String
//        System.out.println(list7.toString());
//        System.out.println(list7);

        // методы связанные с ArrayList
        // .clone() -> Object
//        StringBuilder sb0 = new StringBuilder("AWD");
//        StringBuilder sb1 = new StringBuilder("LFG");
//        StringBuilder sb2 = new StringBuilder("Dimoks");
//        ArrayList<StringBuilder> list30 = new ArrayList<>();
//        list30.add(sb0);
//        list30.add(sb1);
//        list30.add(sb2);
//        ArrayList<StringBuilder> list31 = (ArrayList<StringBuilder>)list30.clone();
//        System.out.println(list30);
//        System.out.println(list31);
////        list30.clear();
////        list30.remove(0);
//        list30.get(0).append("awd");
//        list30.set(0, new StringBuilder("set")); // sb 31листа продолжил ссылатся на старое значение.
//        System.out.println(list30);
//        System.out.println(list31);
//        // после клонирования list31, он ссылается на новый обьект в котором хранятся ссылки sb0.sb1.sb2, они ссылкаются на одно общее значение.
//
//        // .toArray() -> Object[]  |  toArray(DataType[] array) -> DataType[]
//        System.out.println();
////        Object[] array1 = list31.toArray();
////        for (Object o : array1) {
////            System.out.print(o + " ");
////        }
//        StringBuilder[] strb1 = list31.toArray(new StringBuilder[4]);
//        for (StringBuilder i : strb1) {
//            System.out.print(i + " ");
//        }
//        list31.get(0).append("AWD"); // strb1 ссылается на новый объект с масивом в котором харнятся новые ссылки(sb0, sb1, sb2), а они ссылаются на те же значения что и элементы list31.
//        System.out.println();
//        for (StringBuilder i : strb1) {
//            System.out.print(i + " ");
//        }
        //(мусор)передал значение листа, массиву без метода toarray
//        System.out.println();
//        StringBuilder[] strb = new StringBuilder[list31.size()];
//        for (int i = 0; i < list31.size(); i++) {
//            strb[i] = list31.get(i);
//            System.out.print(strb[i] + " ");
//        }

        // Arrays.asList(DataTypes []) -> List<DataType>
//        System.out.println();
//        StringBuilder[] sbarray1 = {sb0, sb0, sb1, sb1, sb2, sb2};
//        List <StringBuilder> list40 = Arrays.asList(sbarray1);
//        System.out.println(list40);
//        sbarray1[0] = new StringBuilder("!!!!!"); //работает не так как методы clone и to array
//        System.out.println(list40);

        // Collections.sort(ArrayList<DataType>) -> void
//        System.out.println();
//        String s1 = "A";
//        String s2 = "B";
//        String s3 = "C";
//        String s4 = "D";
//        ArrayList<String> liststr10 = new ArrayList<>();
//        liststr10.add(s2);
//        liststr10.add(s1);
//        liststr10.add(s4);
//        liststr10.add(s3);
//        System.out.println(liststr10);
//        Collections.sort(liststr10);
//        System.out.println(liststr10);

        // equals(ArrayList<DataType>) -> boolean  (метод перезаписан)
//        ArrayList<StringBuilder> arraysb50 = new ArrayList<StringBuilder>();
//        StringBuilder sb10 = new StringBuilder("global");
//        StringBuilder sb11 = new StringBuilder("first");
//        StringBuilder sb12 = new StringBuilder("second");
//        arraysb50.add(sb10);
//        arraysb50.add(sb11);
//        arraysb50.add(sb12);
//        System.out.println(arraysb50);
//        ArrayList<StringBuilder> arraysb51 = new ArrayList<StringBuilder>();
//        StringBuilder sb13 = new StringBuilder("global");
//        StringBuilder sb14 = new StringBuilder("first");
//        StringBuilder sb15 = new StringBuilder("second");
//        arraysb51.add(sb10);
//        arraysb51.add(sb11);
//        arraysb51.add(sb12);
//        System.out.println(arraysb51);
//        System.out.println(arraysb50 == arraysb51);
//        System.out.println(arraysb51.equals(arraysb50));

        // Iterator .hasNext() = проверяет есть ли дальше элемент |  .next() = выдает элемент
//        System.out.println();
//        Iterator<StringBuilder> it = arraysb51.iterator();
//        while (it.hasNext()) {
//            System.out.print(it.next() + " ");
//        }

//        System.out.println();
//        ListIterator<StringBuilder> it = arraysb51.listIterator();
//        while (it.hasNext() ) {
//            System.out.print(it.next() + " ");
//        }

//        System.out.println();
//        ListIterator<StringBuilder> it = arraysb51.listIterator();
//        while (it.hasNext() ) {
//            it.next();
//            it.remove();
//        }
//        System.out.println(arraysb51);

        // .compare метод из 11 джавы
//        int [] array1 = {1, 2, 3, 4, 5};
//        int [] array2 = {1, 2, 3, 5};
//        char [] array3 = {'p', 'r', 'i', 'v', 'e', 't'};
//        char [] array4 = {'p', 'r', 'i', 'v', 'i', 'v', 'k', 'a'};
//        System.out.println(Arrays.compare(array, array2)); //result: -1 (так как ар1 меньше ар2). (ар1 в словаре идет раньше чем 1.2.3.5) (когда больше 1). (когда одинаковы = 0).

        // .mismatch находит первый индекс расхождения
//        System.out.println(Arrays.mismatch(array, array2));

        // removeAll(Colletion <> c) -> boolean  в нашем лите будут удалены все элементы которые находятся в укзаном аррлисте.
        ArrayList<String> arraystr0 = new ArrayList<String>();
        arraystr0.add("awdx");
        arraystr0.add("awdxx");
        arraystr0.add("awdxxx");
        arraystr0.add("awdxxxx");
        ArrayList<String> arraystr1 = new ArrayList<String>();
        arraystr1.add("awdx");
        arraystr1.add("awdxx");
//        arraystr1.add("awdyyy");
//        arraystr1.add("awdyyyy");
        arraystr1.add("awdxxx");
        arraystr1.add("awdxxxx");

//        arraystr0.removeAll(arraystr1);
//        System.out.println("arraystr0: " + arraystr0);

        // .retainAll(Colletion <> c) -> boolean  (наоборот). удаляет все элементы которые не сходятся.
//        arraystr0.retainAll(arraystr1);
//        System.out.println(arraystr0);

        // .containsAll(Collection<> c) -> boolean
//        boolean result = arraystr0.containsAll(arraystr1);
//        System.out.println(result);

        // .subList(int fromIndex, int toIndex) -> List<E>
//        List <String> liststr0 = arraystr0.subList(0, 2);
//        System.out.println(liststr0);
//        System.out.println(arraystr0);
//        liststr0.subList(0,1).clear();  // удаляет указаные элементы ...
//        System.out.println(liststr0);
//        System.out.println(arraystr0);

        // .toArray() -> Object[]
//        Object [] array = arraystr0.toArray();

        // .toArray(T[] a) -> T []
//        String[] arraystr = arraystr0.toArray(new String[arraystr0.size()]);
//        for (String i : arraystr) {
//            System.out.print(i + " ");
//        }

        // jdk 11
        // List.of(E ... elements) -> List<E>
        // List.copyOf(Collection<E> c) -> List<E>

//        Map<Integer, String> map = new HashMap<>();
//        map.put(100, "test0");
//        map.put(101, "test1");
//        map.put(102, "test2");
//        map.put(103, "test3");
////        map.put(103, "test4");
//        map.put(104, "test4");
//        System.out.println(map);
        //89
    }
}
