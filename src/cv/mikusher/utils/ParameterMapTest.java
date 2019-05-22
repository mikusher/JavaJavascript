package cv.mikusher.utils;

public class ParameterMapTest {

    public static void main(String[] args) {
        ParameterMap pMap = new ParameterMap();


        pMap.add("Age","31");
        pMap.add("Gender","M");
        pMap.add("Son","No");

        System.out.println(pMap.toString());

    }

}
