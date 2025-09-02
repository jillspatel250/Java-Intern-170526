import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetDemo {
    //its is not sync
    //it is hightly performace java collection member
    //faster the HashSet

     //why this is faster then HashSet because that is
    //all the operation aer implemented using bitwise arithmatic operations..

    enum Lang{
        JAVA,C,JAVASCRIPT,PYTHON,RUBY
    }


    public static void main(String[] args) {

        EnumSet<Lang> langs=EnumSet.allOf(Lang.class);//I WANT ALL OF ELEMENT FROM LANG ENUM in langs var
        System.out.println(langs);

        //empty enum set
        EnumSet<Lang> l=EnumSet.noneOf(Lang.class);//I WANT NONE OF ELEMENT FROM LANG ENUM in langs var
        System.out.println(l);

        //range(e1,e2);
        EnumSet<Lang> enums=EnumSet.range(Lang.JAVA,Lang.PYTHON);
        System.out.println(enums);

        //of:
        EnumSet<Lang> JavaEnum=EnumSet.of(Lang.JAVA);
        System.out.println(JavaEnum);

        EnumSet<Lang> multipleEnum=EnumSet.of(Lang.JAVA,Lang.RUBY);
        System.out.println(multipleEnum);

        //add and addAll:
        EnumSet<Lang> lang1=EnumSet.allOf(Lang.class);
        EnumSet<Lang> lang2=EnumSet.noneOf(Lang.class);
        lang2.add(Lang.JAVASCRIPT);
        lang2.addAll(lang1);
        System.out.println(lang1);

        //how to iterate EnumSet
        EnumSet<Lang> fullLang=EnumSet.allOf(Lang.class);
        Iterator<Lang> it=fullLang.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //remove and removeAll()
        EnumSet<Lang> newLang=EnumSet.allOf(Lang.class);
        System.out.println(newLang);

        boolean b=newLang.remove(Lang.C);
        System.out.println(b);
        System.out.println(newLang);





    }
}
